package module6;

public class AutoboxDemo {

	public static void main(String[] args) {
		int a = 100;
		Integer i = a;// autoboxing
		System.out.println(i);
		System.out.println("--------------------------");
		int b = i;// unboxing
		System.out.println(b);
	}

}
