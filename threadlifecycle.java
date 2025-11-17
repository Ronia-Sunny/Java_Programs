package Day5Programs;

class testinglifecycle extends Thread
{
	Thread t;
	String threadname;
	testinglifecycle(String tname) 
	{
		threadname = tname;
		System.out.println("Thread Name " + threadname + "Status : New");
	}
	
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Thread Name: " + threadname + " is running ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread Name: " + threadname + " dead ");
	}
	
	public void start()
	{
		t = new Thread(this,threadname);
		t.start();
	}
}

public class threadlifecycle {

//	private static testinglifecycle t1;
//	private static testinglifecycle testinglifecycle;
//	private static Day5Programs.testinglifecycle t2;

	public static void main(String[] args) 
	{
		testinglifecycle t1  = new testinglifecycle("t1");
		testinglifecycle t2 = new testinglifecycle("t2");
		t1.start();
		t2.start();
	}

}
