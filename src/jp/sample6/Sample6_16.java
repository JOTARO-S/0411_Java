package jp.sample6;

/* ラッパークラス
 * 	オブジェクト参照型から基本データ型にキャストすることも可能、その場合ラッパークラスを使用する。
 * 	コマンドライン引数から数字を入力し、それを計算し結果を表示するプログラムを作成しようとした場合、
 * 	コマンドライン引数からは、String型で入力される。そのままでは計算することが出来ないため、数値に変換しなければならない。
 * 
 * 		基本データ型 変数 = ラッパークラス.parse[基本データ型](String s);
 * 			int		 num1 = 		Integer.parseInt			(str1);
 * 
 * 	
 * 
 * 
 * 
 */



public class Sample6_16 {
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		//str1 + str2 をした場合
		System.out.println("str1 + str2 :" + str1 + str2);
		
		// int型に型変換した場合
		System.out.println("合計 : " + num1 + num2);
	}
}