
/*
 * Java(応用編)

 * 
 * Javaの入出力管理
 * 	Javaにおけるファイル処理
 * 		Javaはストリーン(後述)を使用することによってファイルやソケットなど任意の入出力デバイス上で
 * 		入出力処理を簡単に行うことが出来る。
 * 	Fileクラス
 * 		java.ioパッケージのFileクラスを使用するとプログラム中でファイルを表しOSに依存せずファイルシステムを操作できるようになる。
 * 	パス名(抽象パス名)
 * 		Javaではパス名を次のように取り扱う
 * 			パスの先頭のための文字列。　Unixでルートディレクトリを表す"/ ", Windowsでドライブを表す" c: "、
 * 			ホストを表す" \\\\ "(Javaエスケープ文字を使った表現)など除外する。
 * 			名前(文字列)の列。　「名前の列」の最後の名前はファイル名かディレクトリ名、それ以外はディレクトリ名
 * 
 * 			例)　C:\Program Files\ATI\CIM\Config ⇒ Program Files/ATI/CIM/Config
 * 				/home/hogehoge/data/mail ⇒ home/hogehoge/data/mail
 * 
 * 	ファイルのパス名とFileクラスのコンストラクタ
 * 	Fileクラスを使うためには、パス名が必要となる。そして、今までのクラスと同じようにFileクラスを効果的に使うには、
 * 	コンストラクタについて理解する必要がある。
 * 
 * 	Fileクラスのコンストラクタ(一部
 * )
 * 		File(String pathname) ⇒ String型のpathnameを抽象パス名に変換して、Fileクラスのオブジェクトを作成する
 * 
 * 		File(String parent, String child) ⇒ 親パス名および子パス名をもとにFileクラスのオブジェクトを作成する。Parentがnullの場合、
 * 						childをもとにオブジェクトを作成するため、上で説明した引数が1つとなるコンストラクタの呼び出しと同じふるまいをする。
 * 						そうでない場合、parentはディレクトリを表し、childはディレクトリまたはファイルを表す。
 * 
 * 		File(File parent, String child) ⇒ File型のparent抽象パス名とString型のchildパス名から抽象パス名を構築して、Fileクラスのオブジェクトを作成する。
 * 
 * 	Fileクラスのオブジェクトは不変
 * 		これはパス名を指定して一度Fileオブジェクトを作成すると、ソノオブジェクトによって表される抽象パス名は決して変わらないことを意味している。
 * 			
 * 	必要に応じて次のコードを使ってシステム依存のファイルセパレータを取得できる。
 * 		String fs = System.getProperty("file.separator";
 * 
 * 	何らかの理由によりWindowsベースのファイルセパレータを使いたい場合は、C:¥¥temp¥¥test.txt のように
 * 	エスケープシーケンス( \ ) を使用し、 \をエスケープする必要がある。
 * 
 */

package jp.ssie.ocjp.exam0424;
import java.io.File;
import java.io.IOException;

public class Sample11_1 {
	public static void main(String[] args) {
		try {
			File f1 = new File("C:\\ocjp");
			File f2 = new File(".", "temp/log.txt");
			File f3 = new File(f1, "./Sample.java");
			
			System.out.println("path for f1: " + f1.getCanonicalPath());
			System.out.println("path for f2: " + f2.getCanonicalPath());
			System.out.println("path for f3: " + f3.getCanonicalPath());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
