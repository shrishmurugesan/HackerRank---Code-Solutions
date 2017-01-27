import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	@SuppressWarnings("unchecked")
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer>[] group = new ArrayList[n];
		for( int i = 0; i < n; i++) {
		    group[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<n ; i++)
		{
			
		}
		
		for(int i=0;i<n;i++)
		{
			int numberInSeq = in.nextInt();
			for(int j=0; j<numberInSeq;j++)
			{
				group[i].add(in.nextInt());
			}
		}
		
		int numQueries = in.nextInt();
		
		try{
		for(int i=0;i<numQueries;i++)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			int solution = group[x].get(y);
			System.out.println(solution);
		}
		}catch(Exception e)
		{
			System.out.println("ERROR!");
		}
	}

}
