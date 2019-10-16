package Com.Yedam.collections.test;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentnum, String name) {
		this.studentNum = studentnum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (std.studentNum == studentNum)
				;
			return true;
		} else {
			return false;
		}
	}
}
