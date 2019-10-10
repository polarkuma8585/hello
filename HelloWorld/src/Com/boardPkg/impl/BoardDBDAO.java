package Com.boardPkg.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.boardPkg.common.DAO;
import Com.boardPkg.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

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
