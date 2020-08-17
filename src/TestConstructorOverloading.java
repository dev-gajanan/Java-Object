class Employee {
	int empId;
	String empName;
	String deptName;
	
	//creating two arg constructor
	Employee(int id, String name){
		empId = id;
		empName = name;
	}
	
	//creating three arg constructor
	Employee(int id, String name, String dept){
		empId = id;
		empName = name;
		deptName = dept;
	}
	
	//display info
	void displayInfo() {
		System.out.print("\nEmployee Details \n");
		System.out.print(empId + " " + empName + " " + deptName);
	}
}


public class TestConstructorOverloading {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "John Deo");
		e1.displayInfo();
		Employee e2 = new Employee(1003, "Smith Roy", "Product Development");
		e2.displayInfo();
	}

}
