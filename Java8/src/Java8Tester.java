public class Java8Tester {

   final static String salutation = "Hello! ";
   //checkin git
   // checkin 2 for git done 
   public static void main(String args[]){
      GreetingService greetService1 = message -> 
      System.out.println(salutation + message);
      greetService1.sayMessage("Mahesh");
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
}