package Priority;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("running thread name is " + Thread.currentThread().getName());
		System.out.println("running thread priority is " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Abhay");
		t2.setName("Sahil");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		t1.setPriority(MIN_PRIORITY);
		t1.start();

	}
}
