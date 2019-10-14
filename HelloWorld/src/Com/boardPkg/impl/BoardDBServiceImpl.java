package Com.boardPkg.impl;

import java.util.List;

import Com.boardPkg.model.Board;
import Com.boardPkg.model.BoardDB;
import Com.boardPkg.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String logCheck(String id, String passwd) {
		String name = dao.getUserName(id, passwd);
		return name;
//		return dao.getUserName(id, passwd);
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.InsertBoardDBProc(board);
	}

	@Override
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = dao.getList();
		return list;
	}

	@Override
	public BoardDB getBoard(int boardNo) {

		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {

		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.InsertReply(board);
	}

	@Override
	public void updateBoard(BoardDB board) {
//		dao.updateBoard(board);
		// 해당 글에 대한 권한 확인.
		if (dao.checkResponsibility(board)) {
			dao.updateBoard(board);
			System.out.println("변경되었습니다");
		} else {
			System.out.println("해당 글에 대한 권한이 없습니다.");
		}
	}

	@Override
	public void deleteBoard(BoardDB board) {
//		dao.eraseBoard(board);
		if (dao.checkResponsibility(board)) {
			if (!dao.checkForReply(board.getBoard_no())) {
				dao.deleteBoard2(board);

				System.out.println("글이 삭제 되었습니다.");
			} else {
				System.out.println("댓글이 존재합니다.");
			}
		} else {
			System.out.println("해당 글에 대한 권한이 없습니다.");
		}
	}

}
