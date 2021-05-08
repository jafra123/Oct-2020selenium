package exceptionHandling.copy2;

public class TryCatch2 {
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
		catch(NullPointerException e )   // if you dont know what kind just write Exception- because class
		{
			System.out.println("NullPointerException exception is coming");
			
		}
		// can i write 2 catch block 	--- now it will decide which exception to pick
		catch(ArithmeticException e )   
		{
			System.out.println("ArithmeticException exception is coming");
			//e.printStackTrace();
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");	
	}

}
