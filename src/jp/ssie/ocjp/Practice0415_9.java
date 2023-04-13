package jp.ssie.ocjp;

public class Practice0415_9 {
	public static void main(String[] args) {
		
		//Practice0415_9
		
		int a = 155;
		int b = 43;
		if (a < b) {
			System.out.println("大きいほうの値は" + a + "です");
			System.out.println("小さいほうの値は" + b + "です");
		} else if (b < a) {
			System.out.println("大きいほうの値は" + b + "です");
			System.out.println("小さいほうの値は" + a + "です");
		} else if (a == b) {
			System.out.println("2つの値は同じです");
		}
	}
}