class ExceptionTest3 
{
	public static void main(String[] args) 
	{
		System.out.println("inside main method");
		try
		{
			System.out.println("inside try block");
			int n=Integer.parseInt(args[0]);
			System.out.println(n);
		}
		catch (NumberFormatException e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		System.out.println("continue........");
	}
}
