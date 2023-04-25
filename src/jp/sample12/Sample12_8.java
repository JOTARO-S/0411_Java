
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

class Super {
	void print() {
		System.out.println("Super");
	}
}

class Sub extends Super {
	void print() {
		System.out.println("Sub");
	}
}

class Foo<T extends Super> { //extendsに指定されている為、型が制限されている
	private T val;
	public Foo(T val) {
		this.val = val;
	}
	public void call() {
		val.print();
	}
}

public class Sample12_8 {
	public static void main(String[] args) {
		Super obj1 = new Super();
		Sub obj2 = new Sub();
		Foo<Super> foo1 = new Foo<Super>(obj1);
		foo1.call();
		Foo<Sub> foo2 = new Foo<Sub>(obj2);
		foo2.call();
		//Foo<String> foo3 = new Foo<>(new String("aa")); ← 制約されている為コンパイルエラー
	}
}