package com.shrish.tutorials;

import java.io.File;
import java.io.IOException;

public class DisplayDirectoryAndFile{

	public static void main (String args[]) throws IOException {

		try{displayIt(new File("D:\\SteamLibrary") );
		
		} catch(NullPointerException e)
		{
			System.out.println("Exception Thrown: " + e); 
		}
	}

	public static void displayIt(File node) throws NullPointerException, IOException{

		System.out.println(node.getAbsolutePath());

		if(node.isDirectory()){
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
		}

	}
}