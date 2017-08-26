interface Move
{
	void left();
	void right();
}
class Circle implements Move
{
	public void left()
	{
		System.out.println("Circle moves left....");
	}
	public void right()
	{
		System.out.println("circle moves right....");
	}
}
class Dog implements Move
{
	public void left()
	{
		System.out.println("Dog moves left");
	}
	public void right()
	{
		System.out.println("Dog moves right");
	}
}
class Test7
{
	public static void main(String args[])
	{
		Move m;
		m=new Circle();
		m.left();
		m.right();
		m=new Dog();
		m.left();
		m.right();
	}
}