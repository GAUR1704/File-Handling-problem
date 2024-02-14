package com.prowings.fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordCountFromFile {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;
		
		try {
			
			reader = new BufferedReader(new FileReader(new File("abc.txt")));
			
			String currentLine = reader.readLine();
			
			while(currentLine != null) {
				
				lineCount ++;
				
				String[] words = currentLine.split(" ");
				
				wordCount += words.length;
				
				for(String word : words) {
					
					charCount += words.length;
					
				}
				
				currentLine = reader.readLine();
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error occured while reading the file !!");
			e.printStackTrace();
			
		}
		
		catch(IOException e) {
			System.out.println("Error occured while reading the file !!");
			e.printStackTrace();
			
		}
		
		finally {
			
			try {
				reader.close();
			} 
			catch (IOException e) {
				System.out.println("Error occured while reading the file !!");
				
				e.printStackTrace();
			}
		}
		
		System.out.println("The total lines present in the file " + lineCount);
		System.out.println("The total words present in the file " + wordCount);
		System.out.println("The total chars present in the file " + charCount);
	}

}
