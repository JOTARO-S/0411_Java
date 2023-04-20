package jp.sample7;

/* finallyブロック
 * 	例外が発生しても必ず実行したい処理を行う際に使用する。
 * 
 * 		finally {
 * 			//必ず実行したい処理
 * 		}
 * 
 * 		try-catchによる例外処理では、例外が発生しなければtryブロックの中の文が１行ずつ実行され、
 * 		catchブロックに制御が移ることがないが、例外が発生するとtryブロックの残りの文はスキップされ、catchブロックに制御が移る。
 * 		もし、例外が発生してもしなくても必ず実行したい処理がある場合はfinallyブロックを記述する。
 * 		
 * 		try {
 * 			//例外が発生する可能性がある文
 * 		} catch {
 * 			//例外が発生した場合の処理
 * 		} finally {
 * 			//必ず実行したい処理
 * 		try {
 * 			//例外が発生する可能性がある文
 * 		} catch {
 * 			//例外が発生した場合の処理
 * 		}
 * 
 * 		などといった記述も出来る。
 * 
 * 		finallyブロックが実行されない場合もある
 * 			例外がfinallyブロック内で発生した場合やfinallyブロックの実行前にSystem.exit()メソッドが呼び出された場合など
 * 
 */

public class Sample7_2 {
	public static void main(String[] args) {	
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y: " + x / y);
			System.out.println("x * y: " + x * y);
		} catch (ArithmeticException ae) {
			System.out.println("発生した例外: " + ae);
		} finally {
			System.out.println("finallyブロック。必ず実行されます。");
		}
		System.out.println("x - y: " + (x - y));
	}
}