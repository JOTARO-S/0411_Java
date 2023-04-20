package jp.sample6;

/* オブジェクト参照型の型変換
 * 	参照型の型変換では、宣言している変数の型とデータであるオブジェクトの間に継承関係もしくは実現関係である必要がある。
 * 	なお、参照型の暗黙的な型変換はインターフェースまたはスーパークラスにないメソッドを呼び出すことは出来ない。
 * 	また、メソッドがオーバーライド去れている場合、サブクラス型のメソッドが優先されて呼び出される。
 * 	
 * 		スーパークラス名 変数名 = サブクラスのオブジェクト;
 *
 * 	それぞれのクラスがある
 * 		class SuperClass { void method(SuperClass super1){ } }
 * 		class SabClass extends SuperClass{ }
 * 
 * 	代入の型変換
 * 		SuperClass s1 = new SabClass();
 * 
 * 	メソッド呼び出し時の型変換
 * 		s1.method(new SubClass());   void method(SubClass super1) { }
 * 
 * 	実装関係の型変換
 * 		
 * 		インターフェース名 変数名 = インタフェースを実装したオブジェクト;
 * 
 * 	継承関係と同様に記述
 * 		interface Inter { public abstract void method(Inter inter1); }
 * 		class ImplClass implements Inter { public void method(Inter inter1){ ]; }
 * 
 * 	代入時の型変換
 * 		Inter i1 = ImplClass();
 * 
 * 	メソッド呼び出し時の型変換
 * 		i1.method(new IMpleClass()); 	public void method(Inter inter1);
 * 
 * オブジェクト参照型のキャスト
 * 	暗黙的な型変換ではｍスーパークラスからオーバーライドしたメソッドは呼び出せたが、サブクラス側で独自に定義したメソッドは呼び出せない。
 * 	これを意図的に型変換するには、参照型のキャストを行う必要がある。
 * 
 * 		(変換したい型) 変換元の変数;
 * 
 */

interface Subject {
	public void japanese();
	public void history();
}

class BlueSchool implements Subject {
	public void japanese() {
		System.out.println("国語の授業");
	}
	public void history() {
		System.out.println("日本史の授業");
	}
	public void ensoku() { // ensoku() はインターフェース側に実装されていない
		System.out.println("遠足");
	}
}


public class Sample6_15 {
	public static void main(String[] args) {
		Subject s1 = new BlueSchool(); //インターフェース内のメソッドを参照していてjapanese()とhistory()は利用することが出来る
		s1.japanese();
		s1.history();
		//s1.ensoku(); //ensoku() はインターフェース側に実装されていないためエラーとなる
		
		//キャストすることで可能になる
		BlueSchool bs1 = (BlueSchool) s1; 
		bs1.ensoku(); 
		
	}
}