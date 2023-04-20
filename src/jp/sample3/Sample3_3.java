package jp.sample3;

import java.util.Scanner;

/*  複数のif文
 * 
 * if(条件式1) { 
 * 		処理1;
 * } else if (条件式2) {
 * 		処理2;
 * } else {
 * 		処理3;
 * }

 */


public class Sample3_3 {
	public static void main(String[] args) {
		//int x = 85;
		Scanner sc = new Scanner(System. in);
		int x = sc.nextInt();
		if(x == 100) { //xが100(条件式1)だった場合Trueを出力する
			System.out.println("満点です！"); //x == 100(条件式1)がTrueだった場合処理を実行する
		} else if (x >= 80) { //xが80以上(条件式2)の場合Trueを出力する
			System.out.println("合格です！"); //x >= 80(条件式2)がTrueだった場合処理を実行する
		} else if (x < 80 && x >= 60) { //xが60以上、80未満(条件式3)の場合Trueを出力する
			System.out.println("がんばりました。"); //xが60以上、80未満(条件式3)がTrueだった場合処理を実行する
		} else { 
			System.out.println("もっとがんばりましょう。"); //(条件式1) ～ (条件式3)に当てはまらなかった場合処理を実行する。
		}
		sc.close(); 
		
	}

}