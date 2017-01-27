import java.io.*;
import java.util.*;


class Book{
	int day;
	int month;
	int year;
	
	Book(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
}

public class Solution {
	
	public static void main(String a[])
	{
		
		Scanner in = new Scanner(System.in);
		Book actual = new Book(in.nextInt(),in.nextInt(),in.nextInt());
		Book expected = new Book(in.nextInt(),in.nextInt(),in.nextInt());
		int fine=0;
		if(actual.year==expected.year)
		{
			//returned in same year but not necessarily same month
			if(actual.month == expected.month)
			{
				// returned in the same month but not necessarily on the same day
				if(actual.day <= expected.day)
				{
					// Book is returned early
					fine = 0;
				}
				else if(actual.day>expected.day)
				{
					// Book is returned late but within the same month
					fine = (actual.day - expected.day)*15;
				}
			}
			
			else if(actual.month > expected.month)
			{
				// Book is returned more than a month late
				fine = (actual.month - expected.month)*500;
			}
		}
		else if(actual.year > expected.year)
		{
			fine = 10000;
		}
		
		System.out.println(fine);
		in.close();
	}
	
	

}
