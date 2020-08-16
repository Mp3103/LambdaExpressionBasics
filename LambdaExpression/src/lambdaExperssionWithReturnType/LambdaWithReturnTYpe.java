package lambdaExperssionWithReturnType;

public class LambdaWithReturnTYpe {

	public static void main(String[] args) {
		
		LengthOfString lengthOfString =  s -> s.length();
			
		System.out.println(lengthOfString.getLengthOfString("Hello World"));
		
	}
	
	
	interface LengthOfString{
		int getLengthOfString(String something);
	}
	
}
