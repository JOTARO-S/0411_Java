package jp.ssie.ocjp;

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

class Dog {
	static int count;
	String name;
	String kensyu;
	
	public Dog(String n, String k) {
		name = n;
		kensyu = k;
		count++;
	}
	
	String getName() {
		return name;
	}
	
	String getKensyu() {
		return kensyu;
	}
}

