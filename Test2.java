class C 
{
	int x;
	static int y;
}
class Test2
{
	public static void main(String[] args) 
	{
		C obj1 =new C();
		C obj2=new C();
		obj1.x=10;
		obj2.y=20;
		System.out.println(obj1.x);
		System.out.println(obj2.y);
		System.out.println(obj1.y);
		System.out.println(obj2.x);
	}
}
