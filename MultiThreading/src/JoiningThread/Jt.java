package JoiningThread;

import java.util.Iterator;

public class Jt extends Thread {
 @Override
public void run() {
	 for (int i = 0; i < 5; i++) {
		 
	 try {
		Thread.sleep(5000);
	} catch (Exception e) {
		System.out.println(e);
	}
	 System.out.println(i);
	 
	 }
}
 public static void main(String[] args) {
	Jt t1 = new Jt();
	Jt t2 = new Jt();
	Jt t3 = new Jt();
	t1.start();
	try {
		t1.join();
	} catch (Exception e) {
		System.out.println(e);
	}
	t2.start();
	t3.start();
}
}
