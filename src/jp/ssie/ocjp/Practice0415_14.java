package jp.ssie.ocjp;

public class Practice0415_14 {
	public static void main(String[] args) {

		//Practice0415_14
		
		int a = 30;
		int b = 20;
		int c = 50;
		int max = a;
		int min = a;
		
		if (max < b) {
			max = b;
		} else if (max < c) {
			max = c;
		}
		
		if (min > b) {
			min = b;
		} else if (min > c) {
			min = c;
		}
		
		if (min < a && a < max) {
			System.out.println(max);
			System.out.println(a);
			System.out.println(min);
		} else if (min < b && b < max) {
			System.out.println(max);
			System.out.println(b);
			System.out.println(min);
		} else if (min < c && c < max) {
			System.out.println(max);
			System.out.println(c);
			System.out.println(min);
		}
	}
}