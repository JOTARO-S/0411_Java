
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
	
	低レベルストリーム	 
		 	
	FileInputStreamクラス
		
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
		 																											など 12p参照
 * 			
 * 		ストリーム接続はバイトデータや文字データのみを取り扱うため、ディレクトリに対しては使用できず、
 * 		通常のファイルのみを作成できることに注意(FileNotFoundException例外やIOException例外が発生する)		
 * 
 * 		FileまたはStringの引数をとるFileInputStreamのコンストラクタのシグニチャ
 * 			public FileInputStream(...) throws FileNotFoundException
 * 
 * 		ここで発生した例外は呼び出し元にオブジェクトを転送する指定をしていて、FileNotFoundExceptionのクラス階層は
 * 		親にRuntimeExceptionをもっていないため、例外処理コードが必須となる。
 * 		FileInputStreamクラスのオブジェクトを作成したあとは、そのオブジェクトを使って次のメソッドを呼び出すことでデータを読み込む。
 * 
 * 		int read() throws IOException
 * 			1バイトのデータを読み込む。ファイルの終端に到達した場合は-1をそれ以外の場合は次のバイトデータを返す
 * 		int close() throw IOException
 * 			入力ストリームを閉じ、そのストリームに割り当てられたシステムリソースがあれば全て開放する			など 13p参照
 * 
 * 	FileOutputStreamクラス
 * 
 * 		FileOutputStreamは、ファイルに対しバイト単位の出力を行うストリーム
 * 		FileOutputStreamクラスをインスタンス化すると指定したファイルへ接続される。
 * 		FileInputStreamと同様に接続を生成したいファイルのしては、ファイル名の指定またはFileDescriptorオブジェクトの指定によって行うことが出来る。
 * 
 * 		FileOutputStreamクラスのコンストラクタ(一部)
 * 			FileOutputStream(File file) ⇒ fileで指定される、ファイルシステム内の実際のファイルへの接続を開くことでFileOutputStreamオブジェクトを作成。
		 								　このファイル接続を表すために新しいFileDescrioptorオブジェクトが作成される。
		 	FileOutputStream(String name) ⇒
		 	FileOutputStream(FileDescrioptor fdObj) ⇒
		 																										など 14p参照
 * 		FileInputStreamと同様に何かしらの理由でFileOutputStreamオブジェクトが生成出来なかった場合、
 * 		FileNotFoundException例外やIOException例外が発生する。
 * 		また、インスタンス化できたものの、何かしらの理由でファイルに書き込みが行えない場合はIOException例外が発生する。
 * 
 */

package jp.ssie.ocjp.exam0424;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_3 {
	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			inputFile = new File("C:\\pleiades\\test0424\\ocjp.txt");
			outputFile = new File("C:\\pleiades\\test0424\\ocjpcopy.txt");
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException occurs");
		} catch(IOException e) {
			System.out.println("IOException occurs");
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch(IOException e) {
				System.out.println("close fail");
				e.printStackTrace();
			}
		}
	}
}