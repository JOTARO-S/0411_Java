package jp.sample2;

public class Sample2_6 {
	public static void main(String[] args) {
		
		String str1 = "ライオン";
		String str2 = "ペンギン";
		
		System.out.println("Str1    :" + str1);
		System.out.println("Str2    :" + str2);
		
		
		System.out.println();
		
		
		str2 = str1;
		System.out.println("Str2 = str1; を行いました。");
		System.out.println("Str1    :" + str1);
		System.out.println("Str2    :" + str2);
		
		
		System.out.println();
		
		str1 = "ゾウ";
		System.out.println("Str1の文字列を変更しました。");
		System.out.println("Str1    :" + str1);
		System.out.println("Str2    :" + str2);
	}
}