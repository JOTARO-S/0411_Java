package jp.sample7;

/* 例外処理
 * 
 * Javaクラスではアプリケーションの実行中に発生する予期せぬ現象を例外と言う。
 * 	例外が発生することを例外がスローされるといい、例外により、プログラムの表人の実行制御フローが変更されている。
 * 	このようなメカニズムの主なメリットは、
 * 		プログラムの実行時に起こり得るエラーによって異常終了することを未然に防ぐこと
 * 		正常処理と以上処理に分離することにより可読性が向上すること
 * 
 * 		例外はchecked例外(チェック処理)とunchecked(非チェック処理)の２つに分けられる。
 * 		
 * 		check例外(チェック処理)⇒データベースなどのJava実行環境以外での処理が原因で発生する例外
 * 
 * 		uncheck例外(非チェック処理)⇒実行中のプログラム内で起きうる処理が原因で発生する例外　この場合での例外処理は必須ではない
 * 
 * 標準例外
 * 	Errorのサブクラスの実行時例外
 * 		ExceptionInInitializerError など
 * 
 * 	RuntimeExceptionのサブクラス実行時例外
 * 		ArrayIndexOutOfBoundsException など
 * 
 * 	RuntimeExceptionのサブクラス以外のExceptionのサブクラスチェックされる例外
 * 		IOException など
 * 
 * 
 * 独自例外クラスの定義
 * 	独自で例外クラスを定義することも可能
 * 	一般的にはExceptionクラスを継承したpublicなクラスとして定義される。
 * 
 * 		【修飾子】class クラス名 extends Exception { }
 * 
 * 	Exceptionクラスを継承することによって、スーパークラスのThrowableクラスが提供しているメソッドに引き継ぐことになる。
 * 	Throwableクラスには例外からエラーメッセージを取り出すメソッド、エラーを追跡し発生個所を特定するメソッドなどが提供される。
 * 
 * 		void printStackTrace() ⇒ エラーを追跡し発生個所を特定
 * 		String getMessage() ⇒ エラーメッセージを出力
 * 
 * tryブロックとcatchブロック
 * 	例外の原因となる操作(メソッド)が実行されると、例外がスローされる。
 * 	この例外をキャッチして処理する場合は、tryブロックとcatchブロックを使用する。
 * 
 * 		try {
 * 		//例外が発生する可能性がある文;
 * 		} catch(例外クラス 変数名) {
 * 		//例外が発生したときに行う処理
 * 		}
 * 
 * 		tryブロックは例外が発生しそうな処理を囲む
 * 		catchブロックが実行されるのは対応するtryブロックの内側で発生した例外をキャッチする場合だけである。
 * 
 */

public class Sample7_1 {
	public static void main(String[] args) {	
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y: " + x / y);
			System.out.println("x * y: " + x * y);
		} catch (ArithmeticException ae) {
			System.out.println("発生した例外: " + ae);
		}
		System.out.println("x - y: " + (x - y));
	}
}