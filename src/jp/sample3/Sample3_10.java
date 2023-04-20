package jp.sample3;

//import java.util.Scanner;

/* break文とcontinue文
 * 	for文、while文、do-while文の繰り返し文は条件式がTrueである場合ループし続けられていたが、
 * 	処理の途中でループから抜けたい場合に break文と continue文が使われる。
 * 
 * break文は、繰り返しの途中でその繰り返しを強制的に抜ける。
 * 繰り返し文の無限ループから抜け出す場合にも使用する。
 * 
 * for文
 * 
 * 		   	break無								 break有
 * 
 * for(初期化;条件式;継続処理;) {		for(初期化;条件式;継続処理;) {
 * 			処理1; 実行							処理1;
 * 			処理2; 実行							break; ← break文があるため処理はここで終了する
 * 			処理3; 実行							処理2;  実行されない
 * 	}											処理3;  実行されない
 *										}
 *  次の処理								
 * 										次の処理
 * 
 * while文
 * 
 * while(条件式) {						while(条件式) {
 * 		処理1; 実行							処理1;
 * 		処理2; 実行							break; ← break文があるため処理はここで終了する
 * 		処理3; 実行							処理2;  実行されない
 * 	}										処理3;  実行されない
 *										}
 *  次の処理								
 * 										次の処理
 * 
 * 
 * 
 */


public class Sample3_10 {
	public static void main(String[] args) {
		for(int i = 0; ; i++) { //i = 0で初期化, 条件式がないため本来であれば無限に実行される, 処理後 i の 値 を 1 加算する
			if ( i == 3) { // i の 値 が 3になったらTrue
				break; // if文がTrueの時にbreakで処理を終了させる
			}
			System.out.println("i = " + i);
		}
		System.out.println("for文の後の処理");
	}
}