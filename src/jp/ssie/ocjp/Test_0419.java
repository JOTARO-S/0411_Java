package jp.ssie.ocjp;

class Test {
	String name;
	
	public Test(String name) {
		this.name = name;
	}
	
	public String setName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	void show(String n) {
		System.out.print("名前は" + name);
	}
}

public class Test_0419 {
	public static void main(String[] args) {
		Test tes1 = new Test("僕だよ^^");
		tes1.show("test");
	}
}

