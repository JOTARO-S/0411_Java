package jp.ssie.ocjp;

/* 
 * 問題5-1
 * 
 *  C
 *   
 *  False True
 */

/* ------------------------------------------- 

public class Test5 {
	final static Test5 fg = new Test5();
	public static void main(String[] args) {
		Test5 fgOne = fg;
		Test5 fgTwo = fg.shortFlag(fg);
		Test5 fgThree = fg;
		System.out.println((fgOne == fgTwo) + "");
		System.out.println(fgOne == fgThree);
	}
	
	Test5 shortFlag(Test5 f) {
		f = new Test5();
		return f;
	}

}

/*  ----------------------------------------------- */

/* 
 * 問題5-2
 * 
 *  E
 *   
 * 
 * 
 */

/* ------------------------------------------- 
 
 public class Test5 {
 	public static void main(String[] args) {
 		Test5 ts = new Test5();
 	}
 	Test5() {
 		System.out.println("Test Constructor");
 	}
 	static { System.out.println("static."); }
 }
 
  
 /*  ----------------------------------------------- */

/* 
 * 問題5-3
 * 
 *  F
 * 
 * final Test5.a に代入することができない
 */

/* ------------------------------------------- 

public class Test5 {
	final int a;
	Test5(int b) { a = b; }
	void method(int c) { a = c; }
	public static void main(String[] args) {
		Test5 t = new Test5(5);
		t.method(50);
		System.out.println(t.a);
	}
}
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-4
 * 
 *  A
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-5
 * 
 *  C
 *   
 * 
 */

/* ------------------------------------------- 
 public class Test5 {
 	int x = 5;
 	static int y = 6;
 	
 	public static void main(String[] args) {
 		int x = 12;
 		int y = 12;
 		Test5 obj = new Test5();
 		obj.printIt();
 		obj.printIt(y);
 	}
 	
 	Test5() {x = x + 2;}
 	static { y += y; }
 	
 	void printIt() {
 		System.out.println(++x);
 	}
 	
 	void printIt(int y) {
 		System.out.println(" " + ++y);
 	}
 }
  
 /*  ----------------------------------------------- */

/* 
 * 問題5-6
 * 
 *  B
 *   
 * 	変数b はカプセル化に違反している
 */

/* ------------------------------------------- 
 
 public class Test5 {
 	private int a;
 	public String b;
 	private double c;
 	public void mathod(int a, String b, double c) {
 		this.a = a;
 		this.b = b;
 		this.c = c;
 	}
 }
  
/*  ----------------------------------------------- */

/* 
 * 問題5-7
 * 
 * B, C
 *   
 * 
 */

/* ------------------------------------------- 
 
 class Foo1 {
 	int x;
 	void setX(int x) { this.x = x; }
 	int getX() { return x; }
 }
 
  class Foo2 {
 	Foo1 f;
 	void setFoo1(Foo1 f) { this.f = f; }
 	Foo1 getFoo1() { return f; }
 }
 
 class Test5 {
	 public static void main(String[] args) {
		 Foo1 f1 = new Foo1();
		 Foo2 f2 = new Foo2();
		 int a = 5;
		 f1.setX(a);
		 f2.setFoo1(f1);
		 //[ ① ]
		System.out.println(f2.getFoo1().getX());
	 }
 }
 
 
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-8
 * 
 * A
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-9
 * 
 * A, C, E
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-10
 * 
 *  B
 *   
 *  mainメソッドが static修飾子を持っているため、呼び出すことができない
 *  対処法⇒ sayHelloメソッドを static修飾子を持つ staticメソッドに変更する or インスタンス化する 
 */

/* ------------------------------------------- 

public class Test5 {
	public static void main(String[] args) {
		sayHello();
		System.out.println("mainメソッド");
	}
	void sayHello() {
		System.out.println("sayHelloメソッド");
	}
}
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-11
 * 
 * D
 *   
 * 
 */

/* ------------------------------------------- 
public class Test5 {
	public static void main(String[] args) {
		if(func())
			System.out.println("OK");
		else
			System.out.println("NG");
	}
	static double func() {
		return 1.0;
	}
}
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-12
 * 
 * B
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-13
 * 
 * B, D
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-14
 * 
 * A, B
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-15
 * 
 * A, C
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-16
 * 
 * A, D, E
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */

/* 
 * 問題5-17
 * 
 * D
 *   
 * 
 */

/* -------------------------------------------
 
  
/*  ----------------------------------------------- */
