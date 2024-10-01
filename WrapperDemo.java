package module6;

public class WrapperDemo {

	public static void main(String[] args) {

		String str = "100";
		String str1 = "200";
		String str2 = "300.90";
		String str3 = "200.10";
		char c = 'A';
		char h = 'a';
		System.out.println("Total is: " + (Integer.parseInt(str) + (Integer.parseInt(str1))));
		System.out.println("--------------------------------------");
		System.out.println("Total is: " + (Double.parseDouble(str3) + (Double.parseDouble(str2))));
		System.out.println("--------------------------------------");
		System.out.println("Total is: " + (Float.parseFloat(str3) + (Float.parseFloat(str2))));
		System.out.println("--------------------------------------");

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}
