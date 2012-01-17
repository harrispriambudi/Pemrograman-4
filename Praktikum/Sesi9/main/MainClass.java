// sesi ini merupakan bentuk dinamis dari sesi 07, dimana operasi hitung di pilih berdasarkan masukkan operator dari pengguna
package main; // memasukkan class ini ke dalam package bernama main

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

import java.util.*;
import java.io.*;

public class MainClass {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in); // membentuk instance baru dari method scanner untuk mengambil input

		CalculatorService service = new CalculatorServiceImpl();
	
		try{
			System.out.println("Masukkan bilangan 1:");
			String nilai1 = input.nextLine();
			int n1 = Integer.parseInt(nilai1);
		
			System.out.println("Masukkan bilangan 2:");
			String nilai2 = input.nextLine();
			int n2 = Integer.parseInt(nilai2);

			System.out.println("Masukkan operatornya (+, - , *,/)");
			String op = input.nextLine();
			char optr = op.charAt(0);

			if (optr == '+'){
				int a = service.tambah(n1, n2);
				System.out.println("Hasil Perhitungan dari " + n1 + " " + op + " " + n2 + " = " + a);
			}
			else if (optr == '-'){
				int b = service.kurang(n1, n2);
				System.out.println("Hasil Perhitungan dari " + n1 + " " + op + " " + n2 + " = " + b);
			}
			else if (optr == '*'){
				int c = service.kali(n1, n2);
				System.out.println("Hasil Perhitungan dari " + n1 + " " + op + " " + n2 + " = " + c);
			}
			else if(optr == '/'){
				int d = service.bagi(n1, n2);
				System.out.println("Hasil Perhitungan dari " + n1 + " " + op + " " + n2 + " = " + d);
			}
			else{
				System.out.println("Operator tidak valid");
			}
		}
		catch(Exception e){
			System.out.println("Angka atau operator tidak valid");
		}
	}	
}
