import java.io.*;
class Serialization{
public static void main(String[] args){
	try{
		Myclass object1 = new Myclass("Hello",-7);
	FileOutputStream fos = new FileOutputStream("serial");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object1);
		oos.flush();
		oos.close();
	}
	catch(Exception e){
		System.out.println("Srial" + e);
		System.exit(0);
	}
	try{
		Myclass object2;
		FileInputStream fis = new FileInputStream("serial");
		ObjectInputStream ois = new ObjectInputStream(fis);
		object2 = (Myclass) ois.readObject();
		ois.close();
		System.out.println(object2);
	}
	catch(Exception e){
		System.out.print("deser" + e);
		System.exit(0);
	}
}
}

class Myclass implements Serializable{
	String s;
	int i;
	double d;
	Myclass(String s, int i){
		this.i = i;
		this.s = s;
	}
}