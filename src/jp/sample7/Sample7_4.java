package jp.sample7;

/* throwsキーワードの使用方法
 * 	プログラムの中では、各メソッドの中でそれぞれ例外処理をするのではなく、メソッドの呼び出し元に例外処理を任せることが出来る。
 * 	さらにtry-catchが各メソッドで同じ例外(重複)をさせないプログラムコードを記述するときにも使われる。
 * 	
 * 		【修飾子】 戻り値の型 メソッド名 (引数リスト) throws 例外クラス1, 例外クラス2 {
 * 			//処理
 * 		}
 * 
 * 		上記の通り、メソッド内の処理によって複数の例外が発生する可能性があれば、
 * 		throwsキーワードのあとにクラス名を , カンマで区切って記述する。	
 * 		注意点としては、メソッドで例外を宣言してもソノメソッドから必ず例外が発生しなくてはならないわけではない点
 * 		しかし、チェックされる例外、もしくは明示的に例外をスローする場合は宣言しなければならない。
 * 
 * 		メソッドが呼び出す別のメソッドがチェックされる例外をスローする場合は、
 * 		呼び出し側のメソッドでチェックされる例外を逃れるかキャッチするかのいずれかを行う。
 * 
 * 		例外を逃れる　⇒　メソッド本体内部にtry-catchブロックがないという意味
 * 		例外をキャッチする ⇒ メソッド本体内部にtry-catchブロックがあるという意味
 * 
 * 	以下のコードでは、callingMethod()メソッドはIOException の宣言もキャッチもしないにも関わらず、
 * 	IOExceptionをスローする記述があるために、コンパイルエラーとなる。
 * 
 * 		void callingMethod() { ⇒⇒⇒ void callingMethod() throws IOEception
 * 			calledMethod();
 * 		}
 * 		void calledMethod() throws IOException {
 * 			throw new IOException();
 * 		}
 * 
 * 		この問題の１つの修正方法としては、1行目を void callingMethod() throws IOEception に変更する方法がある
 * 		そうすると5行目で発生したIOException は callingMethod()メソッド側に転送されて、
 * 		さらにcallingMethod()メソッドの呼び出し元へIOExceptionを転送する。
 * 
 * 		メソッドがスローする可能性がある例外は全て throwsキーワードを使って宣言しなければならない。
 * 		メソッドが呼び出す別のメソッドが例外をスローする場合、
 * 		呼び出し元のメソッドはその例外をキャッチするかスローするか、またはその両方を行わなければならない。
 * 
 * throwキーワード
 * 	例外オブジェクトを作成し、例外を明示的に発生させたい(スローしたい)ときはthrowキーワードを使用する。
 * 	throwキーワードは例外クラスや独自例外クラスのどちらにも任意の場所でスローすることが出来る。
 * 
 * 		throw new <例外クラス名>();
 * 		throw 例外オブジェクト;
 * 
 *
 * 		throw new IOException();
 * 
 * 		IOException e = new IOException();
 * 		throw e;
 */

public class Sample7_4 {
	public static void main(String[] args) {	
		double x = 15.0;
		double y = 0.0;
		try {
			Sample7_4 obj = new Sample7_4();
			double z = obj.doubleDivide(x, y);
			System.out.println("x / y: " + z);
		} catch(ArithmeticException ae) {
			System.out.println("---- 発生した例外 ----");
			System.out.println(ae);
		}
		System.out.println("x - y: " + (x - y));
	}
	double doubleDivide(double x, double y) {
		if(y == 0.0) {
			throw new ArithmeticException( //例外のオブジェクトを作成
					"数字は0では割れません。");
		} else {
			return x / y;
		}
	}
}