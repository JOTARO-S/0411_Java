
/*
 * Java(応用編)
 * 
 * toString()メソッド
 * 
 * 	ObjectクラスにおけるtoString()メソッドの実装は必要最低限
 * 	あるオブジェクトに対して、このメソッドが呼び出されるとそのオブジェクトに関する情報が文字列として返される。
 * 	一般的にtoString()メソッドを実装して返される文字列はこのオブジェクトを文字列として表現したものとなる。
 * 	デフォルトの実装で返される情報は、
 * 	オブジェクトのクラス名、アット記号、１６進数になるオブジェクトのハッシュコードというフォーマットになっている
 * 
 * コレクション
 * 	プログラムの中の１回のメソッド呼び出しで、戻り値に複数のオブジェクトを扱いたい時に使用する
 * 
 * 	コレクションとは、Java言語において、複数のオブジェクトを格納するためのデータ構造を提供するAPIのことです。
 *  コレクションには、リスト、セット、マップなどの種類があります。
 *  
 *	リストは、順序を持った要素の集まりで、要素を追加した順序で格納されます。同じ要素を複数持つことができます。
 *  代表的な実装クラスとしてArrayListやLinkedListがあります。
 *  
 *	セットは、重複を許さず、順序を保持しない要素の集まりです。同じ要素を複数持つことはできません。
 *  代表的な実装クラスとしてHashSetやTreeSetがあります。
 *  
 *	マップは、キーと値のペアの集まりで、キーを使って値を取り出すことができます。同じキーを持つペアは1つしか持てません。
 *  代表的な実装クラスとしてHashMapやTreeMapがあります。
 *  
 *	これらのコレクションは、要素の追加・削除・検索・ソートなど、多様な操作を提供しています。
 *	また、ジェネリックスを使って、型安全な操作が可能です。コレクションは、Javaのプログラム開発において非常に重要な役割を担っています。
 *
 *	Stream API
 *
 *		大量のデータが登録されているArrayList からfor文で1つずつ確認するのではなく
 *		フィルタリングをすることによって効率的に取り出すことが出来る。
 *
 *		List<Person> people = ... // データが格納されたArrayList
 *　
 *		List<Person> filteredPeople = people.stream() 
 *	    	.filter(p -> "山田".equals(p.getName()))
 *	    	.collect(Collectors.toList());
 *
 * コレクションインターフェース
 * 
 * 	クラス名	ｲﾝﾀｰﾌｪｰｽ	項目の重複		順序付け/ソート			同期性
 * 
 * 	ArrayList	　List		　可能		インデックス順,ソートなし	　無
 * 	LinkedList	  List		  可能		インデックス順,ソートなし	　無
 * 	Vector		  List		  可能		インデックス順,ソートなし	　有	
 * 	HashSet		  Set		  不可		順序付けなし、ソートなし	　無
 * 	LinkedHashSet Set		  不可		挿入順、ソートなし			　無
 * 	TreeSet		　Set		　不可		自然順または比較			　無
 * 										ルールでのソート	
 * 																	など　64p 参照
 * 
 * 
 */

package jp.sample12;

public class Sample12_2 {
	public static void main(String[] args) {
		HashStore hs1 = new HashStore(89, 101);
		HashStore hs2 = new HashStore(75, 101);
		HashStore hs3 = new HashStore(89, 101);
		
		System.out.println("Hashcode for hs1:" + hs1.hashCode());
		System.out.println("Hashcode for hs2:" + hs2.hashCode());
		System.out.println("Hashcode for hs3:" + hs3.hashCode());
		
		if (hs1.equals(hs2)) {
			System.out.println("hs1 is equal to hs2");
		} else {
			System.out.println("hs1 is not equal to hs2");
		}
		
		if (hs1.equals(hs3)) {
			System.out.println("hs1 is equal to hs3");
		} else {
			System.out.println("hs1 is not equal to hs3");
		}
	}
}

class HashStore {
	private int key;
	private int value;
	private int storeSize = 10;
	
	HashStore(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof HashStore)) {
			return false;
		}
		HashStore hs = (HashStore) obj;
		return (key == hs.key && value == hs.value);
	}
	
	public int hashCode() {
		return key % storeSize;
	}
}