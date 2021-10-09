package family.myFamily;

public class Father 
{
	private void atm()
	{
		System.out.println("ATM accessed");
	}
	
	void car()
	{
		System.out.println("CAR accessed");
	}
	
	protected void bike()
	{
		System.out.println("BIKE accessed");
	}

	public void dustBin()
	{
		System.out.println("DustBin accessed");
	}
	
	public static void main(String[] args) 
	{
		Father f1=new Father();
		f1.atm();//private members can be accessed within the class
		f1.car();//default members can be accessed within the class
		f1.bike();//protected members can be accessed within the class
		f1.dustBin();//public members can be accessed within the class
	}

}
