package Com.Yedam;

public class Member {
	private int id;
	private String name;
	private String classname;

	Member() {
	}

	public Member(int id, String name, String classname) {
		super();
		this.id = id;
		this.name = name;
		this.classname = classname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}
