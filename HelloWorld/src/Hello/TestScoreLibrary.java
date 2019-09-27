package Hello;

public class TestScoreLibrary {
	private int studentno;
	private String name;
	private int korean;
	private int english;
	private int math;
	private int sum;

	public TestScoreLibrary(int studentno, String name, int korean, int english, int math) {
		super();
		this.studentno = studentno;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;

	}

	public int getStudentno() {
		return studentno;
	}

	public void setStudentno(int studentno) {
		this.studentno = studentno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int korean, int english, int math) {
		this.sum = sum;
		sum = korean + english + math;

	}

}
