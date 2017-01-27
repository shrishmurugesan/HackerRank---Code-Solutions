
public class Solution {
	
	static <T> void printArray(T[] t)
	{
		for(T genericElements : t)
		{
			System.out.print(genericElements+" ");
		}
	}

	
	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}

