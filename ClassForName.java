
public class ClassForName {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// object creation call both static and non static block of class
		//Pqr obj = new Pqr();
		
		// if we use Class.forName , it will only invoke static part of the class
		
		Class.forName("Pqr");		
	}
	
	

}


class Pqr{
	
	static
	{
		
		System.out.println("From Static Block");
	}
	
	{
		
		System.out.println("From Non-static Block.");
	}
}
