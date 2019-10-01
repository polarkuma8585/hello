package Com.Yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Worker("직장인1"));
		personCourse.add(new Student("학생1"));
		personCourse.add(new HighStudent("고등학생1"));

		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인2"));

		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생3"));
		studentCourse.add(new HighStudent("고등학생3"));

		Course<HighStudent> highCourse = new Course<>("고등학생과정", 5);
		highCourse.add(new HighStudent("고등학생4"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		
		
		// <? extends Student>
		registerStudent(studentCourse);
		registerStudent(highCourse);
		
		// <? super Worker>
		registerWorker(personCourse);
		registerWorker(workerCourse);

	}
	public static Course<? super Worker> getCourse(){
		Course<Person> coursePerson = new Course<>("일반인과정", 5);
		Course<Worker> courseWorker = new Course<>("직장인과정", 5);
		Course<Student> courseStudent = new Course<>("학생과정", 5);
		Course<HighStudent> courseHigh = new Course<>("고등학생과정", 5);
		return courseWorker;
	}
	
	public static void registerWorker(Course<? super Worker> course) {
		//Worker 클래스에 상속해주는 쿨래스만 매개값으로 받을 수 있다. (Worker클래스 포함) 
		System.out.println("과정명: "+ course.getName()+ ", 수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		//Student 클래스를 상속하는 클래스만 매개값으로 받을 수 있다. (Student클래스 포함)
		System.out.println("과정명: "+ course.getName()+ ", 수강생: "
							+ Arrays.toString(course.getStudents()));
	}
	public static void registerCourse(Course<?> course) {
		System.out.println("과정명: "+ course.getName()+ ", 수강생: "
							+ Arrays.toString(course.getStudents()));
		
		
	}
	
}
