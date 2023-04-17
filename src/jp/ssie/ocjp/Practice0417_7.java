package jp.ssie.ocjp;
import java.util.ArrayList;

public class Practice0417_7 {
	public static void main(String[] args) {
	//Practice0417_7
		ArrayList<String> strArray = new ArrayList<>(5);
		strArray.add(0,"鈴木");
		strArray.add(1,"佐藤");
		strArray.add(2,"田中");
		strArray.add(3,"井上");
		strArray.add(4,"前田");
		System.out.println(strArray.get(strArray.size() -1));
		strArray.remove(1);
		for(int i = 0; i < strArray.size(); i++) {
			System.out.println(strArray.get(i));
		}
	}
}
