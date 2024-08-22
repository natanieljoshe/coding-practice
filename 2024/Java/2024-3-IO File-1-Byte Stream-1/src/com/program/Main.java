package com.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String args[]) throws IOException{

		//mengambil file txt
		FileInputStream inputKu = new FileInputStream("input.txt");
		
		//menunjukkan ada berapa karakter
		System.out.println(inputKu.available());

		// //read file
		// int huruf = inputKu.read();
		// while(huruf!=-1){
		// 	System.out.print((char)huruf);
		// 	huruf = inputKu.read();
		// }

		//write file
		FileOutputStream outputKu = new FileOutputStream("output.txt"); 

		// int hurufKu = inputKu.read();
		// while (hurufKu!=-1) {
		// 	outputKu.write(hurufKu);
		// 	hurufKu = inputKu.read();
		// }

		Scanner inputConsole = new Scanner(System.in);
		System.out.println("Masukkan kalimat anda: ");
		String kalimat = inputConsole.nextLine();

		int hurufHandal = kalimat.charAt(0);
		int panjangHuruf = kalimat.length();
		int index = 0;

		while (index < panjangHuruf) {
			outputKu.write(hurufHandal);
			if(index == panjangHuruf-1){
				break;
			}
			index++;
			hurufHandal = kalimat.charAt(index);
		}

		outputKu.close();
		inputKu.close();
	}  
}

