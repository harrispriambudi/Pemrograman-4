import java.util.Arrays; // mengimport class default array, logging level, dan looger
import java.util.logging.Level; // 
import java.util.logging.Logger;

public class WhiteSpaceMain{
	public static void main(String[] args){
		try{
			input(); // mencoba membentuk instance dari metode input yang telah dibuat
		}
		catch(WhiteSpaceException ex){ // menangkap pesan error
			Logger.getLogger(WhiteSpaceMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public static void input() throws WhiteSpaceException{
		String username = "Tidak Boleh Memakai Spasi";
		
		char[] charArray = username.toCharArray(); //membentuk input username ke dalam variable array dengan nama charArray
		for(char c: charArray){ //membentuk instance baru yaitu c yang bereferensi dari charArray
			if (c == ' '){ // jika terdapat kekosongan dalam instance c maka program memberikan whitespaceexception
				throw new WhiteSpaceException(username);
			}
		}
		
		System.out.println("Kalimat ini " + username);
	}
}
