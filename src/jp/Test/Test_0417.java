package jp.Test;

public class Test_0417 {
	public static void main(String[] args) {
		sum(1,2); //呼び出し側W
		int[] array = {1, 2, 3, 4, 5};
		calculationSum(array);
		int sum = calculationSum(array);
		System.out.println(sum);
		
		
		
	}
	
	//定義側
	//数字を2つ受け取って加算した値を表示する
	public static void sum(int num1, int num2) { //int型 の num1, int型 の num2 を定義する
		System.out.println(num1 + num2);
		
	}
	
	//配列の数字の合計
	public static int calculationSum(int[] array) { //int型の配列 array を定義する
		int sum = 0;
		for(int a : array) {
			sum += a;
		}
		return sum; //戻り値 sum を返す
	}
}

