package jp.sample5;

/*インスタンス変数とstatic変数の例
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class Sample5_2 {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("メロン", "柴犬");
		Dog dog2 = new Dog("ポチ", "ミニチュアダックス");
		Dog dog3 = new Dog("まさお", "ラブラドール・レトリーバー");
		
		System.out.println("名前は" + dog1.getName() + "で、犬種は" + dog1.getKensyu() + "です。");
		System.out.println("名前は" + dog2.getName() + "で、犬種は" + dog2.getKensyu() + "です。");
		System.out.println("名前は" + dog3.getName() + "で、犬種は" + dog3.getKensyu() + "です。");
		
		//static変数はインスタンス化しなくても良い
		System.out.println("数：" + Dog.count + "匹です。");
	}

}

class Dog { //犬クラス(Dog) を作成 
	static int count; //犬の数
	String name; //インスタンス変数の犬の名前を宣言
	String kensyu; // インスタンス変数の犬の種類を宣言
	
	public Dog(String n, String k) { //犬クラスのString n と String k を宣言
		name = n; //インスタンス変数の name に n を代入する
		kensyu = k; //インスタンス変数の kenshu  k
		count++; //count を 1 加算する
	}
	
	String getName() {
		return name; //戻り値で name を 返す
	}
	
	String getKensyu() {
		return kensyu; //戻り値で kensyu を返す
	}
}

