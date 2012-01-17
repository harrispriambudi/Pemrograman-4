// menciptakan class utama ekspresiwajah beserta turunan dari class tersebut
public class EkspresiWajah{
	public String respons(){
		return("Perhatikan Wajah Saya");
	}
}

class Gembira extends EkspresiWajah{
	public String respons(){
		return("ha ha ha..");
	}
}

class Sedih extends EkspresiWajah{
	public String respons(){
		return("hik hik ngeee ngeee ngeee....");
	}
}

class Marah extends EkspresiWajah{
	public String respons(){
		return("hai kurang ajar...!");
	}
}

