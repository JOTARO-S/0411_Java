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
 *  デフォルトで作成されなくなる
 * 
 * アクセス修飾子 コンストラクタ名 () {}
 * 
 * 	Sample5_3.java 参照
 * 
 * 		Teacher(){}
 * 
 */


class Trainer {
	String name;
	Trainer() { //コンストラクタの定義
		name = "名無し";
	}
	Trainer(String n) { //コンストラクタのオーバーロード
		name = n;
	}
}

 class Sample5_7 {
	public static void main(String[] args) {
		
		//名無しのオブジェクトをインスタンス化
		Trainer s1 = new Trainer(); //引数なしのコンストラクタ
		
		//田中さんオブジェクトをインスタンス化
		Trainer s2 = new Trainer("田中さん"); //引数ありのコンストラクタ (String nameで定義している為intやdoubleだとエラーとなる)
		
		System.out.println("名前:" + s1.name);
		System.out.println("名前:" + s2.name);
	}
}
