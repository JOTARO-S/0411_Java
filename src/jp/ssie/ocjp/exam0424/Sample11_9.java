
/*
 * Java(応用編)
 * 
 * コンソール
 * 	Java SE 6から追加された java.io.Consoleクラス
 * 	Consoleクラスのオブジェクトを使用することで、コンソールからダイレクトに入出力を扱うことが出来る。
 * 	Consoleクラスのコンストラクタはprivate指定されているため、newによるインスタンス化はできない。
 * 	Consoleオブジェクトのインスタンス獲得はSystemクラスのconsole()メソッドを使用する。
 * 
 * 		Console console = System.console();
 * 
 * Consoleクラスのオブジェクトを獲得した後は、そのオブジェクトを使って次のメソッドを呼び出すことでデータの読み込みができる。
 * 
 * 		String readLine() ⇒ コンソールから単一行のテキストを読み込む
 * 		String readLine(String fmt, Object... args) ⇒ 書式設定されたプロンプトを提供し、次にコンソールから単一行のテキストを読み込む	
 * 		char[] readPassword() ⇒ エコーを無効にした(パスワード入力時の **** )コンソールからパスワードまたはパスフレーズを読み込む   
 * 		char[] readPassword(String fmt, Object... args) ⇒ 書式設定されたプロンプトを提供し、エコーを無効にした
 * 															コンソールからパスワードまたはパスフレーズを読み込む
 * 
 */

package jp.ssie.ocjp.exam0424;

public class Sample11_9 {
	public static void main(String[] args) {

		
	}
}