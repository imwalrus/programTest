package test2;

public class Employee {
	private int empId;
	private String name;
	private String hireDate;
	private String dept;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, String hireDate, String dept, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.hireDate = hireDate;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

}
