class NumThread extends Thread 
{
	public void run()
	{
		for (int i=1;i<=10 ;i++ )
		   System.out.println(getName()+"="+i);
	}
}
class ThreadTest2
{
	public static void main(String[] args) 
	{
		NumThread t1=new NumThread();
		NumThread t2=new NumThread();
		t1.setName("sashikanta");
		t2.setName("sahoo");
		t1.start();
		t2.start(); 
	}
}
