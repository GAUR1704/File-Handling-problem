package com.prowings.fileHandlingDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileDynamicallyUsingTryWithResource {

	public static void main(String[] args) {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		try (InputStream inputStream = loader.getResourceAsStream("MyFile.txt");
				InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(streamReader);) {

			String line = "";
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		}

		catch (IOException e) {
			System.out.println("Some exception occured!!!");
			
			e.printStackTrace();
		}

	}

}
