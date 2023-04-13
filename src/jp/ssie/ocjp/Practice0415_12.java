package jp.ssie.ocjp;

public class Practice0415_12 {
	public static void main(String[] args) {

		//Practice0415_12
		
		int num = 2021;
		if (num % 400 == 0) {
			System.out.println("閏年です");
		} else if(num % 100 == 0) {
			System.out.println("平年です");
		} else if(num % 4 == 0) {
			System.out.println("閏年です");
		} else {
			System.out.println("平年です");
		}
	}
}