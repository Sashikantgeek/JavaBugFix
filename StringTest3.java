import java.util.*;
class  	 StringTest3
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any string");
		String str=scan.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count =count+1;
		}
		System.out.printf("\n count of vowels %d",count);
		
	}
}
