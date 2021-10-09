package family.unclefamily;

import family.myFamily.Father;

public class Uncle extends Father
{

	public static void main(String[] args) 
	{
		Uncle f3=new Uncle();
		//f3.atm();//private method cannot be accessed from outside the class
		//f3.car();//default members can be accessed within the class and within the package
		f3.bike();//protected members can be accessed within the class and within the package and outside the package with IS A (Inheritance)
		f3.dustBin();//public members can be accessed from everywhere within the project
	}

}
