package ImplementRunnable;
class MyThread implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
	
}
}
public class ImplRun  {
public static void main(String[] args) {
	int n = 10;
	for (int i = 0; i < n; i++) {
	Thread thread = new Thread(new MyThread());
	thread.start();
	}
}
	
}


