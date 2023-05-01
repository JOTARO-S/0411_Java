
/*
 * Java(応用編)
 * 
 * PrintWriterクラス
 * 	WriterクラスのサブクラスであるPrintWriterクラスは様々なデータ型をテキスト文字列として書き込む際にしようされる。
 * 		オブジェクトもデータ型であるため、PrintWriterを使えば書式化された形のオブジェクトをテキスト出力のストリームに出力できる。
 * 		このクラスのメソッドは入出力の例外をスローしないが、コンストラクタには入出力の例外をスローするものがある。
 * 		
 * 		高レベルの入出力ストリームと同様にこうれbるのリーダーまたはライターの構成時には、
 * 		次にレベルの低いストリームオブジェクトを渡す。例として、PrintWriterクラスのコンストラクタ
 * 			PrintWriter(Writer out)
 * 
 * 		PrintWriterクラスでもっともよく使われるメソッド
 * 			public void print(...)
 * 			public void println(...)
 * 
 * 		これらのメソッドはオーバーロードされていてboolean, char, int, long, float, double, charの配列、String,Objectなど様々なデータ型の引数をとる。
 * 		
 * オブジェクトのストリームおよびシリアライズ
 * 	ストリームに対応したオブジェクトのことをシリアライズ(直列化)可能なオブジェクトと呼ぶ
 * 		シリアライズ ⇒ オブジェクトをどこかに書き込む処理
 * 		デシリアライズ ⇒ シリアライズされたオブジェクトを読み取ってプログラムの中に戻す処理
 * 
 * 		Javaでは単純にシリアライズを行うだけであるオブジェクトを一部の変数をのぞいたそのインスタンス変数とともに
 * 		保存するように指示することが出来る(transientと宣言された変数はシリアライズ処理では保存されない)	
 *		
 *		オブジェクトをシリアライズ可能にするには、そのクラスがjava.ioパッケージの空のインターフェース
 *		Serialzableインターフェースを実装していなければならない。
 *
 *		import java.io.Serializable;
 *		class MySerialClass implements Serializable {
 *			//クラスの本体
 *		}
 *
 *		Serializableインターフェースにはメソッドが一切宣言されていないため、オーバーライドするメソッドはなく、
 *		クラス宣言にimplements Serializableと記述するだけ
 *		つまり、あるクラスがシリアライズ可能なことを示すためだけに使用される。
 *
 *		FileOutputStream out = new FileOutputStream("objectStore.ser");
 *		ObjectOutputStream os = new ObjectOutputStream(out);
 *		os.writeObject("sserialOut);
 *		os.writeObject(new MySerialClass());
 *		os.writeObject("End of storage!");
 *
 *
 *	
 *	ObjectOutputStreamによる書き込み
 *		オブジェクトをファイルに書き込むにはObjectOutputStreamをつかって低レベルストリームにそのオブジェクトを書き込む
 *		すると低レベルストリームがファイルへの書き込みを行ってくれる。
 *
 *	ObjectInputStreamによる書き込み
 *		書き込んだオブジェクトを読み込むためにObjectInputStreamを使用する。
 *		
 *		次のコードは先ほどの例のObjectStore.serというファイルに書き込まれている各オブジェクトを読み込む。
 *		
 *		FileInputStream in = new FileInputStream("objectStore.ser");
 *		ObjectInputStream is = new ObjectInputStream(in);
 *		String str1 = (String)is.readObject();
 *		MySerialClass serialIn1 = (MySerialClass)is.readObject();
 *		String str2 = (String)is.readObject();
 * 
 * 
 */

package jp.ssie.ocjp.exam0424;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	Animal() { System.out.println("Animal()"); }
}

class Dog extends Animal {
	Dog() { System.out.println("Dog()"); }
}

class Bulldog extends Dog {}

public class Sample11_7 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Bulldog obj = new Bulldog();
		try {
			fos = new FileOutputStream(new File("dog.txt"));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("----- シリアライズ完了");
			
			fis = new FileInputStream(new File("dog.txt"));
			fis = new FileInputStream(new File("person.txt"));
			ois = new ObjectInputStream(fis);
			Bulldog readObj = (Bulldog) ois.readObject();
			//Person person = (Person) ois.readObject();
			//System.out.println(person.getName());
			//System.out.println(person.getAge());
			System.out.println("----- デシリアライズ完了");
		} catch(ClassNotFoundException e) {
			System.err.println("クラスファイルがありません");
		} catch(FileNotFoundException e) {
			System.err.println("ファイルがありません");
		} catch(IOException e) {
			System.err.println("IO Error");
		} finally {
			try {
				oos.close();
				ois.close();
			} catch(IOException e) {
			}
		}
	}
}