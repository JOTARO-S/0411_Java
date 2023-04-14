package jp.ssie.ocjp;

/* 配列
 *  
 *  配列の宣言
 * 		データの型[] 配列名; or データの型 配列名[];
 * 			
 * 		int[] test; or int test[]; 
 * 
 *  配列の生成
 * 		配列名 = new データ型[要素数];
 * 		
 * 		test = new int[5];
 * 
 *  宣言と生成
 *  	データ型 配列名 = new データ型 
 * 		int test = new int[5];
 * 
 *  配列に代入
 *  	配列名[インデックス] = 値;
 *  	test[0] = 1; test[1] = 2; test[2] = 3 ...
 *  
 *  配列の宣言、生成、代入
 *  	データ型[] 配列名 = {初期値1, 初期値2, ･･･, 初期値n};
 *  	int[] test = {1, 2, ..., n};
 *  	
 * 配列の要素数
 * 		配列名.length
 * 		test.length
 * 
 * 		配列の要素数は配列の長さとも呼ばれ、
 * 		繰り返し文でよく用いられ、後々要素数を増やしても繰り返し文の条件式で.lengthを使用していると変更する必要がなくなる。
 * 
 * 		要素数 5										要素数 6 に変更
 * 		for(int i = 0; i < 5; i++)			⇒			for(int i = 0; i < 6; i++)
 * 		for(int i = 0; array.length; i++)	⇒			for(int i = 0; array.length; i++)
 * 						↑array(配列)のlength(要素数)なので自動的に配列の数になるため変更がいらない。
 */

public class Sample4_1 {
	public static void main(String[] args) {
		
		int[] iar = new int[5]; // 配列 iar の宣言（データ型 int で 要素数は5つ）
		
					//配列の初期化
		iar[0] = 12; // iar の 要素 1つ目 に代入
		iar[1] = 3; // iar の 要素 2つ目 に代入
		iar[2] = 28; // iar の 要素 3つ目 に代入
		iar[3] = 427; // iar の 要素 4つ目 に代入
		iar[4] = 33; // iar の 要素 5つ目 に代入
					 // iar[2] = 2.25などの異なるデータ型や iar[5]などの領域外への代入はエラーとなる
		
		System.out.println("iar[0]の値は" + iar[0] + "です。"); 
		System.out.println("iar[1]の値は" + iar[1] + "です。");
		System.out.println("iar[2]の値は" + iar[2] + "です。");
		
		String[] sar = { "One", "Two", "Three" }; //配列 sar の宣言(データ型 String)と配列の初期化を同時に行う(sar の要素 1～3つ目に代入)
		
		System.out.println("sar[0]の値は" + sar[0] + "です。");
		System.out.println("sar[1]の値は" + sar[1] + "です。");
		System.out.println("sar[2]の値は" + sar[2] + "です。");
		
		int len = sar.length; // len (int型)の宣言、配列 sar の length(配列数(3)) を代入
		System.out.println("配列sarの要素の数は" + len + "です。");
	}	

}