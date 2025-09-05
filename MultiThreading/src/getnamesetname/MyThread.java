package getnamesetname;

public class MyThread extends Thread {
@Override
public void run() {
	System.out.println("My Thread is running" + Thread.currentThread().getName().getBytes());
}
public static void main(String[] args) {
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
	System.out.println("Name of thread1 is " + t1.getName());
	System.out.println("Name of thread2 is " + t2.getName() );
	t1.start();
	t2.start();
	t1.setName("Abhay Dubey");
	System.out.println("After changing the name of t1 is " + t1.getName());
}
}
