
public class JavaTester8Mine {

	
	final static String salutation ="Hello ";
	
	public static void main(String args[])
	{
		
		Greetings greeting1=message->
		  System.out.println(salutation + message);
		
		  
		  greeting1.sayHello("Mahesh");
	}
	
	interface Greetings
	{
		public void sayHello(String message);
	}
}
