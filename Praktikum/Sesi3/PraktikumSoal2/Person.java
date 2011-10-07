public class Person //mendeklarasikan sebuah class dengan nama Person yang bersifat public 
	{
	private String nama; //mendeklarasikan suatu variable dengan tipe data string bernama nama yang bersifat private
	public static void main(String[] args) /*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi , method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
		{
		Person test; //mendeklarasikan variable atau property dengan tipe data referensi dari class person
		test = new Person();  /*mengalokasikan atau mendeklarasikan sebuah objek baru dengan referensi class person
		 dalam memory untuk objek atau variable referensi test*/
		test.setNama("andi");
		byte b = 100; //mendeklarasikan suatu variable dengan nama b dengan tipe data byte dan nilai 100
		short s = 100; //mendeklarasikan suatu variable dengan nama s dengan tipe data short dan nilai 100

		Person belajarVariable = test; /*mendeklarasikan suatu objek baru bernama belajarvariable
		 dan memasukkan nilai property dari objek test ke dalam objek tersebut*/
		belajarVariable.setNama("belajar variable"); /*menginisiasikan nilai belajar variable ke dalam objek belajarvariable 
		dengan menggunakan suatu method bernama setNama*/

		System.out.println(b + s); // menampilkan nilai dari variabel b dan variabel s
		System.out.println("nama :" + test.getNama() + " " + b);/*menampilan output berupa variable nama dengan nilai referensi
		 dari method getNama sehingga nilai yang muncul adalah nilai yang terakhir kali berada dimasukkan atau terakhir
		  kali berada dalam memori disertai dengan output dari nilai variable b*/
		}
	public void setNama(String aNama) /*deklarasi suatu method bernama setNama yang bersifat public 
	sehingga dapat diakses dari luar class dan memiliki argumen berupa data dengan tipe string dalam variable aNama*/
		{
		this.nama = aNama; //memasukkan nilai dari aNama ke dalam variable nama
		}
	public String getNama() /*mendeklarasikan suatu method bernama getNama yang bersifat public 
	sehingga dapat diakses dari luar class yang berfungsi mengembalikan nilai dari variable nama dari dalam memori*/
		{
		return this.nama;
		}
	}
