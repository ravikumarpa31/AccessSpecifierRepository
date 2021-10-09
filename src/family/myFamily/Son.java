package family.myFamily;

public class Son 
{

	public static void main(String[] args) 
	{
		Father f2=new Father();
		//f2.atm();//private method cannot be accessed from outside the class
		f2.car();//default members can be accessed within the class and within the package
		f2.bike();//protected members can be accessed within the class and within the package and outside the package with IS A (Inheritance)
		f2.dustBin();//public members can be accessed from everywhere within the project
	}

}
