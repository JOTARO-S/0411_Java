package jp.sample6;

/* インタフェース
 * 	インタフェースとは、公開されている操作をまとめた仕様
 * 	インタフェースは操作の仕様を決めるものであり、決めておくと複数のクラスで同じ変数や同じメソッドを使用することが出来るようになる。
 * 
 * 	分かりやすいものだと、テレビや録画・再生機器などでは再生マークが右向きの三角 ▶ であったり 一時停止などのマークが統一されられている。
 * 	こういったものも インタフェースを決めることになる。
 * 
 * インタフェースは抽象クラスとは違う、処理内容の記述がない抽象メソッドのみ定義することが出来る。(コンストラクタや通常のメソッドは不可)
 * 
 * 		【修飾子】 interface インターフェース名 { }
 * 
 * 	インタフェースを宣言するのは interface キーワードを使用する。
 * 
 * 	インタフェースで変数を宣言する場合、暗黙的にpublic, static, final の修飾子が付与される。(final が付与される為、定数となる)
 * 	その為、変数を宣言したときに初期化しないとコンパイルエラーとなる。
 * 		
 * 		interface MyInterface { //インタフェース
 * 			int a; //初期化していないためコンパイルエラーとなる
 * 			int b = 10; // b ～ f はOK
 * 			public int c = 20;
 * 			static int d = 30;
 * 			final int e = 40;
 * 			public static final int f = 50;
 * 		}
 * 
 * 	インタフェースでメソッドを宣言する場合、そのメソッドは暗黙的にpublic, abstract の修飾子が付与される。
 * 		(abstract修飾子 があるため、インタフェース内で宣言されたメソッドは抽象メソッドとなる)
 * 	その為、インタフェースも抽象クラスと同じようにインスタンス化することは出来ない。
 * 	インタフェースを実装するクラスを実装クラスという。
 * 	その際、インタフェース内に定義されているabstractメソッドを全てオーバーライドしなければならない。(1つでも抜けるとコンパイルエラーとなる)
 * 	また、オーバーライドしたメソッドには必ず public 修飾子をつける必要がある。
 * 		(インタフェース内で定義したメソッドに暗黙的に付けられるpublic, abstract修飾子が実装側にも付いていないとアクセス制御に整合性が取れなくなる為)
 * 	インタフェースを実装する場合は、 Implementsキーワードを使用する。
 * 
 * 		【修飾子】 class クラス名 implements インターフェース名1, インターフェース名2, ... { }
 * 
 * 	1つの実装クラスに複数のインターフェースを扱うことが出来る。その際は , (カンマ) で区切り、インターフェース名を記述する。
 * 
 * インターフェースの継承
 * 	インターフェースを継承したサブインターフェースを作成することが出来る。
 * 	スーパークラスやサブクラスのように extends キーワードを使用する。
 * 
 * 		【修飾子】 interface サブインターフェース名 extends スーパーインターフェース名 { }
 * 
 * 	サブインターフェースの実装クラスが抽象クラスでなく具象クラスの場合は、
 *	 スーパーインターフェースとサブインターフェースのすべてのメソッドをオーバーライドする必要がある。
 * 	 サブインターフェースはインターフェースを複数継承することができる。
 * 
 * 		インターフェースAとBがあり、それをインターフェースCが継承するとする
 * 			interface C extends A, B { } という記述になる
 * 		すると、インターフェースCはインターフェースAとBのメンバ変数やメソッドを扱うことが出来る。
 * 
 * インターフェースの追加仕様
 * 	JavaSE7まではインターフェースで宣言できるメソッドは抽象メソッドのみだったが、
 * 	JavaSE8以降は抽象メソッドの他に具象メソッドとしてデフォルトメソッドとstaticメソッドを定義できる、
 * 	デフォルトメソッド
 * 			【アクセス修飾子】 default 戻り値 メソッド名 (引数) { デフォルトメソッドの処理 }　（指定できるアクセス修飾子はpublic のみ）
 * 				default void method() { } 
 * 			アクセス修飾子の指定を省略した場合自動的にpublicが付与される。
 *  
 * static メソッド
 * 	構文は通常のstaticメソッド と同様だが、アクセス修飾子については以下のルールがある。
 * 		public と private のみ指定可能
 * 		指定していない場合 public が付与される
 * 		protectedは使用不可 記述するとコンパイルエラーとなる。
 * 
 *
 * 
 */

interface MyInterface { //スーパーインターフェース
	int a = 10;
	public void getComment();
}

interface SubInterface extends MyInterface { //サブインターフェース
	int getSum();
}

//サブインターフェースを実装するとスーパーインターフェースも実装される
class C implements SubInterface {
	public void getComment() {
		System.out.println("スーパーインターフェースを実装する");
	}
	public int getSum() {
		return(a + 5);
	}
}

class D implements SubInterface {
    public void getComment() {
        System.out.println("スーパーインターフェースを実装する");
    }
    public int getSum() {
        return (a + 10);
    }
}


public class Sample6_11 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment(); //スーパーインターフェース実装
		System.out.println(c1.getSum()); //サブインターフェース実装
		test(new C());
		test(new D());
	}
	public static void test(SubInterface c) {
	}
	//public static void test(C c) {}
	//public static void test(D c) {} 
}