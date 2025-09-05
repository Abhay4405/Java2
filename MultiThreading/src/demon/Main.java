package demon;

public class Main extends Thread{
@Override
public void run() {
	System.out.println("Thread name : " + Thread.currentThread().getName());
	System.out.println("Is it a Demon Thread : " + Thread.currentThread().isDaemon());
}
public static void main(String[] args) {
	Main a = new Main();
	Main b = new Main();
	a.setDaemon(true);
	a.start();
	b.start();
}
}
