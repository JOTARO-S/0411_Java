package jp.ssie.ocjp;

public class Practice0415_13 {
	public static void main(String[] args) {

		//Practice0415_13
		
		int a = 100;
		int b = 200;
		System.out.println("aは" + a +"です");
		System.out.println("bは" + b +"です");
		
		int sub = a;
		a = b;
		b = sub;
		
		System.out.println("aは" + a +"です");
		System.out.println("bは" + b +"です");
	}
}