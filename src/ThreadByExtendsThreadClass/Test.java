package ThreadByExtendsThreadClass;

public class Test extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Executing main method ...........");
		System.out.println(Thread.currentThread().getName());
		Test t = new Test();
	    t.start();

	}
	
	@Override
	public void run() {
		System.out.println("Executing thread .............");
		System.out.println(Thread.currentThread().getName());
	}
	
    
}
