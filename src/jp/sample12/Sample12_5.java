
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

// ジェネリックス対応の独自クラスの定義
// クラス名の後に型パラメータリスト指定
class Bar<T> {
	// 対応させたい箇所に型パラメータ指定
	private T val;
	public Bar(T val) {
		this.val = val;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
}
 
// 使用する側
public class Sample12_5 {
	public static void main(String[] args) {
		// オブジェクト生成時に扱う型を指定
		// Stringを扱うBarクラスのオブジェクトを生成
		Bar<String> obj1 = new Bar<String>("a");
		// その後の操作では、型指定(キャスト)不要
		System.out.print(obj1.getVal());
		obj1.setVal("b");
		System.out.println(" " + obj1.getVal());
		// Integerを扱うBarクラスのオブジェクトを生成
		Bar<Integer> obj2 = new Bar<Integer>(1);
		System.out.print(obj2.getVal());
		obj2.setVal(2);
		System.out.println(" " + obj2.getVal());
	}
}