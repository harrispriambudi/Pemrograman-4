public class MainPersegiPanjang{
	public static void main(String[] args){
		PersegiPanjang pp = new PersegiPanjang(); // menciptakan object pp yang berefernsi dari class persegipanjang
		pp.setPanjang(10);
		pp.setLebar(20);
		
		System.out.println("Panjang : " + pp.getPanjang());
		System.out.println("Lebar   : " + pp.getLebar());
		System.out.println("Luas    : " + pp.getLuas());
		
	}
}
