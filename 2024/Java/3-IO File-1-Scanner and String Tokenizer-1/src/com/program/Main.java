
package com.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main{
	
    public static void main(String args[]) throws IOException{

		//import file
		FileReader fileInput = new FileReader("input.txt");
		BufferedReader buffInput = new BufferedReader(fileInput);

		//mark (agar file dapat direset dan digunakan kembali setelah diotak-atik)
		buffInput.mark(400);

		//Scanner
		// Scanner inputScanner = new Scanner(System.in);
		// String kata = inputScanner.next(); //untuk mengambil 1 kata
		// System.out.println(kata);

		Scanner inputScanner = new Scanner(buffInput);
		inputScanner.useDelimiter(",");

		// //untuk menampilkan boleean (apabila kosong, maka hasNext akan false)
		// System.out.println(inputScanner.hasNext()); 
		// Semua tulisan akan diambil
		while (inputScanner.hasNext()==true) {
			System.out.println(inputScanner.next());
		}




		//reset
		buffInput.reset();

		//string tokenizer
		//agar dapat mengambil data per baris
		//baris 1
		String baris1 = buffInput.readLine();
		StringTokenizer stringToken = new StringTokenizer(baris1, ",");
		while (stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}

		//baris 2
		String baris2 = buffInput.readLine();
		//tidak perlu declare StringTokenizer, karena sudah dideclare di atas dan dapat digunakan kembali
		stringToken = new StringTokenizer(baris2, ",");

		while (stringToken.hasMoreTokens()) {
			System.out.println(stringToken.nextToken());
		}

		
		
		//close
		inputScanner.close();
		fileInput.close();
		buffInput.close();
	}

}

