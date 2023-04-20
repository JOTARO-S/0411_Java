package jp.sample3;

/* 論理演算子 ⇒ 論理演算(否定・論理積・論理和)を行うための演算
 * 演算子       使用例(説明)
 * 
 * 　!      ⇒      !a (aの否定、Falseの時にTrueを返し、Falseの時にTrueを返す)
 *   &      ⇒     a & b (左辺と右辺どちらもTrueだったらTrueを返し、どちらかが、またはどちらもFalseだった場合はFalseを返す) 
 *   					  かならず左辺。右辺のオペランドは実行される)
 *   |      ⇒     a | b (左辺か右辺どちらかがTrueだったらTrueを返し、それ以外はFlaseを返す
 *   					　かならず左辺。右辺のオペランドは実行される)
 *   &&     ⇒     a && b (左辺と右辺どちらもTrueだったらTrueを返し、どちらかが、またはどちらもFalseだった場合はFalseを返す)
 *   					  左辺がFlaseの場合、右辺のオペランドは実行されない
 *   ||     ⇒     a || b (左辺と右辺どちらかがTrueだったらTrueを返し、どちらかが、またはどちらもFalseだった場合はFalseを返す) 
 *   					　 左辺が偽Flaseの場合、右辺のオペランドは実行されない
 *   ^      ⇒     a ^ b (左辺と右辺どちらもFlaseだったらTrueを返し、どちらかが、またはどちらもTrueだった場合はFalseを返す) 
 */


public class Sample3_1 {
	public static void main(String[] args) {
		int a = 5;
		int b =5;
		
		System.out.println("[&]の場合");
		boolean b1 = a++ < 5 & b++ < 5;
		System.out.println("b1 = " + b1 + ", a = " + a + ", b = " + b);
		
		System.out.println("[&&]の場合");
		b1 = a++ < 5 && b++ < 5;
		System.out.println("b1 = " + b1 + ", a = " + a + ", b = " + b);
	}

}