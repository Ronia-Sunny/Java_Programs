package Day2Programs;

import java.util.Scanner;

//array size to be user input and print it
//enter array limit 4
//element of...same as previous10,20,30,40
//display array elements
//10
//20
//30
//40

public class e14 {

	public static void main(String[] args) 
	{
		int size;
		System.out.println("Enter array limit: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int[size];
		
		

		        
		        for (int i = 0; i < size; i++) {
		            System.out.print("Enter element " + (i + 1) + ": ");
		            a[i] = sc.nextInt(); 
		        }

		        
		        System.out.println("\nArray elements:");
		        for (int element : a) { 
		            System.out.print(element + " ");
		        }
		        System.out.println();

		        
		    }
		}
	


