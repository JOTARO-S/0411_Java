package jp.sample7;

/* 複数のcatchブロック
 * 	複数のcatchブロックが定義されている場合、発生した例外と同じクラスもしくはそのスーパークラスがあるかないかを上から順番に比較する。
 * 	ここでの注意点は発生した例外をcatchブロックでキャッチする際にその例外クラスのスーパークラスでもキャッチできるということ。
 * 	ただし、発生した例外ごとに適切な対応が異なる場合には不向き。
 * 
 * 	catchブロックの規則
 * 		特定の例外に対しては、実行制御が最初に検出した１つの関連するcatchブロックしか実行されない
 * 		catchブロックで指定した例外クラス間に継承関係がある場合、記述する順番はサブクラスからになる。
 * 		この規則から外れるとコンパイルエラーになる。
 * 
 * 
 */

public class Sample7_3 {
	public static void main(String[] args) {	
		int[] x = {0, 1, 2, 3, 4 };
		try {
			System.out.println("x[6]:" + x[6]); //配列[6]は存在していない
			System.out.println("x[3]: "+ x[3]); 
		} catch (ArithmeticException ae) { //算術演算の例外
			System.out.println("発生した例外: " + ae);
		} catch (ArrayIndexOutOfBoundsException oe) { //配列の例外(要素数やインデックスが負だった場合など)
			System.out.println("Array index out of bound!");
		} catch (IndexOutOfBoundsException ie) { //配列などで範囲外である
			System.out.println("Sone kind of index out of bound!");
		} finally {
			System.out.println("Finally block must be executed!");
		}
		System.out.println("x[0]: " + x[0]);

	}
}