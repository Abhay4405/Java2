package interrupt;

public class T1 extends Thread {
@Override
public void run() {
	try {
		Thread.sleep(1000);
		System.out.println("task");
	} catch (Exception e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	T1 t1 = new T1();
	t1.start();
	try {
		t1.interrupt();
	} catch (Exception e) {
	System.out.println(e);
	}
}
}
