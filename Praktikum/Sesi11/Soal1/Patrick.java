class Patrick extends Hewan implements Manusia
	{
	public Patrick()
		{
		super("patrick", 2, false);
		}
	public void bersuara()
		{
		System.out.println("eeeuuuuuh hai Spongebob...");
		}
	public void menyanyi()
		{
		System.out.println("akuu squidward aku squidward ohooohoho");
		}
	public void ketawa()
		{
		System.out.println("ohooohoo ohhooo hooh ohooo");
		}
	public static void makan()
		{
		System.out.println("akuu mau eskrimmm");
		}
	public void makan2()
		{
		super.makan();
		}

	public static void main(String[] args)
		{
		Patrick s = new Patrick();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
		}
	}


