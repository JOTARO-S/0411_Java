package jp.ssie.ocjp;

/* Javac コマンドのオプション
 * 
 * -d オプション
 * 	コンパイルする際に -d オプションを用いてコンパイルすると自動的にtestフォルダが作成される。
 * 	-d のあとにクラスファイルの生成場所を記載しなければならない( . はカレントディレクトリなのでパッケージに沿った場所となる)
 * 	package jp.test の場合　⇒ jpフォルダ、jpフォルダ内にtestフォルダが生成されてその中にクラスが格納される。
 * 
 * 	javac -d クラスファイルの生成場所 コンパイル対象のソースファイル名
 * 
 * 	javac -d . Sample5_16.java
 * 
 * -d オプション以外にも多くのオプションがある
 * 		-d: クラスファイルの出力先を指定します。
 *		-classpathまたは-cp: クラスパスを指定します。
 *		-sourcepath: ソースファイルの検索パスを指定します。
 *		-verbose: コンパイル時の詳細情報を表示します。
 *		-nowarn: 警告を無視します。
 *		-encoding: ソースファイルの文字コードを指定します。
 *		-g: デバッグ情報を含めます。
 *		-target: コンパイル後のクラスファイルのバージョンを指定します。 など
 * 
 * 
 */

public class Sample5_16 {
	public static void main(String[] args) {
		System.out.println("-dオプションの使用例");
		
	}
}