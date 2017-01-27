import java.io.*;
import java.util.*;

public class BubbleSort {
	
	static void swap(int a, int b)
	{
		int temp = b;
		b = a;
		a = temp;
	}
	
	static void swapper(int[] a)
	{
		//int[] sortedArray = new int[a.length];
		int totalSwaps=0;
		int temp;
		for (int i = 0; i < a.length; i++) {
		    // Track number of elements swapped during a single array traversal
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < a.length - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		            temp = a[j+1];
		            a[j+1]= a[j];
		            a[j] = temp;
		            numberOfSwaps++;
		            totalSwaps++;
		        }
		    }
		    
		    // If no elements were swapped during a traversal, array is sorted
		    if (numberOfSwaps == 0) {
		    	
		        break;
		    }
		    
		}
		System.out.println("Array is sorted in "+totalSwaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);
	}
	
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		int numElements = in.nextInt();
		int[] inArr = new int[numElements];
		for(int i=0; i < numElements; i++)
		{
			inArr[i]= in.nextInt();
		}
		in.close();
		swapper(inArr);
	}

}
