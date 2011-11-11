package main;

import service.PendaftaranService;
import service.impl.PendaftaranServiceImpl;

public class MainClass
	{
	public static void main(String[] args)
		{
		PendaftaranService service = new
		PendaftaranServiceImpl();

	String Nama = service.Nama("Harris");
	Integer Nilai = service.Nilai(70);

	System.out.println("DAFTAR MAHASISWA YANG DITERIMA");
	System.out.println("NAMA NILAI");
	System.out.println(Nama + " " + Nilai);
		}
	}