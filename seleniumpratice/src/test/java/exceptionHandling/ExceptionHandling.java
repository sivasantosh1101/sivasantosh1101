package exceptionHandling;

//import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo() throws Exception{
		System.out.println("hello world");
		
		int i=1/0;
		
		System.out.println("compeleted");
	}
		
		
		
		
		
		
		
		
		
		
		
	

}
