package johnFamily;

import family.myFamily.Father;

public class John
{

	public static void main(String[] args) 
	{
		Father f4=new Father();
		//f3.atm();//private method cannot be accessed from outside the class
		//f3.car();//default members can be accessed within the class and within the package
		//f4.bike();//protected members can be accessed within the class and within the package and outside the package with IS A (Inheritance)
		f4.dustBin();//public members can be accessed from everywhere within the project
	}

}
