package simpleExampleOfLambdaExpression;

public class MainClass {

	
	public static void main(String[] args) {
	
		MainClass mainClass = new MainClass();
		
		// if you have one line input than you don't need to put {} 
		
		/*
		 * => Code without Lambda
		 * 
		 * 
		 *   MyInterface myInterface = new MyInterface() {
			
			@Override
			public void firstLamdaMethod() {
				
			}
		};
		
		 * 
		 * */
		
		// Code With Lambda
		
		MyInterface myInterface = () -> System.out.println("Lamda Calling !!");
		
		myInterface.firstLamdaMethod();
	}
	
}
