package jp.sample3;

//import java.util.Scanner;

/* break文とcontinue文
 * 	for文、while文、do-while文の繰り返し文は条件式がTrueである場合ループし続けられていたが、
 * 	処理の途中でループから抜けたい場合に break文と continue文が使われる。
 * 
 * continue文は、残りの処理ブロックはスキップするがループ自体は抜けず、
 * その繰り返し文の条件式に移動し、再び繰り返し処理の初めから実行する。
 * 繰り返し文の中でのみ有効になるため、ループの外側に記述するとエラーになる。。
 * 
 * for文
 * 
 * 		   	continue無								 continue有
 * 
 * for(初期化;条件式;継続処理;) {		for(初期化;条件式;継続処理;) {
 * 			処理1; 実行							処理1;
 * 			処理2; 実行							continue; ← continue文があるため処理はここで終了し、次の繰り返し処理に移行する
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
 * 		処理2; 実行							continue; ← continue文があるため処理はここで終了し、次の繰り返し処理に移行する
 * 		処理3; 実行							処理2;  実行されない
 * 	}										処理3;  実行されない
 *										}
 *  次の処理								
 * 										次の処理
 * 
 * 
 * 
 */


public class Sample3_11 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) { //i = 0で初期化, i が 10未満の時に繰り返し処理が実行する, 処理後 i の 値 を 1 加算する
			if (( i % 3) == 0) { // i の 値 が 3 で割り切れる場合True
				continue; // if文がTrueの時にcontinueで処理を終了させ、i < 10 であれば次の処理が実行される。
			}
			System.out.println("i = " + i); // continueされた場合は、printlnで出力されない
		}
		System.out.println("for文の後の処理");
	}
}