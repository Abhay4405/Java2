package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Std {
	Std(int id, String name) {
		System.out.println(id + name);
	}
}

public class Ser {
	public static void main(String[] args) throws IOException {
		Std std = new Std(12, "Abhay");
		FileOutputStream fout = new FileOutputStream("abc.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(std);
		out.flush();
		System.out.println("Success!");
	}
}
