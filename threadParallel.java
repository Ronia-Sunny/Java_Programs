package Day5Programs;
//to run 2 processes parallely or shared thread
class runParallel extends Thread
{
	Thread t;
	String threadname;
	
	runParallel(String tname)
	{
		threadname = tname;
		System.out.println("Thread Name: " + threadname);
	}

	public void run()
	{
		int i;
		for(i=0;i<=50;i++)
		{
			System.out.println("Thread Name: " + threadname);
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void start()
	{
		t = new Thread(this, threadname);
		t.start();
	}
}

public class threadParallel {

	public static void main(String[] args) 
	{
		runParallel t1 = new runParallel("p1");
		runParallel t2 = new runParallel("p2");
		t1.start();
		t2.start();
	}

}
