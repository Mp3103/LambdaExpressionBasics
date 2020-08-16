package lambdaExpressionWithThread;

public class ThreadWithLambda {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Code Without Lambda
		 * 
		 * Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				
			}
		});
		
		 * 
		 * 
		 * */
		
		
		// code with Lamda
		
		Thread thread = new Thread( () ->   {
			for (int i = 0; i < 4; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		}
		);
		
		thread.start();
		thread.join();
	}
	
}
