class StringTest10 
{
	public static void main(String[] args) 
	{
		String str="java php oracle";
		int index=str.indexOf("php");
		String str1=str.substring(index);
		System.out.println(str1);
		String str2=str.substring(index,index+3);
		System.out.println(str2);
	}
}
