package jp.ssie.ocjp;

public class Practice0417_2 {
	public static void main(String[] args) {
	//Practice0417_2
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

