class Printer 
{
	synchronized void print(String msg)
	{
		for(int i=1;i<=10;i++)
			System.out.println(msg);
	}
}
class PrintThread extends Thread
{
	Printer	 p;
	String msg;
	PrintThread(Printer p,String msg)
	{
		this.p=p;
		this.msg=msg;
	}
	public void run()
	{
		p.print(msg);
	}
}
class PrintServer
{
	public static void main(String[] args) 
	{
		Printer p=new Printer();
		PrintThread t1=new PrintThread(p,"sashi");
		PrintThread t2=new PrintThread(p,"kunal");
		t1.start();
		t2.start();
	}
}
