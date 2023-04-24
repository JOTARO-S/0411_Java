
/*
 * Java(応用編)
 * 
 * 高レベルストリーム
 * 	int や double などの Javaのデータ型をbyteに変換することなく、そのデータ型のままストリームとやり取りする場合に使用されている。
 * 	ただし、高レベルストリームは入出力デバイスに直接アクセスするわけではなく、低レベルストリームにアタッチされており、
 * 	低レベルストリームはさらに入出力デバイスにアタッチされている。
 * 
 * 	アタッチのイメージ
 * 
 * 					   バイトデータ					int, float, doubleなど
 * 		FileInputStream　⇒⇒⇒　DataInputStream ⇒⇒⇒⇒⇒⇒↓
 * 														Javaプログラム
 * 					   バイトデータ
 * 		FileOutputStream ←←←　DataOutputStream ←←←←←←↓
 * 
 * DataInputStreamクラス
 * 	コンストラクタ
 * 		public DataInputStream(InputStream in)
 * 	
 * 		String readUTF() throws IOException  など 19p 参照
 * 
 * DataOutputStreamクラス
 * 	コンストラクタ
 *		public DataOutputStrema(OutputStream out)
 *
 *		void writeUTF(String str) throws IOException　など 20p 参照
 *
 *		DataInputStreamおよびDataOutputStream、FileInputStream、FileOutputStreamは、
 *		どのストリームも読み書きをバイト単位で取り扱うため、まとめてバイトストリームと呼ぶ。
 *		これらのストリームは、画像ファイルや動画ファイル、音声ファイルのようなバイナリファイルおよび基本データ型の読み取りに適している。
 *
 */

// DataInputStreamおよびDataOutputStreamの各クラスを使ってファイルの読み取りおよび書き込みを行う方法の例
// int, double, String の各型の配列にデータを格納し、orders.txtという名前のファイルに書き込まれ、プログラムに再度読み込みをさせ画面に出力させる。

package jp.ssie.ocjp.exam0424;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample11_4 {
	public static void main(String[] args) {
		String dataFile = "C:\\pleiades\\test0424\\orders.txt";
		double grandTotal = 0.0;
		
		//ファイルに書き足す
		try {
			double[] priceList = {19.99, 29.99, 39.99};
			int[] copies = {100000, 50000, 70000};
			String[] titleList = {
					"SCJ-P Study Guide", "SJC-BC Study Guide", "SCSA Study Guide" };
			DataOutputStream out = new DataOutputStream(new FileOutputStream(dataFile)); // DataOutputStreamとFileOutputStreamを作成する
			for (int i = 0; i < priceList.length; i++) {
				out.writeDouble(priceList[i]);
				out.writeChar('\t');
				out.writeInt(copies[i]);
				out.writeChar('\t');
				out.writeChars(titleList[i]);
				out.writeChar('\n');
			}
			out.close();
		} catch(IOException e) {
			System.out.println("IOException occurs");
		}
		
		//再度読み込む
		DataInputStream in = null;
		try {
			double price = 0.0;
			int copy = 0;
			StringBuffer title = null;
			in = new DataInputStream(new FileInputStream(dataFile)); //DataInputStreamとFileInputStreamを作成する
			while(true) {
				price = in.readDouble();
				in.readChar();
				copy = in.readInt();
				in.readChar();
				char ch;
				title = new StringBuffer(25);
				char lineSep = System.getProperty("line.separator").charAt(1);
				while((ch = in.readChar()) != lineSep) {
					title.append(ch);
			}
			System.out.println("Your order: " + copy + " copies of " + title + " at $" + price);
			grandTotal = grandTotal + copy * price;
		}
		} catch(EOFException e) {
			System.out.println("End of File!");
			
		} catch(IOException e) {
			System.out.println("IOException occurs");
		}
		System.out.println("Grand Total: $" + grandTotal);
		try {
			in.close();
		} catch(IOException e) {
			
		}	
	}
}