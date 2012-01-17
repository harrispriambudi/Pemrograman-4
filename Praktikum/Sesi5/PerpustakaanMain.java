//memanggil class method default dalam java untuk digunakan dalam program
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerpustakaanMain{
	public static void main (String[] args){
		File file = new File ("Perpustakaan.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		List<Perpustakaan> listPerpustakaan = new ArrayList <Perpustakaan>();
		
		// menjalankan method try and catch untuk proses pengambilan data dari file txt 
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			int count = 0;
			
			while(dis.available() != 0){
				count++; //menambah nilai variable count dalam setiap perulangan sebesar 1
				//memecah text perbaris menjadi beberapa kolom sesuai dengan pemisah koma
				String line = dis.readLine(); //menciptakan variable line yang berisi data input stream dari file txt
				String[] data = line.split(","); /*menciptakan variable array data yang berisi data yang telah dipisah
				berdasarkan tanda koma*/
				
				Perpustakaan p = new Perpustakaan(); //menciptakan instance baru dari class perpustakaan
				p.setId(data[0]);
				p.setPeminjam(data[1]);
				p.setJudul(data[2]);
				p.setJumlah(count);
				
				listPerpustakaan.add(p);
			}
		}
		catch(IOException ex){ //mengambil pesan error serta jenis error untuk ditampilkan
			System.out.println("File " + file.getName() + " tidak ketemu ! ");
			System.out.println("Exception : " + ex.getMessage());
		}
		
		for (Perpustakaan perpus : listPerpustakaan){
			//memberikan output dai data
			System.out.println("=============================");
			System.out.println("ID : " + perpus.getId());
			System.out.println("Penyewa : " + perpus.getPeminjam());
			System.out.println("Judul : " + perpus.getJudul());
			System.out.println("Jumlah : " + perpus.getJumlah());
		}
	}
}
