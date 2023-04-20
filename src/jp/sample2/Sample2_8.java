package jp.sample2;

public class Sample2_8 {
	public static void main(String[] args) {

		int num;
		
		System.out.println("後置の場合");
		num = 10;
		System.out.println(num++); //num++の場合、変数を利用した後に加算される
		System.out.println(num);
		
		System.out.println("前置の場合");
		num = 10;
		System.out.println(++num); //++numの場合、変数を利用する前に加算される
		System.out.println(num);
	}

}