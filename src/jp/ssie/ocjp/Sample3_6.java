package jp.ssie.ocjp;

/* 繰り返し
 * for文
 * 
 * for(初期化; 条件式; 継続処理) {
 * 		繰り返し処理;
 * }
 * 				 初期化										条件式									継続処理
 * int x = 1 ⇒ x を int型 の 変数で 1を代入する, x <= 10 ⇒ x の 値 が 10以下の時に繰り返す, x++ ⇒ x の 値 を 1 増やす
 * for (int x = 1; x <= 10; x++) { 
 * 		System.out.print(x); // 繰り返し処理
 * }
 * 
 * 上限があるときfor文、上限がないときwhile文を使ったりなどする（人それぞれ）
 * 
 */


public class Sample3_6 {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) { //()の中で宣言された変数(この場合はx)はforの中でしか利用することが出来ない
			System.out.print(x); //System.out.print(); は System.out.println();と違い改行されない
		}
		
		System.out.println(); //改行
		
		int y = 1; //初期化はループ外でも可能、forの外で宣言されているためforの外でも変数を利用することが出来る
		for (; y <= 10; y++) { //この場合()内の初期化は;だけとなる
			System.out.print(y);
		}
		
	}

}