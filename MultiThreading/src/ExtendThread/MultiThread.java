package ExtendThread;

import java.util.Iterator;

class MtEg extends Thread {
	@Override
	public void run() {
		System.out.println("thread " + Thread.currentThread().getId() + " is running");
	}
}

public class MultiThread {
	public static void main(String[] args) {
	int n = 5;
	for (int i = 0; i < n; i++) {
		MtEg eg = new MtEg();
		eg.start();
	}
	}
}
