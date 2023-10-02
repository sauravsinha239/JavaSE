package srm.mca1;

class Grandfather{
	void display()
	{
		System.out.println("Hey im Your Grand Father");
	}
}


class Father extends Grandfather{
	
	void display()
	{
		super.display();
		System.out.println("Hey im your Father");
		
	}
	
}



class Child extends Father{
	
	void display()
	
	{
		super.display();
		System.out.println("Namashte Father And Grand Father");
		
	}
}
public class MultiLavelInheritance {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		
		c1.display();
		
		
	}

}
