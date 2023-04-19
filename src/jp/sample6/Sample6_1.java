package jp.sample6;

/* 継承
 * 	既存のクラスを拡張するために新しいクラスでメンバを引き継ぐことを継承という
 * 	既存のクラスのことをスーパークラス(親クラス)、受け継ぐ新しいクラスをサブクラス(子クラス)という
 * 
 * 動物がスーパークラスの場合、犬や猫などがサブクラスとなる
 * 
 * 【修飾子】 class サブクラス名 extends スーパークラス名 { }
 * 
 * 			class 犬 extends 動物 {} や class 猫 extends 動物 {} となる
 * 			class ポチ extends 犬 {} のようにサブクラスのサブクラスを作ることも可能
 * 
 * 	サブクラスがインスタンス化されると、スーパークラスの属性(変数)と操作(メソッド)をすべて引き継ぐため、
 * 	サブクラスでは、新しく追加した属性や操作のみを記入するだけで済む
 * 	Javaでは複数のクラスの継承は出来ない(多重継承)
 * 	ただし、スーパークラスから継承したクラスから継承などは可能
 * 	クラス宣言にfinalキーワードがついている場合、サブクラスの作成は行えない
 * 
 * ポケモンで例えると
 * 	Pokemonクラス ⇒ スーパークラス
 * 	Pikachuクラス ⇒ Pokemonクラスのサブクラス
 * 	AshPikachuクラス ⇒ Pokemonクラスを継承しているPikachuクラスのサブクラス
 * 	Trainerクラス ⇒ スーパークラス
 *  GymLeaderクラス ⇒ Trainerクラスのサブクラス
 *  Battleクラス ⇒ スーパークラス　など
 * 
 * 
 * 
 */

class Animal {
	private String voice;
	private String name;
	
	public Animal() {
		System.out.println("動物を登録しました");
	}
	
	public void setAnimal(String n, String v) {
		name = n;
		voice = v;
	}
	public void showAnimal() {
		System.out.println("名前は" + name + "で" + voice + "と鳴きます。");
	}
}

class Dogs extends Animal {
	Dogs() {
		System.out.println("犬が登録されました");
	}
}


public class Sample6_1 {
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		d1.setAnimal("クッキ","わんわん");
		d1.showAnimal();
	}
}