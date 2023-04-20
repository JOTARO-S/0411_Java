package jp.sample3;

/* 繰り返し
 * while文
 * 
 * while (条件式) {
 * 		繰り返す処理;
 * }
 */


public class Sample3_7 {
	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		while (cnt <= 10) { // cnt の値が10以下の場合繰り返す
			sum += cnt; // sum + cnt を 実施
			cnt++; // cnt の 値を 1 増加 させる
		} //ここまでの処理を条件式が達成されるまで繰り返す
		
		System.out.println("1から10までの総和は" + sum + "です。");
		
	}

}