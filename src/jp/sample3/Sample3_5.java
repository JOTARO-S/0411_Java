package jp.sample3;

//import java.util.Scanner;

/*  switch文
 * 
 *    ---break有---				 ---break無---              
 * 
 *  switch( 整数式 ) {			switch( 整数式 ) {
 *  case 定数式1:				case 定数式1:
 *  	 処理1;						 処理1;
 *  	 break;					case 定数式2:	 
 *  case 定数式2:					 処理2;
 *  	 処理2;					default:	 
 *  	 break;						 処理3;
 *  default:					}	 
 *  	 処理3;					
 *  }
 *  
 *   break有とbreak無で結果が変わる
 *   break有の場合は定数式に当てはまった時点でswitch文の処理が終了するが、
 *   break無の場合は定数式に当てはまった時点でそれ以降の処理が全て行われる(定数式1がTrueだった場合、処理1と処理2と処理3が実行される)
 *   全て当てはまらないdfaultがあればその処理を実行する。(if文のelseみたいなもの)
 *  
 */


public class Sample3_5 {
	public static void main(String[] args) {
		
		int i = 2;
		
		//Scanner sc = new Scanner(System. in);
		//int i = sc.nextInt();
		switch(i) { //整数式をiとする
		case 1: //iの値が1だった場合
			System.out.println("i は 1 です。"); //iの値が1だった場合の処理
			break; //switch文の処理を終了させる
		case 2: //iの値が2だった場合
			System.out.println("i は 2 です。"); //iの値が2だった場合の処理
			break; //switch文の処理を終了させる
		default: //全てのcaseに当てはまらなかった場合
			System.out.println("i は 1 でも 2 でもありません。"); //全てのcaseに当てはまらなかった場合の処理
		}
		//sc.close();
		
	}

}