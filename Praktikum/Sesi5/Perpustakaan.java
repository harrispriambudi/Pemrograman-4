public class Perpustakaan{ //menciptakan class Perpustakaan yang dapat diakses dari luar class
	/*menciptakan variable dengan tipe string dan bersifat private yang dapat diakses hanya dalam class dengan nama in,peminjam, 		dan judul*/
	private String id;
	private String peminjam;
	private String judul;
	private static int jumlah; /*menciptakan variable dengan tipe integer bernama jumlah dapat diakses hanya dalam class
	Perpustakaan dan tidak dapat diubah nilainya dari luar karena bersifat statis*/ 
	
	//method yang mengembalikan nilai dalam bentuk variable tertentu ke kelas utama.	
	public String getJudul(){
		return judul;
	}
	
	/* method yang berfungsi menerima dan menetapkan variable judul,peminjam,Id dari class PerpustakaanMain dalam class ini, fungsi
	ini tidak mengembalikan nilai ke luar class */
	public void setJudul(String judul){ 
		this.judul = judul;
	}
	
	public String getPeminjam(){
		return peminjam;
	}
	
	public void setPeminjam(String peminjam){
		this.peminjam = peminjam;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public static int getJumlah(){
		return jumlah;
	}
	
	public static void setJumlah(int jumlah){ /* fungsi yang mengubah nilai jumlah dalam class perpustakaan disamakan dengan
	perpustakaanmain */
		Perpustakaan.jumlah = jumlah;
	}
}
