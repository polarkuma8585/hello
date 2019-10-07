package Com.boardPkg.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Com.boardPkg.impl.EmployeeServiceImpl;

import Com.boardPkg.model.Employee;
import Com.boardPkg.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
	List<Employee> employees = new ArrayList<>();

//	BoardService service = new BoardServiceImpl();
	EmployeeService service = new EmployeeServiceImpl();

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
//				sc.nextLine();
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
//		Board board = new Board(boardNo, title, content, writer);
//		service.updateBoard(board, boardAry);

	}

	public void writeBoard() {

		System.out.println("직원등록.");
		System.out.print("직원번호입력: ");
		int empId = sc.nextInt();
		sc.nextLine(); // nextInt에 엔터가 포함되어 있기 때문에 엔터를 소진할 수 있는 nextLine 를 추가해줘야함.

		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("이메일을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요.");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("JobId를 입력하세요.");
		String jobId = sc.nextLine();
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate); //2010-10-05 날짜포맷
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);
	}

	public void getBoard() {
		System.out.println("게시글 번호를 입력하세요.");
		int boardNo = sc.nextInt();
//		Board board = service.getBoard(boardNo, boardAry);
//		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(
//						boardAry[i].getTitle() + "," + boardAry[i].getContents() + "," + boardAry[i].getWriter());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글 조회");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {

			System.out.println(employee);
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
//		service.deleteBoard(boardNo, boardAry);

//		Board board = service.deleteBoard(boardNo, boardAry);
		System.out.println(boardNo + " 번 게시글이 지워졌습니다.");
	}
}
