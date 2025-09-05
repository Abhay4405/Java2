package sync;

import java.util.Iterator;

class Table{
	synchronized void printTable(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread {
	Table t;
	 MyThread1(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	 MyThread2(Table t) {
		this.t = t;
	}
	public void run() {
		t.printTable(6);
	}
}

public class Ts1 {
public static void main(String[] args) {
	Table table = new Table();
	MyThread1 t1 = new MyThread1(table);
	MyThread2 t2 = new MyThread2(table);
	t1.start();
	t2.start();
}
}
