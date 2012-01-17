class Sapi extends Hewan{
	public sapi(){
		super("sapi",4,false);
	}
	
	public void bersuara(){
		System.out.println("\nemoh....,emoh.....");
	}
	
	public static void main(String args){
		sapi s = new sapi();
		s.isHewan();
		s.bersuara();
	}
}
