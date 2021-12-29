package Multithreading;

public class Test extends Thread {
	

	
	//static Thread mainThread;
	
	public void run() {
		try {
			
			//mainThread.join();
			
			
			for (int i =1; i<=5; i++) {
				System.out.println("child thread :"+i);
				Thread.sleep(1000);
				
			}
			
		} catch (InterruptedException e) {
			System.out.println(e);
			
		}
	}
	public static void main(String[] args) {
		
		// mainThread= Thread.currentThread();
		
		
		Test t=new Test();
		t.start();
		
		
		try {
			t.join();
			for (int i =1; i<=5; i++) {
				System.out.println("main thread :"+i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			System.out.println(e);
			
		}
		
	}
	

}
