package jp.sample5;

import javax.swing.JFrame;

//import jp.sample5.Pack;

//import jp.ssie.test.Pack; //異なるパッケージのクラス

/* import文
* 	import文はあるクラスが自分と所属が異なるパッケージ内のクラスを利用する際に使用する。(同一パッケージからの場合は不要)
* 
* 		import パッケージ名.クラス名; //クラス名の部分を * (アスタリスク)で指定すると
* 										そのパッケージ内の他のクラスも利用できるようになる。（複数可能）
* 
* 		import jp.ssie.test.Pack;
* 
* 	import文を記述する際は、先にpackage文を記述すること
* 	import文を使用する際は、利用される側のクラスやメソッドのアクセス修飾子がpublicでないと参照することが出来ない
* 
* 	import文を利用しなくても他のパッケージのクラスは利用可能だが、クラス名を完全修飾名と置き換える必要がある。
* 	
* 		jp.ssie.test.Pack  pack = new jp.ssie.test.Pack();
* 
* 
* 	完全修飾名 ⇒ import文をパッケージ名からクラス名まで全て記述する。
* 		import宣言する際、同じクラス名を同時にimport出来ないため、それを防ぐのに用いられる。
* 	
* 	import文は shift + Ctrl + O で自動的に記述してくれる
* 
* 	
* 	Java では 多くのパッケージが存在する
* 	
* 	java.lang ⇒ Java言語の設計にあたり基本的なクラスを提供している	※ java.lang はデフォルトで読み込まれている
* 					Stringクラス, Mathクラス, Integerクラス など
* 
* 	java.awt ⇒ ユーザーインターフェースの作成、グラフィックス、イメージのペイント用のすべてのクラス
* 					Buttonクラス, Canvasクラス, Checkboxクラス など
* 
* 	javax.swing ⇒ すべてのプラットフォームで可能な限り同じように機能する「軽量」コンポーネントのセットを提供する。
* 					Jbottonクラス, Jtreeクラス, Jtableクラス など
* 
* 	java.io ⇒ データストリーム、直列化、ファイルシステムを介したシステム入出力について規定する
* 					Fileクラス, PrintWriterクラス, BufferedWriterクラス など
* 
* 	java.net ⇒ ネットワークアプリケーションの実装の為のクラス
* 					socketクラス, ServerSocketクラス, URLクラス など
* 
* 	java.util ⇒ コレクションフレームワーク、レガシーコレクションクラス、イベントモデル、日時機能、国際化など
* 				 様々なユーティリティクラス(String Tokenizer, 乱数ジェネレーター, ビット配列など)
* 					Hashsetクラス, ArrayListクラス, Vectorクラス など
* 
* 
*/

public class Sample5_14 {
	public static void main(String[] args) {
		Pack pack = new Pack();
		pack.print();
		
		// java.swing を利用したウィンドウを出す機能
		JFrame frame = new JFrame("title");
		frame.setSize(1280, 128);
		frame.setVisible(true);
	}
}