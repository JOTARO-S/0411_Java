package jp.ssie.ocjp;

/* 配列
 * for文を用いた配列の初期化
 * 
 * 
 */	


public class Test_0414_2 {
	public static void main(String[] args) {
		int[] a = new int[10]; // 配列名 a の宣言をする(int型で10の要素)
			
		for (int i = 0; i < a.length; i++) { // for文で i を a.length(今回は要素数が10なので10)回繰り返す 
			a[i] = (i + 1); 		   // i が 1ずつ増えていくので a[i] = ( i + 1);であれば a[0] = 1, a[1] = 2 ... が繰り返され入力される
			System.out.print(a[i] + " ");
		}
		
		System.out.println(); //改行
		
		//while文で表示する方法
		int j = 0;
		while(j < a.length) {
			System.out.print(a[j] + " ");
			j++;
		}
		
		System.out.println(); //改行
		
		int k = 0;
		int[] b = new int[100];
		while(k < b.length) {
			b[k] = (k + 1);
			k++;
			if ((k - 1) % 10 == 0) {
				System.out.println(); //改行
			}
			System.out.print(b[k] + " ");
		}
	}
}