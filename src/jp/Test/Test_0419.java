package jp.Test;

/* 
 * インスタンス変数 name を用意
 * setterを用意 引数の変数名は name
 * 
 * Parsonクラスを作成
 * name
 * age
 * コンストラクタでname, ageを設定できるように
 * 
 *  Programmingインターフェースを作成
 *  void showSkill() を定義
 *  
 *  Programmerクラス Personを継承 Proggramingを実装
 *  skill変数を定義
 * 
 */

//スーパーインターフェース Programming

/*

interface Programming {
	public void showSkill();
}

//スーパークラス Parson
class Parson {
	private String name; //名前
	private int age; //年齢
	
	//Parson インスタンス
	 Parson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	 // Parson setter
	void setName(String name) {
		this.name = name;
	}
	
	// Parson show
	void show() {
		System.out.println("名前は" + name + "です 年齢は" + age + "です。");
	}
}

//サブクラス& サブインターフェース Programmer 
class Programmer extends Parson implements Programming {
	private String skill; //プログラミングスキル
	
	//Programmer インスタンス
	Programmer(String name, int age) {
		super(name,age);
	}
	
	Programmer(String name, int age, String skill) {
		super(name,age);
		this.skill = skill;
	}
	
	// Skill setter
	void setSkill(String skill) {
		this.skill = skill;
	}
	
	// Skill getter
	String getSkill() {
		return skill;
	}
	
	@Override //showSkillをオーバーライドする implementした場合必ずオーバーライドしなければならない。
	public void showSkill() {
		super.show();
		System.out.println("プログラミングスキルは" + skill + "です。");
	}

}

public class Test_0419 {
	public static void main(String[] args) {
		Parson par1 = new Parson("山田",20);
		par1.show();
		
		System.out.println();
		
		Programmer pro1 = new Programmer("田中",12,"Ruby");
		pro1.showSkill();
		pro1.setSkill("Java");
		pro1.showSkill();
	}
}

*/

