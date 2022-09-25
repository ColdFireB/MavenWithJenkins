import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DecimalToBinary {
	static Scanner s;
	static Random rand;
	static int numOfCount;
	static File f;
	static BufferedReader reader;

	/**
	 * this method is to Generate random decimal values
	 * 
	 * @return
	 */
	public static String[] GenerateRandomDecimal_Values() {
		s = new Scanner(System.in);
		rand = new Random();

		System.out.print("Enter the number of Decimal numbers need to be written:  ");
		numOfCount = s.nextInt();
		String[] arr = new String[numOfCount];

		System.out.print("The random numbers are:  ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.format("%d", rand.nextInt(1000));
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		return arr;
	}

	/**
	 * This method is to Create a file and get the absolute file path location of it
	 * 
	 * @param filename
	 * @return
	 */
	public static String CreateFile_getPath(String filename) {
		try {
			f = new File(filename);
			if (f.createNewFile()) {
				System.out.println("File is created:  " + f.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.println("Error occured in file creation");
			e.printStackTrace();
		}
		System.out.println("File Location:   " + f.getAbsolutePath());
		return f.getAbsolutePath();
	}

	/**
	 * This method is to write the array values into the file specified
	 * 
	 * @param filename
	 * @param values
	 * @throws IOException
	 */
	public static void WriteFile(String filename, String[] values) throws IOException {
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(filename);
			for (String val : values) {
				myWriter.write(val + " ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			myWriter.close();
		}
	}

	/**
	 * This method is to read the content from the file and return the contents
	 * 
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static String ReadContentFromFile(String filename) throws IOException {
		String line = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			line = reader.readLine();
			if (line != null) {
				System.out.println("Reading content from file:	" + line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			String s = CreateFile_getPath(filename);
			ReadContentFromFile(s);
		} finally {
			reader.close();
		}
		return line;
	}

	/**
	 * Read the String values from file, parse into Decimal and Convert into Binary
	 * 
	 * @param filename
	 * @return
	 */
	public static String[] ParsingTheValuesIntoDecimal_ConvertToBinaryEqualent(String filename) {
		String readLines;
		String[] s;
		int[] dec;
		String[] binary = null;
		try {
			readLines = ReadContentFromFile(filename);
			s = readLines.split(" ");
			dec = new int[s.length];
			binary = new String[s.length];
			for (int i = 0; i < dec.length; i++) {
				dec[i] = Integer.parseInt(s[i]);
				binary[i] = Integer.toBinaryString(dec[i]);
			}
			System.out.println("Extracted decimals from File: " + Arrays.toString(dec));
			System.out.println("Binary conversion from Decimal: " + Arrays.toString(binary));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return binary;
	}

	public static void main(String[] args) throws Exception {
		String decimal_FileName = "intermediate_output.txt";
		String binary_FileName = "final_output.txt";
		String[] arrayOfDecimalValues = GenerateRandomDecimal_Values();

		String decimal_fileLocation = CreateFile_getPath(decimal_FileName);
		String binary_fileLocation = CreateFile_getPath(binary_FileName);

		WriteFile(decimal_fileLocation, arrayOfDecimalValues);
		String[] binaryEqu = ParsingTheValuesIntoDecimal_ConvertToBinaryEqualent(decimal_fileLocation);

		WriteFile(binary_fileLocation, binaryEqu);
		ReadContentFromFile(binary_fileLocation);
	}
}