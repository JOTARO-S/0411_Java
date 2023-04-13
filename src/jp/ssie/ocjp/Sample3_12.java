package jp.ssie.ocjp;

//import java.util.Scanner;

/* ラベル
 * 	ネストされた繰り返し文など1回で一番外側のループブロックを抜けるためにラベルを使用する。
 * 	ラベルは抜け出したい場所に任意に記載することが出来る。
 * 
 * 
 * ラベル名:
 * for(初期化;条件式;継続処理;) {
 * 		for(初期化;条件式;継続処理;) {
 * 				処理;						
 * 				break ラベル名;
 * 		}					
 * 	}										
 *									
 */


public class Sample3_12 {
	public static void main(String[] args) {
		label1: for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i * j > 20) { // i * j が 20 より大きくなったら label1 のfor文が break される
					break label1; // label1( i の for文)がbreakされるため、（この場合）全ての処理が終了する
				}
				if(i == 1) { // i の 値 が 1 の場合 break される
					break; //for ( int j = 1; j < 10; j++)のfor文がbreakされて処理が終了するため、i の処理は引き続き実行される
				}
				if(j % 2 == 1) { // j の 値 が 2 で割って 1 の場合 continue される
					continue; //このcontinue文ではfor ( int j = 1; j < 10; j++)のfor文がcontinueされるので引き続き処理が続行される
				}				//そのため、System.out.println(i * j)で結果が出力されない 
				System.out.println(i * j); //全てのif文を通過したもののみ結果が表示される
			}
		}
	}
}