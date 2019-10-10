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
			System.out.println("1.게시글 작성|2.게시글 리스트 |3.한건 조회|4.댓글 조회 |5.댓글 추가|6.수정| 7.삭제 |8.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("게시글을 작성합니다.");
				insertBoard();
			} else if (menu == 2) {
				System.out.println("게시글 리스트를 불러옵니다.");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("한건 조회.");
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

	}

	public void getBoard() {

	}

	public void getReply() {

	}

	public void insertReply() {

	}

	public void reWriteBoard() {

	}

	public void deleteBoard() {

	}
}
