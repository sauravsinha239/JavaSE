package srm.mca1;


 class Dog{
	  String color="Blue";
	 void eat()
	 {
		 System.out.println("Dog is Eating");
	 }
	 
	  Dog() {
		 
		  System.out.println("Color in Constructor "+color);
		 
	 }
	
	 
 }
 class Puppy extends Dog{
	 
	 
	 	Puppy()
	{
		 super();
		 
		 System.out.println("Puppy Constroctor");
	}
	 
	 void eat(){
		 
		
		 System.out.println("Puppy is Eating");
		 super.eat();
		 System.out.println("Color is "+super.color);
		
	 }
	
	 
 }

public class ExampleofSuperKeywords {
	
	
	

	public static void main(String[] args) {
		
		Puppy p1 = new Puppy();
		
		p1.eat();
		
		
		

	}

}
