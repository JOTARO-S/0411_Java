package jp.sample5;

/* staticイニシャライザ
 * 
 * static修飾子は変数やメソッドだけではなくstaticイニシャライザを定義することも出来る。
 * staticイニシャライザとは、クラスが初めて参照されたときに一度だけ呼び出させる処理のことを指す。
 * 別名で静的初期化とも呼ばれている。各クラスを初期化する前、main()メソッドが呼び出させる前に行いたい処理があるときに使用する。
 * 
 *  
 *  
 * 
 */


class TestClass {
	static int count = 0;
	static {
		count++;
		System.out.println("count : " + count);
	}
	
	int num;
	public TestClass(int i) {
		num = i;
	}
	
	void getNumber() {
		System.out.println(num);
	}
}

 public class Sample5_9 {
	public static void main(String[] args) {
		TestClass[] tc1 = { new TestClass(10),
							new TestClass(20),
							new TestClass(30),
							new TestClass(40), };
		for (TestClass tc2 : tc1) {
			tc2.getNumber();
		}
	}
}