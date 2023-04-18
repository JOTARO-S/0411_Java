package jp.ssie.ocjp;

/* 引数と戻り値での基本データ型とオブジェクト参照型の違い
 * 
 * 	値の扱い
 * 		基本データ型　⇒ 値はコピーが渡される
 * 			メソッドの引数に基本データ型を渡した場合、メソッドの定義側で引数の値の変更を行っても、
 * 			呼び出した側の変数の値は変わらない。
 * 	
 * 		オブジェクト参照型 ⇒ オブジェクトへの参照が渡される
 * 			オブジェクト参照型のデータを渡した場合、メソッドの定義側にて引数の値の変更を行うと、
 * 			呼び出した側の変数の値も変更される。
 * 
 */

//定義側
class RefTest {
	void metTest1(int num) {
		num += 30; //int型は基本データ型である為、値はコピーが渡されているのでメソッド内での変更は適用されない
		System.out.println("int型定義側は" + num);
	}
	
	void metTest2(int[] array) {
		array[0] += 30; //配列はオブジェクト参照型である為、呼び出し側の配列の要素も変更されている
		System.out.println("配列定義側は" + array[0]);
	}
	
	void metTest3(String str) {
		str += 30; //str型はオブジェクト参照型であるがString型の変数は不変である為、新しいStringオブジェクトを作成している
		System.out.println("String型定義側は" + str); 
		
	}
}


//呼び出し側
public class Sample5_11 {
	public static void main(String[] args) {
		int num = 20;
		int[] array = {20, 40};
		String str = "20";
		RefTest obj = new RefTest();
		
		obj.metTest1(num);
		System.out.println("int型呼び出し側は" + num);
		obj.metTest2(array);
		System.out.println("配列呼び出し側は" + array[0]);
		obj.metTest3(str);
		System.out.println("String型呼び出し側は" + str);

		
		
	}

}