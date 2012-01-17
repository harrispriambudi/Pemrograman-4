class Main{
	public static void main(String[] args){
		// menciptakan instance baru dari berbagai class yang sudah dibuat
		Santapan s = new Santapan();
		Makanan ma =  new Makanan();
		Minuman mi = new Minuman();
		Cemilan ce = new Cemilan();
		
		// instance s yang telah dibuat kemudian diimplementasikan dengan void santap dari berbagais class yang telah mendapat pewarisan dari class makanan
		s.cerna(ma);
		s.cerna(mi);
		s.cerna(ce);
	}
}
