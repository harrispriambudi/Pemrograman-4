package service;

public interface CalculatorService{ //menciptakan sebuah interface calculator service
	//menciptakana property bedasarkan jenis operator yang bersifat final.
	public Integer tambah (int bil1, int bil2);
	public Integer kurang (int bil1, int bil2);
	public Integer kali (int bil1, int bil2);
	public Integer bagi (int bil1, int bil2);
}
