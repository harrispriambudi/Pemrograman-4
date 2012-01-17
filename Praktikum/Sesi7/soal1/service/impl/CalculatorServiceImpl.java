package service.impl;

import service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService	{
	// meng-override method berdasarkan jenis operator hitung sehingga yang diapke adalah method dalam class caculatorserviceimpl
	@Override
	public Integer tambah(int bil1, int bil2){
		return bil1 + bil2; //memeberikan nilai balik kepada class utama
	}
	
	@Override
	public Integer kurang(int bil1, int bil2){
		return bil1 - bil2;
	}
	
	@Override
	public Integer kali(int bil1, int bil2){
		return bil1 * bil2;
	}
	
	@Override
	public Integer bagi(int bil1, int bil2){
		return bil1/bil2;
	}
}
