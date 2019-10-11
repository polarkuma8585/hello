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
		dao.updateBoard(board);
	}

	@Override
	public void deleteBoard(int boardNo) {

	}

}
