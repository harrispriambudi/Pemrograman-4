class MainEkspresiWajah{
	public static void main(String[] args){
		EkspresiWajah objEkspresi = new EkspresiWajah(); // pembentukan instance baru
		Gembira objGembira = new Gembira(); // pembentukan instance baru dari class gembira yang merupakan pewaris dari ekspresiwajah
		Sedih objSedih = new Sedih(); // pembentukan instance baru dari class sedih yang merupakan pewaris dari ekspresiwajah
		Marah objMarah = new Marah(); // pembentukan instance baru dari class marah yang merupakan pewaris dari ekspresiwajah
		
		EkspresiWajah[] arrEkspresi = new EkspresiWajah[4]; // membentuk array yang berisi 4 data dan mengindexkan nilainya ke dalam class bersangkutan
		arrEkspresi[0] = objEkspresi;
		arrEkspresi[1] = objGembira;
		arrEkspresi[2] = objSedih;
		arrEkspresi[3] = objMarah;
		
		// menampilkan output berdasarkan nilai dari array 
		System.out.println("Ekspresi [0] : " + arrEkspresi[0].respons());
		System.out.println("Ekspresi [1] : " + arrEkspresi[1].respons());
		System.out.println("Ekspresi [2] : " + arrEkspresi[2].respons());
		System.out.println("Ekspresi [3] : " + arrEkspresi[3].respons());
	}
}
