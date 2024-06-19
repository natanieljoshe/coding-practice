package com.program;

import java.util.Arrays;


public class cQUickSort{
	
	public static void main(String[] args) throws Exception{

		int[] nilai = {15,76,45,98,34};
		quickSort(nilai);

	}

	public static void quickSort(int[] angka){
		System.out.println("===Sebelum===");
		for ( int a : angka) {
			System.out.print(a + " ");
		}
		
		//Menggunakan metode prosedur (bukan fuction)
		quickSortAlgoritm(angka, 0, angka.length-1);

		System.out.println("\n===Sesudah===");
		for ( int a : angka) {
			System.out.print(a + " ");
		}
	}

	public static void quickSortAlgoritm(int [] angka, int indexAwal, int indexAkhir){
		
		int i = indexAwal;
		int j = indexAkhir;
		int pivot = angka[indexAwal];
		//index awal dapat diganti dengan index akhir, ataupun diganti dengan nilai tengahnya

		//looping untuk mengecek apakah data masih bisa dicek atau tidak
		while (i<=j) {
			//kalau nilai di sebelah kiri pivot kurang dari nilai pivot
			while (angka[i]<pivot) {
				i++;
			}

			//kalau nilai di sebelah kanan pivot lebih dari nilai pivot
			while (angka[j]>pivot) {
				j--;
			}

			if(i<= j){
				//tukar
				int temp = angka[i];
				angka[i] = angka[j];
				angka[j] = temp;
				i++;
				j--;
			}

		}//akhir pengecekan data
		//supaya yang urut ga ngumpul sendiri
		if(indexAwal<j){
			quickSortAlgoritm(angka, indexAwal, j);
		}
		if(i<indexAkhir){
			quickSortAlgoritm(angka, i, indexAkhir);
		}

	}

}
