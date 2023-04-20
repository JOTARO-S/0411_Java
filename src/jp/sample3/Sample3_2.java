package jp.sample3;

import java.util.Scanner; //Scannerを使用する際はimportの記述が必要となる (Scannerの記述後にshift + Ctrl + O で自動的に入力できる)

/* if文
 *　if(条件式) {
 * 		処理1;
 * 　} else {
 * 		処理2;
 * }
 */


public class Sample3_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in); //Scannerクラスのインスタンスを宣言する(HTMLのinput的なもの)
		int x = sc.nextInt();
		
		if (x == 100) { // xの値が100の時、Trueを返す
			System.out.println("Xの値は100です。"); //Trueの場合の処理
		} else { 
			System.out.println("Xの値は100以外です。"); //falseの場合の処理
		}
		sc.close(); //最後にcloseしなければならない
	}

}