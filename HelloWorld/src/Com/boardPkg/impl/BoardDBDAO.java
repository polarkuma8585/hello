package Com.boardPkg.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Com.boardPkg.common.DAO;
import Com.boardPkg.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;  //DB의 값을 받아오는 객체
	PreparedStatement pstmt = null;  // 캐시를 이용해 DB의 쿼리을 담는 객체

	public void eraseBoard1(BoardDB board) { // 메소드에 댓글 존재유무 체크 및 삭제. 
		conn = DAO.getConnect();
		List<BoardDB> list = getReplyList(board.getBoard_no());
		if (list.size() > 0) {
			System.out.println("댓글이 존재합니다.");
		} else {
			String sql = "delete from boards where board_no = ?";

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBoard_no());

				int r = pstmt.executeUpdate();
				System.out.println(r + "건이 삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public boolean checkForReply(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards" + " where orig_no = ?";
		int rnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rnt = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rnt > 0)
			return true;
		else
			return false;

	}

	public void deleteBoard2(BoardDB board) { // 삭제 구문만 존재. checkForReply 메소드를 통해 댓글유무 체크.
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoard_no());
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public boolean checkResponsibility(BoardDB board) {
		conn = DAO.getConnect();
		String sql = " select count(*) as cnt from boards \r\n"
				+ " where orig_no is null and board_no = ? and writer = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoard_no());
			pstmt.setString(2, board.getWriter());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (result > 0) {
			return true;

		} else {
			return false;
		}
	}

	public void updateBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "update boards set orig_no = orig_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ",title= ? ";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ",content=? ";
		}
		sql += "where board_no = ? and orig_no is null";
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContent() != null && !board.getContent().equals("")) {
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoard_no());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void InsertReply(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards(board_no,content, writer, creation_date, orig_no)"
				+ "values((select max(board_no)+1 from boards),?, ?, sysdate,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getContent());
			pstmt.setString(2, board.getWriter());
			pstmt.setInt(3, board.getOrigNo());
//			pstmt.setInt(4, reNo.getOrigNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<BoardDB> getList() {
		conn = DAO.getConnect();
//		String sql = "select * from boards where orig_no is null order by board_no desc";
		String sql = "select board_no, title, content, writer, creation_date, orig_no,"+
		            "get_reply_cnt(b.board_no) as reply_count from boards b"; 
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title")+"("+rs.getString("reply_count")+")");
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				list.add(board);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = ?";
		List<BoardDB> list = new ArrayList<>();
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}

	public BoardDB getBoard(int boardNo) {
		BoardDB board = null;
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
				board.setBoard_no(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setCreationDate(rs.getString("creation_date"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return board;
	}

	public String getUserName(String id, String pass) {
		conn = DAO.getConnect();
		String sql = "select * from user_login where id = ? and passwd = ?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return name;
	}

	public void InsertBoardDBProc(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards(board_no, title, content, writer, creation_date, orig_no)\r\n"
				+ "values((select max(board_no)+1 from boards),?,?,?,sysdate, null)";// board_seq.nextval - 새로운 글의 테이블
																						// 안에 있는 다음 번호를 자동으로 넣어줌. DB시퀀스
		int rCnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
//				pstmt.setInt(1, board.getBoard_no()); // 자동으로 다음 값이 들어감.
			pstmt.setString(++rCnt, board.getTitle());
			pstmt.setString(++rCnt, board.getContent());
			pstmt.setString(++rCnt, board.getWriter());
//			pstmt.setInt(4, board.getOrigNo()); // 일반 글이기때문에 null값을 넣어줌.
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
