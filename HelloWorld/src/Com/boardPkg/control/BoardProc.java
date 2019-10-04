package Com.boardPkg.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Com.boardPkg.impl.BoardCollectionImpl;
import Com.boardPkg.impl.BoardServiceImpl;
import Com.boardPkg.model.Board;
import Com.boardPkg.model.BoardCollection;
import Com.boardPkg.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1. 작성  2. 단건조회 3. 전체 조회 4. 삭제  5. 수정  6. 종료");
			int menu = 0;
//			try {
				menu = sc.nextInt(); // error 발생 가능한 곳.
				sc.nextLine();
//			} catch (Exception e) {
//				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
//				e.printStackTrace();
			
				
//			}
//			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				deleteBoard();
			} else if (menu == 5) {
				updateBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void updateBoard() {
		System.out.println("변경할 글번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 제목: ");
		String title = sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = sc.nextLine();
		System.out.println("변경할 작성자: ");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, content, writer);
		service.updateBoard(board, boardAry);

	}

	public void writeBoard() {

		System.out.print("게시글번호를 입력하세요.");
		int boardNo = sc.nextInt();
		sc.nextLine(); // nextInt에 엔터가 포함되어 있기 때문에 엔터를 소진할 수 있는 nextLine 를 추가해줘야함.

		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);

		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}

	public void getBoard() {
		System.out.println("게시글 번호를 입력하세요.");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(
//						boardAry[i].getTitle() + "," + boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글 조회");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			if (brd != null)
				System.out.println(brd);
		}

	}

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getBoardNo() + ","
//						+ boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	public void deleteBoard() {
		System.out.println("지우실 게시글 번호를 입력하세요.");
		int boardNo = sc.nextInt();
		service.deleteBoard(boardNo, boardAry);

//		Board board = service.deleteBoard(boardNo, boardAry);
		System.out.println(boardNo + " 번 게시글이 지워졌습니다.");
	}
}
