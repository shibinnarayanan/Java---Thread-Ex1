package ThreadByImplementingRunnableInterface;

public class Test implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread is running");
		
	}

}
