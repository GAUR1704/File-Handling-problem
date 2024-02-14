package com.prowings.fileHandlingDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class WriteFileByMultipleWays {

	public static void main(String[] args) throws IOException {

		File file = new File("pqr.txt");

		if (file.createNewFile())

			System.out.println("File is Created !!!");

		else

			System.out.println("File Already present !!!");

		String dataToWrite = "Hello Guys, welcome to Pune city";

		String dataToWrite2 = "Hello World";

		String dataToWrite3 = "Hello Java developers.. welcome to Pro Wings!!";

		String dataToWrite4 = "DDDDDDDDDDDDDDDDD";

		writeFileUsingBufferedWriter(dataToWrite);
		writeFileUsingPrintWriter(dataToWrite3);
		writeFileOutputStream(dataToWrite2);
		writeFileUsingRandomAccessFile(dataToWrite4);
		writeFileUsingFilesUtilityClass(dataToWrite4);

	}

	public static void writeFileUsingFilesUtilityClass(String dataToWrite4) {

		Path path = Paths.get("pqr.txt");

		byte[] strToByte = dataToWrite4.getBytes();

		try {

			Files.write(path, strToByte);
			System.out.println("Finished");
		}

		catch (IOException e) {

			System.out.println("Error occured while writing a file");

			e.printStackTrace();
		}

	}

	public static void writeFileUsingRandomAccessFile(String dataToWrite4) {

		try (RandomAccessFile raf = new RandomAccessFile(new File("pqr.txt"), "rw")) {

			raf.seek(3);
			raf.writeInt(1);

		}

		catch (FileNotFoundException e) {

			System.out.println("Error occured while writing a file");

			e.printStackTrace();

		} catch (IOException e1) {

			System.out.println("Error occured while writing a file");

			e1.printStackTrace();
		}

	}

	public static void writeFileOutputStream(String dataToWrite2) {

		try (FileOutputStream fos = new FileOutputStream(new File(dataToWrite2))) {

			byte[] bytes = dataToWrite2.getBytes();

			System.out.println(Arrays.toString(bytes));

			fos.write(bytes);

		} catch (FileNotFoundException e) {

			System.out.println("Error occured while writing a file");

			e.printStackTrace();
		} catch (IOException e1) {

			System.out.println("Error occured while writing a file");

			e1.printStackTrace();
		}

	}

	public static void writeFileUsingPrintWriter(String dataToWrite3) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(new File("pqr.txt")))) {

//			pw.append(dataToWrite3);

			pw.write(dataToWrite3);

		} catch (IOException e) {

			System.out.println("Error occured while writing a file");

			e.printStackTrace();
		}
	}

	public static void writeFileUsingBufferedWriter(String dataToWrite) {

		try (BufferedWriter br = new BufferedWriter(new FileWriter(new File("pqr.txt")))) {

			br.append(' ');

			br.append(dataToWrite);

			System.out.println("Data written to file successfully!!");

		} catch (IOException e) {

			System.out.println("Error occured while writing a file");
			
			e.printStackTrace();
		}

	}

}
