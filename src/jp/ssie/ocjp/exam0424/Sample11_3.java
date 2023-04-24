
/*
 * Java(応用編)
	ストリーム
		Javaはファイルの中身を読み取ったり、ファイルに書き込んだりする場合ストリームを使用する
		ソースまたはディスティネーションがファイルでもソケットでも常にデータはストリーム内を移動している。
		
		ソースまたはディスティネーションはファイルやソケットであるかなどは関係せず、次の手順で実行される
		1, ストリームを開く
		2，データが存在する限り読み取りまたは書き込みを継続する
		3, ストリームを閉じる
		
	ストリームは以下2種類存在する
		低レベルストリーム　⇒　バイトや文字としてデータを読み書きする
		高レベルストリーム　⇒　低レベルストリームからバイト単位でデータを読み込んで書式化されたデータを呼び出し側に返す(またはその逆向き)
		
	低レベルストリームの例として FileInputStreamとFileOutputStreamなどがある
		 FileInputStreamクラス ⇒ ファイルからバイト単位の入力を行うストリーム
		 FileInputStreamクラスをインスタンス化すると指定したファイルへの接続が行われる。
		 プログラムと接続させたいファイルの指定には3つの方法がある。
		 	1, ファイルシステム内の実際のファイルを表すFileオブジェクトを指定する
		 	2, ファイルシステム内の実際のファイルへのパスをString型で指定する
		 	3, ファイルシステム内の実際のファイルへの接続を表すFileDescrioptorオブジェクトを指定する
		 
		 FileInputStreamクラスのコンストラクタ(一部)
		 	FileInputStream(File file) ⇒ fileで指定される、ファイルシステム内の実際のファイルへの接続を開くことでFileInputStreamオブジェクトを作成。
		 								　このファイル接続を表すために新しいFileDescrioptorオブジェクトが作成される。
		 								
		 	FileInputStream(String name) ⇒ 
		 	FileInputStream(FileDescriptor fdObj) ⇒ 
 * 			
 * 		ストリーム接続はバイトデータや文字データのみを取り扱うため、ディレクトリに対しては使用できず、
 * 		通常のファイルのみを作成できることに注意(FileNotFoundException例外やIOException例外が発生する)		
 * 
 * 		FileまたはStringの引数をとるFileInputStreamのコンストラクタのシグニチャ
 * 			public FileInputStream(...) throws FileNotFoundException
 * 
 * 		ここで発生した例外は呼び出し元にオブジェクトを転送する指定をしていて、FileNotFoundExceptionのクラス階層は
 * 		親にRuntimeExceptionをもっていないため、例外処理コードが必須となる。
 * 
 * 
 */

package jp.ssie.ocjp.exam0424;

public class Sample11_3 {
	public static void main(String[] args) {

		
	}
}