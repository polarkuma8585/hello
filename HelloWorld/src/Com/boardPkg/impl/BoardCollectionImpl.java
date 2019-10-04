package Com.boardPkg.impl;

import java.util.ArrayList;
import java.util.List;

import Com.boardPkg.model.Board;
import Com.boardPkg.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boardTemp = board;
			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> listTemp = new ArrayList<>();
		for (Board board : boards) {
			listTemp.add(board);
		}
		return listTemp;
	}

	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boards.remove(board);
			}
		}

	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board boardTemp : boards) {
			if (board.getBoardNo() == boardTemp.getBoardNo()) {
				boardTemp.setTitle(board.getTitle());
				boardTemp.setContents(board.getContents());
				boardTemp.setWriter(board.getWriter());
			}
		}

	}
}
