package com.shrish.tutorials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap {
	
	
	public static void main(String args[])
	{
		
		System.out.println("This is a HashMap Demo");
		
		HashMap<String, Integer> Hmap = new HashMap<String,Integer>();
		Hmap.put("Shrish", 8608);
		Hmap.put("Sharmi", 1208);
		Hmap.put("chitti", 4455);
		Hmap.put("mommy", 4625);
		Hmap.put("Harrish", 0305);
		
		HashSet<Integer> Hset = new HashSet<Integer>();
		
		
		System.out.println(Hmap.entrySet());
		
		for(Map.Entry<String, Integer> entry : Hmap.entrySet())
		{
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key+" :  "+value);
		}
		
	
		
		
	}
	
	

}
