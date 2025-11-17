package Day5Programs;
//threads
//generic classes

class threaddemo extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
//run start pre defined keywords
public class p1threads {

	public static void main(String[] args) {
		threaddemo obj = new threaddemo();
		obj.start();

	}

}