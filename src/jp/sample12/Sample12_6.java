
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

public class Sample12_6 {
	public static void main(String[] args) {
		GrFnc m = new GrFnc();
		m.func(10);
		m.func(new Integer(10));
		m.func(10.0);
		m.func(new Double(10.0));
		m.func("田中");
	}
}

class GrFnc {
	public <T> void func(T val) {
		System.out.println("val = " + val);
	}
}