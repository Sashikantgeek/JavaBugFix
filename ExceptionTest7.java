import java.util.*;
class  	ExceptionTest7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any two arguments");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		try{
			if(n1==0||n1==0	)
				throw new ArithmeticException();
			else
				System.out.println(n1*n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot multiply number with zero");
		}
	}
}
