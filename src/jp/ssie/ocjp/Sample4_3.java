package jp.ssie.ocjp;

import java.util.ArrayList;

/* ArrayList(可変長配列)　使用する為には上記 import が必要となる
 *  
 *  本来の配列では領域の大きさの増減はできないが、ArrayListクラスでは領域変更が可能な配列のようなもの(リスト)を作れる
 *  ArrayListでは要素の追加・削除を自由に行えるようになり配列と同様にインデックスで順序立てて要素を管理することが出来る。
 *  
 *  構文
 *  	ArrayList<データ型> 変数名 = new ArrayList<データ型>(初期サイズ);
 *  例
 *  	ArrayList<String> test = new ArrayList<String>(5);
 *  
 *  追加 add
 *  	add(データ型 変数) add(int i) リストの最後に要素を追加する
 *  
 *  値を返す get
 *  	get(データ型 変数) get(init i) リストの要素番目の値を返す
 *  
 *  サイズの確認 size
 *  	size() 変数名.size() リスト内の要素数を返す
 *  
 *  add() メソッド (値の代入)
 *  	変数名.add (格納したいデータ);
 *  		格納したいデータを()の中に指定する。インデックス(添え字)を明確に指定することも出来る。
 *  
 *  get().メソッド (値の取り出し)
 *  	変数名.get(インデックス);
 *  
 *  
 */

public class Sample4_3 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>(3); //ArrayList(String型)をサイズ
		
		array.add("田中");
		array.add("鈴木");
		array.add("高橋");
		
		System.out.println(array.get(1));
		
		System.out.println(); //改行
		
		//Sample4_4
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		for(int i = 0; i < num.size(); i++) { //ArrayListはlemgthではなく、size()で指定する
			System.out.println(num.get(i));
		}
	}	
}