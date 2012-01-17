import java.util.*;

public class ExceptionTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); // membentuk instance input dari fungsi atau class scanner
		int x = 1;
		
		do{ // melakukan sederet operasi selama variable x masih bernilai 1
			try{
				System.out.println("Enter first num : ");
				int n1 = input.nextInt(); // mangambil input pertama ,kemudian diinisiasikan dalam variable n1
				System.out.println("Enter second num : ");
				int n2 = input.nextInt(); //  mangambil input pertama ,kemudian diinisiasikan dalam variable n2
				int sum = n1/n2;
				System.out.println(sum);
				x = 2;
			}
			catch(Exception e){
				System.out.println("You Can't Do That");
			}
		}
		while (x == 1);
	}
}
