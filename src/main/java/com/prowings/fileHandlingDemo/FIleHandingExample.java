package com.prowings.fileHandlingDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FIleHandingExample {

	public static void main(String[] args) {
		
		String filePath = "example.txt";
		
		
		writeFile(filePath);
		
		readFile(filePath);

	}

	private static void writeFile(String filePath) {
		
		try (FileWriter writer = new FileWriter(filePath)) {
			
            writer.write("Hello, this is a text file!\n");
            
            writer.write("Java File Handling Example\n");
            
            writer.write("Writing data to a file using FileWriter\n");
            
            System.out.println("Data has been written to the file.");
            
        } catch (IOException e) {
        	
            System.err.println("Error writing to the file: " + e.getMessage());
        }
		
	}

	private static void readFile(String filePath) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			
            System.out.println("\nReading data from the file:");
            
            String line;
            
            while ((line = reader.readLine()) != null) {
            	
                System.out.println(line);
            }
        } 
		catch (IOException e) {
			
            System.err.println("Error reading from the file: " + e.getMessage());
        }
		
	}

}
