class Employee 
{
	private int empno;
	private String ename;
	void setEmpno(int empno)
	{
		this.empno=empno;
	}
	void setEname(String ename)
	{
		this.ename=ename;
	}
	 int getEmpno()
	{
		 return empno;
	}
	String getEname()
	{
		return ename;
	}
}
class SalariedEmployee extends Employee
{
	private float salary;
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	float getSalary()
	{
		return salary;
	}
}
class Inheritance
{
	public static void main(String[] args) 
	{
		SalariedEmployee emp1=new SalariedEmployee();
		emp1.setEmpno(11111);
		emp1.setEname("sashikanta");
		emp1.setSalary(10000f);
		System.out.println(emp1.getEmpno());
	System.out.println(emp1.getEname());
System.out.println(emp1.getSalary());
	}
}