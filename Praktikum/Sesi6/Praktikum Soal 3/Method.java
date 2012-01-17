import java.util.Scanner; // mengambil method scanner yang berfungsi sebagai pengambil input dalam program

public class Method{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Person personObject = new Person(); //menciptakan instance personobject dari class person
		
		System.out.println("Enter your name here : ");
		String name = input.nextLine(); //mengambil input dari pengguna
		
		personObject.simpleMessage(name); //menjalankan method simplemessage yang terdapat pada class person
	}
}
