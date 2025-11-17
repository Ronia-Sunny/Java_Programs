package Day2Programs;

public class p12_stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hi");
		System.out.println("Initial value:");
		System.out.println(sb);
		System.out.println("Updated string");
		sb.append( " user " );
		System.out.println(sb);
		System.out.println("Inserting new string");
		sb.insert(3, "new " );
		System.out.println(sb);
		System.out.println("Replacing string");
		sb.replace(3, 6, "old");
		System.out.println(sb);
		
		}

}
