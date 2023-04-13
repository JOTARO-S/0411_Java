package jp.ssie.ocjp;

public class Practice0415_4 {
	public static void main(String[] args) {

		//Practice0415_4
		
		int num = 101;
		if(0 <= num && num < 60) {
			System.out.println("不可");
		} else if (num >= 60 && num < 70) {
			System.out.println("可");
		} else if (num >= 70 && num < 80) {
			System.out.println("良");
		} else if (num >= 80 && num <= 100) {
			System.out.println("優");
		} else {
			System.out.println("不正な点数です");	
		}
	}
}