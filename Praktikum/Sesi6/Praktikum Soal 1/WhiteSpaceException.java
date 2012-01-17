public class WhiteSpaceException extends Exception{ // menciptakan class yang menambah perluasan dari dari method exception
	public WhiteSpaceException(){ // mengambilsegala bentuk input yang ada dan memberikan output balik berupa pesan
		super ("Terjadi kesalahan : 'tidak boleh ada spasi / whitespace'");
	}
	
	public WhiteSpaceException(String text){  // mengambilsegala bentuk input berupa string dan memberikan output balik berupa pesan
		super("'Terjadi kesalahan : tidak boleh ada spasi / whitespace', text : " + text);
	}
}
