
/*
 * Java(応用編)
 * 
 * 高レベルのリーダーおよびライター
 * 	BufferedReaderおよびBufferedWriterの各クラスを使うことで、文字ストリームの文字をテキスト形式の大きなかたまり(ブロック)で読み書きできる。
 * 	FileReader、FileWriterクラスの高レベルストリームとなる。
 * 	BufferedReader、BufferedWriterクラスブロック単位で読み書きが実現するため入出力のオーバーヘッドを減らすことが出来る。
 * 
 * BufferedReaderクラスのコンストラクタ
 * 	BufferedReader(Reader in)
 * 	BufferedReader(Reader in, int size)
 *  	size:はバッファの値を入力、指定しない場合はデフォルト値を適用
 *  BufferedWriter(Writer out)
 *  BufferedWriter(Writer out, int size)
 *  
 * これらのコンストラクタはthrows指定された例外はない。
 * 	FileReaderおよびFileWriterはそれぞれReaderおよびWriterのサブクラスなので、
 * 	それらのオブジェクトをBufferedReaderおよびBufferedWriterの各コンストラクタに渡すことが出来る。
 * 
 * 	BufferedReaderのクラスで単一の文字を読み取るためのメソッド
 * 		int read() throws IOException
 */

package jp.ssie.ocjp.exam0424;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample11_6 {
	public static void main(String[] args) {
		File inputFile = null;
		File outputFile = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			inputFile = new File("C:\\pleiades\\test0424\\ocjp.txt");
			outputFile = new File("C:\\pleiades\\test0424\\ocjpcopy3.txt");
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter (new FileWriter(outputFile));
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