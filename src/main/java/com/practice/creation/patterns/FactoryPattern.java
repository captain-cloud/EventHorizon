package com.practice.creation.patterns;


interface Car {
	
	void purchase();
	
}


class BMW implements Car{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("BMW purchased");
	}
	
}

class Audi implements Car{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Audi purchased");
	}
	
	
}


class Subaru implements Car{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Subaru Purchased");
	}
	
	
}

 class CarFactory {
	
	static Car buildCar(String name) {
		
		
		if (name.equalsIgnoreCase("BMW"))
		{
			
			return new BMW();
			
			
		}
		else 	if (name.equalsIgnoreCase("Audi"))
		{
			
			return new Audi();
			
			
		}
		else 	if (name.equalsIgnoreCase("Subaru"))
		{
			
			return new Subaru();
			
			
		}
		
		
		else return null;
		
		
		
		
		
		
	}
}



public class FactoryPattern {


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Car car1 =CarFactory.buildCar("Audi");
		
		car1.purchase();
		
		
	}
	

}
