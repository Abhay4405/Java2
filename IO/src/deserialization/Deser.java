package deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class Std{
	Std(int id,String name){
		System.out.println(id+name);
	}
}
public class Deser {
public static void main(String[] args)throws IOException, ClassNotFoundException {
	ObjectInputStream inps = new ObjectInputStream(new FileInputStream("abc.txt"));
	Std std = (Std) inps.readObject();
	System.out.println(std);
}
}
