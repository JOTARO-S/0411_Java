package jp.sample4;

/* コマンドライン引数
 *  プログラムの処理は行わずに処理の値のみを変更する場合や外部ファイルの読み込みを行うときに使える
 *  コマンドライン引数とは実行時にプログラムへ値を渡すことがkできる引数(値)
 * 
 *  main()メソッド
 *  public static void main(String[] args) {}
 *  
 * 	コマンドプロンプトやeclipseなどから入力することができる。
 * コマンドプロンプトでjavacコンパイルをして実行する
 * java Sample4_6.java , javac Sample4_6.java でファイルを作成し、その後
 * java Sample 佐藤 鈴木 山田 のように送信 
 * 
 * Eclipseの場合
 * 実行＜実行構成
 * メインタブ内のメイン・クラス(M) :に実行するファイルを検索
 * (x)=引数のタブを押してプログラムの引数(A): に値を入力する
 * 
 * これでargs[]に格納される
 *  
 *  
 */

public class Sample4_6 {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
	}	
}