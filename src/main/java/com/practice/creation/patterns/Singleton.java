package com.practice.creation.patterns;



///constrictor private
/// create the same obj on static as it is only exceuted once and cobjects cannot be instiatated any more
//only way to make sure that the object is created once

class MySingleton{
	
	static MySingleton obj = new MySingleton();
	private MySingleton() {}
	
	
	public static  MySingleton getinstance() {
		
		return obj;
	}
	
	   public void myFunction(){
		      System.out.println("Single Message");
		   } 
	
	
}






public class Singleton {
	
	
	
public static void main(String []args) {
	
	
//	MySingleton obj =new   MySingleton(); // cannot do that single the object cannot be created as construcotr is not visible outside the class
	
	MySingleton obj = MySingleton.getinstance();
	
	obj.myFunction();
	
	
}
}
