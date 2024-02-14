package com.prowings.fileHandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordCountUsingTryWithResource {

	public static void main(String[] args) {

		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(new File("abc.txt"))))
		{
			String currentLine = reader.readLine();
			
			while(currentLine != null) {
				
				lineCount++;
				
				String[]words = currentLine.split(" ");
				
				wordCount += words.length;
				
				for(String word : words) {
					
					charCount = charCount + word.length();
				}
				
				currentLine = reader.readLine();
			}
		}
		catch (FileNotFoundException e) {
			
			System.out.println("Error occured while reading the file !!!");
			e.printStackTrace();
			
		}
		catch (IOException e) {

			System.out.println("Error occured while reading the file !!!");
			e.printStackTrace();
			
		}
		
		System.out.println("The total lines present in the file "+ lineCount);
		System.out.println("The total words preent in the file " + wordCount);
		System.out.println("The total chars present in the file " + charCount);
	}

}
