package jp.sample3;

/* ネストする繰り返し
 * 
 * for文の中にfor文を使用するといったようなネスト(入れ子)にすることが出来る
 *
 */


public class Sample3_9 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) { //     int i = 0で初期化, i が 9未満の時に繰り返し処理し、処理後 i に 1 加算する 
			for (int j = 0; j < 9; j++) { // int j = 0で初期化, j が 9未満の時に繰り返し処理し、処理後 j に 1 加算する 
				int k = (i + 1) * (j + 1); //int k の 値 を (i + 1) * (j + 1) にする↓
													// (i(0) + 1) * (j(0) + 1),(i(1) + 1) * (j(0) + 1)...と繰り返される
				if(k < 10) { // k の 値 が 10 より小さい場合True 
					System.out.print("  " + k); //Trueの時、"  "(スペースが2つの状態)でkを出力する
				} else {
					System.out.print(" " + k); //Falseの時、" "(スペースが1つの状態)でkを出力する
				} // j の 値 が 9になるまで処理が繰り返される
			} // i に 1 加算され繰り返される(i の 値が 9 になるまで実行される)この時、j の 値 は 再度 j = 0 になる
			System.out.println(); //改行
		}
	}
}