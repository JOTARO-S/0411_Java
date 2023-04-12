package jp.ssie.ocjp;

public class Sample2_10 {
	public static void main(String[] args) {
	    String str = "きつね";
	    
	    System.out.println(str.charAt(0)); //str.charAt(int) ⇒ 1文字ずつ取り出す int が 0⇒1文字目、1⇒2文字目、2⇒3文字目 ...
	    System.out.println(str.charAt(1));
	    System.out.println(str.charAt(2));
	    
	    System.out.println(str.indexOf("つ")); //str.indexOf("x") ⇒ 変数str内の文字"x"の位置を出力する
	    System.out.println("何文字？>>>> " + str.length()); //str.length() ⇒ 変数strの文字数を出力する
	    System.out.println(str.toString()); //str.toString() ⇒ strが参照している文字列を出力する
	}

}