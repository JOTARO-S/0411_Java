package jp.ssie.ocjp;

public class Sample2_11 {
	public static void main(String[] args) {
		/* StringBilder型のオブジェクトを参照する sb を 作成する(中身は空)
		 * StringBuilder ⇒  Stringと違ってStringBuilderの場合は参照先に上書きされる
		 * new ⇒ インスタンス化(オブジェクトを生成する為に必要) */
		StringBuilder sb = new StringBuilder();
		
		// 文字列 sb に "きつね"を追加する(置き換わる) sb.append("きつね") ⇒ sb に "きつね" を追加する
		System.out.println(sb.append("きつね"));
		
		// 文字列 sb の 0文字目に "きた" を追加する sb.insert(int, "str") ⇒ sbのint文字目に"str"を追加する
		System.out.println(sb.insert(0, "きた"));
		
		// 文字列 sb を 逆に並び替える (きたきつね ⇒ ねつきたき になる) sb.reverse
		System.out.println(sb.reverse());
		
		/* 文字列 sb の 4文字目から5文字目の文字を削除する (ねつきたき の たき が削除される ⇒ ねつき になる)
		 * sb.delete(int1, int2) ⇒ sbのint1文字目からint2文字目までの文字を削除する */
		System.out.println(sb.delete(3, 5));
		
		/* 文字列 sb の 2文字目以上3文字未満の文字を"ま"に変換する 
		* sb.replace(int1, int2, "str") ⇒ sbのint1文字目以上int2文字目未満の文字を"str"に変換する */
		System.out.println(sb.replace(1, 2, "ま"));
		
		// 文字列 sb の 0文字以上2文字未満の文字を取り出す  sb.subString(int1, int2)
		System.out.println(sb.substring(0, 2));
		
		// 文字列 sb の 0番目の文字から取り出す sb.subString(int)
		System.out.println(sb.substring(0));
		
		// ------------------------------------------------------------------
		
		/*
		ファイル名や拡張子を取得する際などにtoStringが有効
		"."を基準に末尾まで取得すれば拡張子
		"/"を基準に末尾まで取得すればファイル名
		を取得することが出来る。 
		*/
		StringBuilder sb2 = new StringBuilder();
		sb2.append("c:\\test\\a.txt"); // sb2.appendで拡張子を取得したいファイル名を追加する
		System.out.println(sb2.substring(sb2.indexOf(".") + 1)); //sb2.indexOf(".")
		
		//下記のコードでも記述は違うが結果は同じになる
		StringBuilder sb3 = new StringBuilder();
		sb3.append("c:\\test\\a.txt"); // sb3.appendで拡張子を取得したいファイル名を追加する
		int start = sb3.indexOf("."); //sub3のファイル名から"."を取得する
		System.out.println(sb3.substring(start + 1)); //
		
		
	}

}
