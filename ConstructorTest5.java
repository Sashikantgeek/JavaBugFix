class Employee
{
	private int empno;
	private String name;
	private float salary;
	Employee(int empno,String name,float salary)
	{
		this.empno=empno;
		this.name=name;
		this.salary=salary;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	void printEmployee()
	{
			System.out.println(empno);
			System.out.println(name);
			System.out.println(salary);
	}
}
class ConstructorTest5
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(101,"sashikanta",10000f);
		emp1.printEmployee();
		emp1.setSalary(20000f);
		emp1.printEmployee();
		Employee emp2=new Employee(102,"kunal",15000f);
		emp2.printEmployee();
	}
}
