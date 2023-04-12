package jp.ssie.ocjp;

/*	1. 1から30までの数を表示
 *  2. 1から30までの奇数を表示
 *  3. 2または3で割り切れる数字を表示
 */	


public class Test_0412 {
	public static void main(String[] args) {
		
		int num = 1;
		
	// 1. 1から30までの数を表示	
		while (num <= 30) {
			System.out.print(num);
			num++;
		}
		
		System.out.println(); //改行

	// 2. 1から30までの奇数を表示
		num = 1;	
		while (num <= 30) {
			if (num % 2 == 1) {
				System.out.print(num);
			}
			num ++;	
		}
		
		System.out.println(); //改行
		
	//  3. 2または3で割り切れる数字を表示	
		num = 1;
		while (num <= 30) {
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.print(num);
			}
			num++;
		}
		
	}
}