package jp.ssie.ocjp;

/* コンストラクタ
 *  クラスをインスタンス化する際に必ず呼び出されるブロックで、オブジェクトの初期化を行う
 *  
 *  【修飾子】 コンストラクタ名 (引数の型1 引数名1, 引数の型2 引数名2, ･･･) {
 *  		コンストラクタ内の処理
 *  	}
 *  
 *  コンストラクタ名はクラス名と同じでなければならない。
 *  また特殊なメソッドで戻り値がなくvoidも必要ない。
 *  ただし、通常のメソッドと同じようにオーバーロードすることが可能
 *  
 *  
 * デフォルトコンストラクタ
 * 
 *  引数なしのコンストラクタはデフォルトで作成される
 *  ただし、引数ありのコンストラクタを作成すると
 *  デフォルトで作成されなくなる(そもそも使用できないため)
 * 
 * アクセス修飾子 コンストラクタ名 () {}
 * 
 * 	Sample5_3.java 参照
 * 
 * 		Teacher(){}
 * 
 */

class Car2 {
	String color;
	int num;
	double gas;
	
	public Car2(String c, int n, double g) {
		color = c;
		num = n;
		gas = g;
	}
	
	public void show() {
		System.out.println("車の色は" + color + " ナンバーは[" + num + "] 燃料は [" + gas + "]");
	}
}


 class Sample5_8 {
	public static void main(String[] args) {
		Car2 [] cars = {new Car2("red", 100, 20.5),
						new Car2("blue", 200, 30.5),
						new Car2("green", 300, 40.5)};
		for(Car2 car : cars) {
			car.show();
		}
		
	}
}
