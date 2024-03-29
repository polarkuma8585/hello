package Com.boardPkg.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Com.boardPkg.impl.BoardDBServiceImpl;
import Com.boardPkg.model.BoardDB;
import Com.boardPkg.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	List<BoardDB> boardDB = new ArrayList<>();
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {

		loginCheck();

		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성|2.게시글 리스트 |3.글 조회|4.댓글 조회 |5.댓글 추가|6.수정| 7.삭제 |8.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("게시글을 작성합니다.");
				insertBoard();
			} else if (menu == 2) {
				System.out.println("게시글 리스트를 불러옵니다.");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("글 조회.");
				getBoard();
			} else if (menu == 4) {
				System.out.println("댓글 조회.");
				getReply();
			} else if (menu == 5) {
				System.out.println("댓글 추가.");
				insertReply();
			} else if (menu == 6) {
				System.out.println("글을 수정합니다.");
				reWriteBoard();
			} else if (menu == 7) {
				System.out.println("글을 삭제합니다.");
				deleteBoard();
			} else if (menu == 8) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}

	public void loginCheck() {
		while (true) {
			System.out.println("ID를 입력하세요.");
			String id = sc.nextLine();
			System.out.println("PASSWORD를 입력하세요.");
			String pass = sc.nextLine();
			String name = service.logCheck(id, pass);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("ID와PASSWORD를 다시 입력해 주세요.");
			}

		}
	}

	public void insertBoard() {
		System.out.println("게시글 등록");
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = sc.nextLine();
//		System.out.println("작성자를 입력하세요.");
//		String writer = sc.nextLine();
//		System.out.println("댓글 번호를 입력하세요.");
//		int replyNo = sc.nextInt();
//		sc.nextLine();
		BoardDB brd = new BoardDB();

		brd.setTitle(title);
		brd.setContent(content);
		brd.setWriter(loginId);
//		brd.setOrigNo(replyNo);
		service.insertBoard(brd);

	}

	public void getBoardList() {
		List<BoardDB> brd = service.getBoardList();
		for (BoardDB bbd : brd) {

			System.out.println(bbd);
		}
	}

	public void getBoard() {
		System.out.println("글 조회");
		System.out.println("조회할 글 번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// -- 원본글
		System.out.println("------------[원본글]------------");
		BoardDB board = service.getBoard(boardNo);
		System.out.println("제목: " + board.getTitle());
		System.out.println("내용: " + board.getContent());
		System.out.println("작성자: " + board.getWriter());
		System.out.println("작성일자: " + board.getCreationDate());
		// -- 댓글
		System.out.println("------------[댓   글]------------");
		List<BoardDB> list = service.getReply(boardNo);
		for (BoardDB brd : list) {
			System.out.println("-> " + brd.getBoard_no() + "|" + brd.getContent() + "|" + brd.getCreationDate());
		}
		System.out.println("------------------------------");
		System.out.println("1.댓글 작성 2.이전메뉴");
		int subMenu = 0;
		subMenu = sc.nextInt();
		if (subMenu == 1) {
			System.out.println("댓글 입력: ");
			BoardDB board1 = new BoardDB();
			String reply = sc.nextLine();
			board1.setContent(reply);
			board1.setOrigNo(boardNo);
			board1.setWriter(loginId);
			service.insertReply(board1);
			System.out.println("댓글 입력 완료");
		} else {
			return;
		}

	}

	public void getReply() {

	}

	public void insertReply() {
		System.out.println("댓글 등록");
		System.out.println("댓글을 등록할 글 번호를 입력해주세요.");
		int replyNo = sc.nextInt();
		sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = sc.nextLine();

		BoardDB brd = new BoardDB();
		brd.setContent(content);
		brd.setWriter(loginId);
		brd.setOrigNo(replyNo);
		service.insertReply(brd);
	}

	public void reWriteBoard() {
		System.out.println("변경할 글 번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목 변경: ");
		String title = sc.nextLine();
		System.out.println("내용 변경: ");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();
		board.setBoard_no(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);

		service.updateBoard(board);

	}

	public void deleteBoard() {
		System.out.println("삭제할 글 번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();

		BoardDB board = new BoardDB();

		board.setBoard_no(boardNo);
		board.setWriter(loginId);
		System.out.println("B no: "+ board.getBoard_no());
		System.out.println("B writer: "+ board.getWriter());
		System.out.println("B content: "+ board.getContent());
		
		service.deleteBoard(board);

	}
}
