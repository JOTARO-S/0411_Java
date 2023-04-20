package jp.Practice.p0415;

public class Practice0415_15 {
	public static void main(String[] args) {

		//Practice0415_15
		
		double height = 1.7;
		double weight = 0;
		if (weight / (height * height) < 18.5) {
			System.out.println("痩せ");
		} else if (weight / (height * height) < 25) {
			System.out.println("普通");
		} else if (25 <= weight / (height * height)) {
			System.out.println("肥満");
		}
	}
}