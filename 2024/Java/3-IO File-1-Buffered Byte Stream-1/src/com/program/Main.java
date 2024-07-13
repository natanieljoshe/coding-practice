
package com.program;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main{
	
    public static void main(String args[]) throws IOException{
	
		//import file
		FileInputStream fileInput = new FileInputStream("input.txt");


		//tampung ke dalam buffered
		BufferedInputStream buffInput = new BufferedInputStream(fileInput);

		//tampilkan ke console
		byte [] isiFile = buffInput.readAllBytes();

		//menampilkan dengan looping
		// for(int i=0;i< isiFile.length; i++){
		// 	System.out.print(isiFile[i]);
		// }

		//menampilkan dengan library
		System.out.print(Arrays.toString(isiFile));

		//write ke file lain
		FileOutputStream fileOutput = new FileOutputStream("output.txt");

		//tampung ke dalam buffered output stream
		BufferedOutputStream buffOutput =  new BufferedOutputStream(fileOutput);

		//sebelum flush, file akan disimpan ke dalam memori
		buffOutput.write(isiFile);

		//mengeluarkan file
		buffOutput.flush();

		//close file
		fileInput.close();
		buffInput.close();
		fileOutput.close();
		buffOutput.close();

	}

}

