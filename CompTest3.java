import java.util.*;
class Address 
{
	private String street;
	private String city;
	void readAddress()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input street name");
		street=scan.next();
		System.out.println("input city name");
		city=scan.next();
	}
	void printAddress()
	{
		System.out.println(street);
		System.out.println(city);
	}
}
class Person
{
	private String name;
	Address add[]=new Address[2];
	Person()
	{
		add[0]=new Address();
		add[1]=new Address();
	}
	void readName()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input name");
		name=scan.next();
	}
	void printName()
	{
		System.out.println(name);
	}
}
class CompTest3
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.readName();
		for(int i=0;i<2;i++)
			p1.add[i].readAddress();
		p1.printName();
		for(int i=0;i<2;i++)
			p1.add[i].printAddress();
		
	}
}
