package srm.mca1;


class Fathers{
	void display()
	{
		System.out.println("Hey im Your Father");
	}
}


class ElderSon extends Fathers{
	
	void display()
	{
		super.display();
		System.out.println("Namashte Father Im your Elder Son");
		
	}
	
}



class YoungerSon extends Fathers{
	
	void display()
	
	{
		
		System.out.println("Namashte Father Im your Younger Son");
		
	}
}


public class Hirechical_Inheritance {

	public static void main(String[] args) {
		
		ElderSon e =new ElderSon();
		YoungerSon y = new YoungerSon();
		 e.display();
		 y.display();
		

	}

}
