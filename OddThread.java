class EvenThread extends Thread 
{
	public void run()
	{
		for (int i=1;i<=20 ;i++ )
		{
			if (i%2==0)
			System.out.println(getName()+"="+i);
		}
	}
}
class OddThread
{
	public static void main(String[] args)throws Exception 
	{
		EvenThread e=new EvenThread();
		e.setName("Even");
		e.start();
		e.join();
		Thread o=Thread.currentThread();
		o.setName("Odd");
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
				System.out.println(o.getName()+"="+i) ;
		}
	}
}
