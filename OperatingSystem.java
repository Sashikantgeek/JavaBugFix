import java.util.*;
interface Driver
{
	void connect();
}
class HPDriver	implements Driver
{
	public void connect()
	{
		System.out.println("connected to HP Printer");
	}
}
class SonyDriver implements Driver
{
	public void connect()
	{
		System.out.println("connected to SonyPrinter");
	}
}
class OperatingSystem
{
	public static void main(String args[])throws Exception
	{	 
		Scanner scan=new Scanner(System.in);
		System.out.println("input Driver Name");
		String name=scan.next();
		Driver d=(Driver)Class.forName(name).newInstance();
		d.connect();
		}
}
	
