public class MethodReturnsValues{
	public static void main(String[] args){
		myMethod(); // menciptakan atau menjalankan class myMethod
		int myInt = 0; //menciptakan variable myint awal dengan tipe integer yang bernilai 0
		System.out.println(myInt);
		myInt = myMethod(); // nilai dari myint berubah berdasarkan nilai balikkan dari class mymethod
		System.out.println(myInt);
	}
	
	static int myMethod(){ //menciptakan class mymethod 
		System.out.println("This computer is lagging");
		return 4;
	}
}
