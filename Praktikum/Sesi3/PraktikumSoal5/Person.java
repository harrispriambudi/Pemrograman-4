public class Person{ /*mendeklarasikan sebuah class dengan nama Person yang bersifat public 
sehingga dapat diakses dari dalam maupun luar class*/
	public static void main(String[] args){ /*mendeklarasikan suatu method bernama main yang akan
	 pertama diakses ketika program dieksekusi , method ini menggunakan keyword void sehingga tidak mengembalikan nilai apapun 
	 dan dapat diakses dari dalam maupun luar karena bersifat public*/
		int a; //mendeklarasikan suatu variable dengan nama a dengan tipe data integer
		a = 1000; //memasukkan nulai 1000 ke dalam variable a
		int b = 1000; //mendeklarasikan suatu variable dengan nama b dengan tipe data integer dan nilai 1000
		
		System.out.println("a = " + a); //menampilan output berupa nilai dari variable a dalam satu baris
		System.out.println("b = " + b); //menampilan output berupa nilai dari variable b dalam satu baris
		System.out.println("a + b = " + (a+b)); //menampilan output berupa nilai dari variable a dan b yang telah dijumlahkan
	}
}
