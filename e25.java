package Day2Programs;

public class e25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello world!");
		System.out.println("Initial value");
		System.out.println(sb);
		System.out.println("Replaced string");
		sb.replace(0,5, "Hi");
		System.out.println(sb);
	}

}
