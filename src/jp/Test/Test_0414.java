package jp.Test;

public class Test_0414 {
	public static void main(String[] args) {
		//呼び出し側
		String name = "佐藤"; //このように外側で引数が設定されていてもよい
		show(name); //他のクラスにあるメソッドを呼ぶ場合は参照名を記載する。同一クラスの場合は不要。
		
		System.out.println(max(10,32)); //System.out.println();で定義されているmax()を呼び出す。
										 //その際、引数が2つ定義されているため2つ必要
		
		for (int x = 0; x < 10;x++) {
			for(int y = 0; y < 10; y*=2) {
				System.out.println(max(x,y));
			}
		}
		
		//呼び出す側は実際の値があれば良い為、String nameなどのデータ型などいらない。
		
		// System.out.println("end"); // System.out.println("end"); よりも 先に show();が実行される。
	}
	
	//定義側
	public static void show(String name) {
		// System.out.println("メソッドテスト");
		 System.out.println(name + "さん、ようこそ");
	}
	
	public static int max(int num1, int num2) { //2つの引数で構成されたint型のmax(int型のnum1, int型のnum2)を定義する
		int result = num1 > num2? num1:num2; // int型の result = num1 と num2 の大きいもの
		return result; //戻り値 result を 呼び出し側に返す
	}
}