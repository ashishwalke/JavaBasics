package AllJavaProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach 1: using FileReader BufferReader
		
		FileReader fr= new FileReader("E:\\test.txt");
		
		BufferedReader br= new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		
		br.close();
		
		//Approach 2 : using Scanner & File
		
		File file = new File("E:\\test.txt");
		
		Scanner sc = new Scanner(file);
		
		/*
		//loop Statement
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());
		}
		*/
		
		//Approach 3 : 
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());

	}

}

