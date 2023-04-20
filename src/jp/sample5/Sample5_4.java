package jp.sample5;

/*メソッドの呼び出し
 * 
 * クラスは属性(変数)と操作(メソッド)をまとめた設計図
 * クラスに必要なメソッドを用意すること ⇒ メソッドを定義する という
 * また、そのメソッドを使用すること ⇒ メソッドを呼び出す という
 * インスタンス化するたびに生成されるメソッド ⇒ インスタンスメソッド
 * クラスをインスタンス科せずに使用できるメソッド ⇒ staticメソッド(クラスメソッド) がある
 * インスタンスメソッドは変数と同じようにクラスをインスタンス化させないと使用できないが、
 * staticメソッドは、インスタンス化せずにクラス名とメソッド名で呼び出すことが可能 static を つける
 * 
 *  [装飾子] 戻り値の型 メソッド名 (引数型1 引数名1, 引数型2 引数名2, ... )   
 *  	実行したい処理;
 *  	return 戻り値;	//戻り値を使用しない場合は不要
 *  
 *  戻り値 ⇒ メソッドの実行後にメソッドの呼び出し元にメソッドから返す特定の情報(値)のことをいう
 *  使用しない場合は不要だが、使用する場合は必ず戻り値の型を指定する必要がある
 *  型が違う場合はコンパイルエラーとなる
 *  戻り値を使用しない場合は戻り値の型に void と記入する
 *  
 *	 ----------名前----------------------
 *	 |	  |							 |
 *	 |	  |	入力　⇒　処理　⇒　出力 |
 *	 |	  |							 |
 *	 | 	 ------------------------------
 *	 |  
 *	 |------> 戻り値 関数 (引数リスト) {処理}
 *  
 *  
 *  
 *  class  sample{                  //フィールドまたはインスタンス変数
 *  	Integer number;				//変数名 は number
 *  	
 *  	void setNumber(Integer x) { //setter(セッター) 名前を設定する
 *  		number = x;
 *  	}
 *  	
 *  	String getNumber() {   //getter(ゲッター) 名オブジェクトの前を取得する
 *  		return number;
 *  	}
 *  }
 *  
 *  class test {
 *  	public static void main(String[] args) { 
 *  	//処理の内容
 *  }
 * 
 * 
 * 
 */



class MetTest {
	int test; //インスタンス定数
	
	static void metTest1() { //staticメソッドの定義です
		//test = 10; // staticメソッドの中ではインスタンス定数にはアクセスできないのでエラーとなる(static int test で定義していれば使える)
		//staticメソッドはデータを利用しないものに利用すると良い
		System.out.println("staticメソッドが呼ばれました");
	}
	
	void metTest2() { //インスタンスメソッドの定義です
		test = 10;
		System.out.println("インスタンスメソッドが呼ばれました");
	}
}


public class Sample5_4 {
	public static void main(String[] args) {
		MetTest.metTest1(); //クラス名.　Staticメソッド名
		// MetTest.metTest2(); //staticメソッドでないので不可
		System.out.println();
		MetTest mt = new MetTest();
		//mt.metTest1();
		mt.metTest2();
		
	}

}