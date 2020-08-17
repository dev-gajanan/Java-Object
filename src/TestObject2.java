/**
 * 
 * @author Gajanan Mallik
 * Fullstack Developer
 * Object and Class Example: Initialization through method
 * In this example Objects of student class initialize the value through a setter method and display the same using display method
 */
class MyStudent {
	int id;
	String name;
	
	//setter method
	void setStudentInfo(int i, String n) {
		id = i;
		name = n;
	}
	
	//display info
	void displayStudentInfo() {
		System.out.print("Student id: " + id + " and name: " + name + "\n");
	}
}

public class TestObject2 {
	public static void main(String[] args) {
		MyStudent s1 = new MyStudent();
		MyStudent s2 = new MyStudent();
		s1.setStudentInfo(1, "Gajanan Mallik");
		s2.setStudentInfo(2, "John Deo");
		s1.displayStudentInfo();
		s2.displayStudentInfo();
	}	
}
