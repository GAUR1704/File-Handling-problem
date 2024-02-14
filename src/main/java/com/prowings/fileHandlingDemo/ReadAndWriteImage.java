package com.prowings.fileHandlingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteImage {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream(new File("C:\\Users\\HP\\Downloads\\Quotefancy .png"));
			FileOutputStream fops = new FileOutputStream(new File("image.png"));
			
			int content;
			
			while ((content = file.read())!= -1) {
				fops.write(content);
				
			}
			System.out.println("Finished");
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
