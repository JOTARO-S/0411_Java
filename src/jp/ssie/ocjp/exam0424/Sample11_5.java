
/*
 * Java(応用編)
 * 
 *  リーダーとライター
 *	Javaには、バイトストリームのほうにもう1つ文字ストリームと呼ばれる種類のストリームもあり、
 *	16bit(Unicode)文字の単位で、入力デバイスからの読み取りと出力デバイスへの書き込みができる。
 *	これらのストリームはリーダーおよびライターとも呼ばれる。
 *
 *	低レベルのリーダーおよびライター
 *	低レベルのリーダーおよびライターストリームは、データを文字単位で扱う。
 *	これらを扱うクラスとしてFileReaderおよびFileWriterがある。
 *
 *	FileReaderクラス
 *		FileReaderクラスは、ファイルから読み込みをするときに使用されるクラスで、テキストファイルの読み取りに適している。
 *		FileReaderクラスをインスタンス化すると指定したファイルへの接続が行われる。
 *		接続を政令したいファイルの指定は、ファイル名の指定又は、FileDescrioptorオブジェクトの指定によって行うことが出来る。
 *
 *		FileReaderクラスのコンストラクタ(一部)
 * 			FileReader(File file)⇒ fileで指定されるファイルシステム内の実際ノファイルへの接続を開くことでFileReaderオブジェクトを作成できる
 * 			FileReader(String name)
 * 			FileReader(FileDescrioptor fdObj)																など 26p 参照
 * 
 * 		ストリーム接続は、ディレクトリではなく、通常のファイルを使ってのみ作成できる。
 * 		指定されたパスがファイルではなく、ディレクトリであるまたは、指定されたファイルが存在しないか作成できないなどの理由により、
 * 		FileReaderオブジェクトが生成できなかった場合、FileNotFoundException例外が発生する。
 * 		また、インスタンス化できたものの、何らかの理由で読み取りが行えない場合は、IOException例外が発生する。
 * 
 * 		FileまたはStringの引数を取るFileReaderのコンストラクタのシグニチャ
 * 			public FileReader(...) throws FileNotFoundException
 * 		
 * 		FileReaderクラスのオブジェクトを作成した後は、そのオブジェクトを使って次のメソッドを呼び出すことでデータの読み込みができる。
 * 
 * 		int read() throws IOException
 * 			1バイトのデータを読み込む。ファイルの終端に到達した場合は-1をそれ以外の場合は次のバイトデータを返す
 * 		void close() throw IOException
 * 			入力ストリームを閉じ、そのストリームに割り当てられたシステムリソースがあれば全て開放する			など 27p参照
 * 
 * 	FileWriterクラス
 * 		FileWriterクラスは文字データをファイルに書き込むためのクラス。
 * 		FileWriterクラスをインスタンス化すると指定したファイルへの接続が作成される。
 * 		FileReaderクラスと同様に接続したファイルの指定はファイル名の指定またはFileDescrioptorオブジェクトの指定によって行うことが出来る。
 * 
 * 		FileWriterクラスのコンストラクタ(一部)
 * 			FileWriter(File file)⇒ fileで指定されるファイルシステム内の実際ノファイルへの接続を開くことでFileWriterオブジェクトを作成できる
 * 			FileWriter(String name)
 * 			FileWriter(FileDescrioptor fdObj)																など 28p 参照
 * 
 * 		ストリーム接続は、ディレクトリではなく、通常のファイルを使ってのみ作成できる。
 * 		指定されたパスがファイルではなく、ディレクトリであるまたは、指定されたファイルが存在しないか作成できないなどの理由により、
 * 		指定されたファイルへの書き込みアクセスが出来ない場合は、IOException例外が発生する。
 * 
 * 		FileまたはStringの引数を取るFileWriterのコンストラクタのシグニチャ
 * 			public FileWriter(...) throws IOException
 * 
 * 		FileWriterクラスのオブジェクトを作成した後は、そのオブジェクトを使って次のメソッドを呼び出すことでデータの読み込みができる。
 * 
 * 		void write(int c) throws IOException
 * 			ｃで指定された文字をストリームに書き込む
 * 		void close() throw IOException
 * 			出力ストリームを閉じ、そのストリームに割り当てられたシステムリソースがあれば全て開放する			など 29p参照		
 * 
 */

package jp.ssie.ocjp.exam0424;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_5 {
	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		FileReader in = null;
		FileWriter out = null;
		
		try {
			inputFile = new File("C:\\pleiades\\test0424\\ocjp.txt");
			outputFile = new File("C:\\pleiades\\test0424\\ocjpcopy2.txt");
			in = new FileReader(inputFile);
			out = new FileWriter(outputFile);
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