class ExceptionTest12 
{
	public static void main(String[] args) 
	{
		try
		{
			int n1=Integer.parseInt(args[0]);
			try
			{
				int n2=Integer.parseInt(args[1]);
				int n3=n1/n2;
				System.out.println(n3);
			}
			catch (ArithmeticException a)
			{
				System.out.println(a);
			}
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
		}
	}
}
