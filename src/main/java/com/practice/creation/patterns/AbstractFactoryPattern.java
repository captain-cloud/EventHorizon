package com.practice.creation.patterns;

/// create an abstract class on top the factory to return the factory type





abstract class   AbstractFactory{
	 
	 abstract MotorCar getCar(String name);
}

class Germanfactory extends AbstractFactory

{

	@Override
	MotorCar getCar(String name) {
		// TODO Auto-generated method stub
		if (name.equalsIgnoreCase("Lambo"))
		{
			
			return new Lambo();
			
			
		}
		else 	if (name.equalsIgnoreCase("Porsche"))
		{
			
			return new Porsche();
			
			
		}
		
		
		
		else return new Unavailable();
	
	}
	
	
	
	
}




class NonGermanfactory extends AbstractFactory

{

	@Override
	MotorCar getCar(String name) {
		// TODO Auto-generated method stub
		if (name.equalsIgnoreCase("Honda"))
		{
			
			return new Honda();
			
			
		}
		else 	if (name.equalsIgnoreCase("Lexus"))
		{
			
			return new Lexus();
			
			
		}
		
		
		else return new Unavailable();
		
	}
	
	
	
	
}


 class FactoryProducer {
	   public static AbstractFactory getFactory(boolean isGerman){   
	      if(isGerman){
	         return new Germanfactory();         
	      }else{
	         return new NonGermanfactory();
	      }
	   }
	}





interface MotorCar {
	
	void purchase();
	
}


class Lambo implements MotorCar{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Lambo purchased");
	}
	
}

class Porsche implements MotorCar{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Porsche purchased");
	}
	
	
}


class Honda implements MotorCar{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("Honda Purchased");
	}
}
	
	class Lexus implements MotorCar{

		@Override
		public void purchase() {
			// TODO Auto-generated method stub
			System.out.println("Lexus Purchased");
		}
	
	
}


	class Unavailable implements MotorCar{

		@Override
		public void purchase() {
			// TODO Auto-generated method stub
			System.out.println("You have visited the wrong factory");
		}
	
	
}

	
	
	


//factory of factories
public class AbstractFactoryPattern {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("sss");
		
		AbstractFactory factory1 =FactoryProducer.getFactory(true);
		factory1.getCar("Lambo").purchase();
		
		
	}

}
