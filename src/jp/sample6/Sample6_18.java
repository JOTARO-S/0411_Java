package jp.sample6;

/* Java API
 * 	Java API とは Java言語が提供するライブラリ(言語規約)のことを指す
 * 
 *  java.lang.Mathクラスのメソッド
 *  	指数関数、対数関数、三角関数など数学でよく見るような計算や定数をまとめた数学ライブラリ
 * 		定数とメソッドはすべてstaticになっているためインスタンス化せずに利用することが可能]
 * 
 *  Mathクラスの定数
 *  
 *  	static final double E ⇒ 自然対数の底eにもっとも近い値をdouble型で返す
 *  	static final double PI ⇒ 円周とその直径の比piをdouble型で返す
 *  
 *  主なMathクラス
 *  
 *  	static int max(int x, int y) ⇒ x と y の値のうち大きいほうを返す
 *  	static int min(int x, int y) ⇒ x と y の値のうち小さいほうを返す
 *  	staitc double random() ⇒ 0.0 以上 1.0未満の正の符号のついたdouble型を返す
 *  	static int abs(int a) ⇒ int型 a の絶対値を返す
 *  	static double pow(double x, double y) ⇒ x を y で累乗した値を返す
 * 
 * 	他にも様々なクラスがある。
 * 	
 * 	Systemクラス ⇒ 指定した位置から開始する指定ソース配列から転送先の配列の指定位置に配列をコピーすることが可能
 *  Classクラス ⇒ Classオブジェクトが配列かどうかを判断する
 *  ArrayListクラス ⇒ リスト内の全ての要素をもとに配列を返す
 *  
 *  
 * 
 * 
 */



public class Sample6_18 {
	public static void main(String[] args) {
		int a = 10;
		int b = -5;
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("Math.E = " + Math.E);
		System.out.println("Math.max(a,b) = " + Math.max(a,b));
		System.out.println("Math.min(a,b) = " + Math.min(a,b));
		System.out.println("Math.random = " + Math.random());
		System.out.println("Math.abs(b) = " + Math.abs(b));
		System.out.println("Math.pow(a,b) = " + Math.pow(a,b));
		
	}
}