class Perkutut extends Hewan
	{
	public Perkutut()
		{
		super("perkutut",2,true);s
		}

	public void bersuara()
		{
		System.out.println("ncuit, ncuit,ncuit");
		}
	
	public static void main(String[] args)
		{
		Perkutut p = new Perkutut();
		p.isHewan();
		p.bersuara();
		}
	}
