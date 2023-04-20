package jp.sample3;

import java.util.Scanner;

/*  条件演算子(三項演算子)
 * 
 *　 条件式 ? 式1 : 式2
 *  age < 18 ? "18未満" : "18以上";
 */


public class Sample3_4 {
	public static void main(String[] args) {
		
		//int age = 15;
		
		Scanner sc = new Scanner(System. in);
		int age = sc.nextInt();
		
		// 条件演算子
		System.out.println("18歳以上ですか？");
		String str = age < 18 ? "18歳未満です" : "18歳以上です" ;
		System.out.println(str);
		
		//↑↓どちらも違う記述だが同じ内容を出力する
		
		// if文
		System.out.println("18歳以上ですか？");
		if(age >= 18) {
			System.out.println("18歳以上です");
		} else { 
			System.out.println("18歳未満です");
		}
		sc.close();
		
	}

}