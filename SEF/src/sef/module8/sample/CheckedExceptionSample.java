package sef.module8.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]){
		
		String fileName = "SomeFileThatDoesNotExist.txt";

		FileReader reader ;
		
		try{
			reader = new FileReader(fileName);
			
			
		}catch (FileNotFoundException e) {
			System.out.println("file " + fileName + " not found");
		}
	}
}
