class Employee {
	int empId;
	String empName;
	String deptName;
	
	//creating two arg constructor
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	//creating three arg constructor
	Employee(int empId, String empName, String deptName){
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
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
