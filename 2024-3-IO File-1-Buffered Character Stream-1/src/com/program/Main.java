
package com.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;


public class Main{
	
    public static void main(String args[]) throws IOException{
	
		//import file
		FileReader fileInput = new FileReader("input.txt");

		//pindahkan file ke buffer reader
		BufferedReader buffInput = new BufferedReader(fileInput);

		//mark atau tanda (harus di marked dahulu sebelum di reset)
		//mark diberikan sebelum file diotak-atik
		//angka yang diberikan disini adalah angka batasan karakter yang bisa dimanipulasi
		//apabila sudah lewat batas, maka akan direset kembali ke awal
		buffInput.mark(300);

		//buktikan kalau buffered character stream fokus ke karakter
		char [] isiChar = new char[10];
		buffInput.read(isiChar, 0,isiChar.length);

		//tampilkan array isiChar
		System.out.println(Arrays.toString(isiChar));

		//tampilkan per baris
		System.out.println(buffInput.readLine());
		System.out.println(buffInput.readLine());


		//kita sudah membuka file ini di atas, sehingga ia akan membaca line ke-3.
		//akan tetapi line ke-3 itu tidak ada
		//maka sebelum di read line, maka harus di reset dulu
		buffInput.reset();

		//write (koneksi) ke file output
		FileWriter fileOutput = new FileWriter("output.txt");

		//pindahkan ke buffer writer
		BufferedWriter buffOutput = new BufferedWriter (fileOutput);

		//tulisan ke file output

		//baris 1
		String baris1 = buffInput.readLine();
		//simpan ke memori
		buffOutput.write(baris1, 0,baris1.length());
		buffOutput.flush();
		//tambah enter
		buffOutput.newLine();

		//baris 2
		String baris2 = buffInput.readLine();
		//simpan ke memori
		buffOutput.write(baris2, 0,baris2.length());
		buffOutput.flush();

		//close file
		fileInput.close();
		buffInput.close();
		fileOutput.close();
		buffOutput.close();
	}

}

