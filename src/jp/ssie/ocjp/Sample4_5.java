package jp.ssie.ocjp;
import java.util.ArrayList;

/* ジェネリックス
 *  ArrayListクラスを使用する際は気を付けなければならないことがある
 *  　① < > で指定するデータの型は合わせる。（左辺と右辺で必ずデータ型は合わせること）
 * 		ArrayList<String> array = new ArrayList<String>(); ⇒ OK
 * 		ArrayList<String> array = new ArrayList<Integer>(); ⇒ 右辺と左辺のデータ型が違うのでNG
 * 
 *  　② < > で指定されたデータ型を格納する
 *  	異なるデータ型は格納できない
 *  	 ArrayList<String> array = new ArrayList<String>();
 *  	 array.add("Hello") ⇒ OK 
 *  	 array.add(10) ⇒ 10はInteger型なのでNG
 * 
 *  ジェネリックスを使用しない記述
 *   通常であれば < > にデータ型の指定を行うが、ジェネリックスを使用しないと型のチェックが出来なくなる
 *   その為、コンパイル時には警告が出力される。ただしコンパイル、実行ともに成功する為コンパイルが出来ないわけではない
 *   
 *   ・ジェネリックスを使用しない場合はどのようなデータも格納することができる
 *   ・ジェネリックスを使用する場合はデータ型を宣言することにより、
 *   　　不正なデータを格納するコードを記述した際にコンパイルのタイミングで検知ができる
 *   
 *   ジェネリックスを使用する理由
 *   　⇒ キャスト※1 と呼ばれる目的の型への変換を行ってからデータを取り出す必要が出てくる。
 *   	　その為、ジェネリックスを使用することにより、取り出したいデータをキャスト※1 する必要がなくなる。
 *   	　使用時に目的のデータ型を指定することで、安全で再利用性のある品質の高いコードが記述できる。
 *   		※1 キャストについては6章を参照
 *   
 *   ジェネリックスを使用しない場合								ジェネリックスを使用する場合
 *   ArrayList array = new ArrayList();							ArrayList<Integer> array = new ArrayList<Integer>();
 *   array.add(10);												array.add(10);
 *   array.add("佐藤");											array.add("佐藤");
 *   
 *   警告が出力されるがコンパイルは成功する						コンパイルが失敗する
 *   不正なデータが格納される									不正なデータをコンパイル時に検知ができる
 *   
 *   ジェネリックスの簡略化(ダイヤモンド演算子)
 *    ArrayListクラスの基本書式では左右にデータ型を書いていたが、2回記述するのは冗長であるためJavaSE7以降は簡略化できるようになった
 *     従来）	 ArrayList<String> array = new ArrayList<String>();
 *     SE7以降） ArrayList<String> array = new ArrayList<>();
 *    注：ダイヤモンド演算子はメソッドの引数には使用することが出来ない
 *   
 *   
 *  拡張for文
 *   拡張for文は配列やコレクション(複数の要素の集まり)の全要素を順番に取り出して処理する場合に使用できる。
 *   
 *     
 *     for (変数宣言 : 参照変数名) {
 *     		繰り返し処理;
 *     }
 *     
 *     String[] ar = {"a", "b", "c"};
 *     for(String s : ar) {
 *     	System.out.print(s + "-");  // a-b-c と出力される
 *     }
 *  
 *  
 *  
 */

public class Sample4_5 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>(); //ArrayList String型 myListを宣言 (ダイヤモンド演算子でジェネリックスの簡略化)
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
		//integer i = 123
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		//myList.add(i) コンパイルエラー
		
		/* 通常for文
		for(int i = 0; i < myList.size(); i++) {
			String st = (String) myList.get(i);
			System.out.println(st);
		}
		*/
		
		//拡張for文
		for (String st : myList) { // myList 
			System.out.println(st);
		}
		
		/* Integer を使用した取り出し
		 * String st = null;
		 * Iterator<String> itr = myList.iterator();
		 * while (itr.hasNext()) {
		 * 	st = itr.nexr();
		 * System.out.println(st);
		 */

		
	}	
}