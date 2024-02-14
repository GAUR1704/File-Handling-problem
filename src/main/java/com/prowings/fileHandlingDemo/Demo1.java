package com.prowings.fileHandlingDemo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Abc.txt");
		
		if(file.createNewFile())
			System.out.println("File is Created !!!");
		else
			System.out.println("FIle Already present !!!");
		
//		if(file.delete())
//			System.out.println("File deleted sucessfully !!!");
//		else
//			System.out.println("File not present !!!");
		
		System.out.println("Total spaces are "+file.getTotalSpace());
		
		System.out.println("File path is "+file.getPath());
		
		System.out.println("Folder path :"+file.toURI());
		
		System.out.println(file.canExecute());
		
		System.out.println(file.canRead());
		
		System.out.println(file.mkdir());
		
		InputStream input = new InputStream() {
			
			@Override
			public int read() throws IOException {
				return 0;
			}
		};
		
		
	}

}
