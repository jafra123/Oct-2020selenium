package exceptionHandling.copy2;

public class TryCatch {
	public static void main(String[] args) {		
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");		
		try {
			int i= 9/0;
		    //int i= 9/3;  // will not go to catch 
			System.out.println("Tesing");
			System.out.println("Testing1");
		    } 
		//catch(ArithmeticException e )
		//catch(NullPointerException e )  // it will through xception in thread "main" java.lang.ArithmeticException: / by zero
		catch(Exception e )   // if you dont know what kind just write Exception- because class
		{
			System.out.println("some exception is coming");
			//e.printStackTrace();
		}
		// can i write 2 catch block 	
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");	
	}

}
