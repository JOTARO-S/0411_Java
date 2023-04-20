package jp.sample7;

/* ライブラリ使用時の注意
 * 		使用するクラスによっては例外処理の必須または任意かを判断することが出来る。
 * 	
 * 		(java.io) FileReaderクラスのコンストラクタ FileNotFoundException ⇒ 例外処理　必須
 * 		ファイルを読み込むときに使用するコンストラクタ、このExceptionはRuntimeExceptionをスーパークラスに持たないため例外処理が必須となる。
 * 
 * 		(java.lang)Integerクラスのメソッド NumberFormatException ⇒ 例外処理 任意
 * 		整数を表す文字列をint型に変換するときに使用するメソッド
 * 		
 * 		(java.lang)Stringクラスのメソッド piblic boolean equals(Object anObject) ⇒ 例外処理 任意
 * 		文字列の内容が同じかどうかを比較するときに使用するメソッド
 * 
 * オーバーライドするメソッドでの例外の宣言
 * 	クラスはスーパークラスから継承したメソッドをオーバーライドできるが、その場合はthrowsで指定できる例外クラスに制限が課せられる。
 * 	サブクラスでスーパークラスのメソッドをオーバーライドする場合、元のメソッドがスローする例外かそのサブクラスでなければならない。
 * 	
 * 	スーパークラスのメソッドにtrowsがある場合、サブクラス川でthrowsを記述しなくても可能であることなど、throwsの使用にあたっていくつかのルールがある。
 * 		throwsは、スーパークラスのメソッドに指定した例外クラスとそのサブクラスに指定できる。
 * 		RunTimeExceptionクラスとRuntimeExceptionのサブクラスは制約なしにthrowsに指定できる。
 * 		スーパークラスのメソッドにthrowsがあってもthrowsを記述しなくてもよい。
 * 
 * 例外処理のマルチキャッチ
 * 	JavaSE7から複数の例外をまとめてキャッチするマルチキャッチが可能となった。
 * 	ひとつのcatchブロックで各冷害を「 | 」(パイプ)で区切ることによって複数の例外をキャッチすることが可能。
 * 
 * 		public class Sample {
 * 			public static void main(String[] args) {
 * 				try {
 * 					System.out.println(10 / 0);  // ArithmeticException 発生
 * 					FileReader rf = new FileReader("aaa"); //FileNotFoundException 発生
 * 				} catch (FileNotFoundException | ArithmeticException e) {
 * 					System.out.println(e.getMessage());
 * 				}
 * 			}
 * 		}
 * 
 * 
 * 	ただし、継承関係がある例外クラスを列記することはできない。
 * 
 * 		try { } catch(FileNotFoundException | IOException | ArithmeticException e) { } などはコンパイルエラーとなる。
 * 
 * 
 */

public class Sample7_5 {
	public static void main(String[] args) {	
		
	}
}