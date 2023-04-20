package jp.sample3;

/* 繰り返し
 * do-while文
 * 最低1回は繰り返し処理を実行したい場合に使用
 * 
 * do {
 * 		繰り返し処理;
 * } while (条件式);
 */


public class Sample3_8 {
	public static void main(String[] args) {
		int a = 11;
		do { //do-whileなので繰り返し処理が最低1回は実行される
			System.out.println(a); //繰り返し処理1 
			a++; // 繰り返し処理2( 1回は実行されるので a が 11以上の場合でも 1 は加算される)
		} while ( a <= 10); //while文(条件式) a が 10 以下の場合繰り返す
		
		

		/*	1.1から30までの数を表示
		 *  2.1から30までの奇数を表示
		 */	
		
		
		
		
	}
}