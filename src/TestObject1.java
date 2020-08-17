class Student {
	int id;
	String name;
	
}
public class TestObject1 {
	public static void main(String[] args) {
		Student studentOne = new Student();
		studentOne.id = 001;
		studentOne.name = "Gajana Mallik";
		System.out.print("Student name of Id: " + studentOne.id + " is " + studentOne.name);
	}
}
