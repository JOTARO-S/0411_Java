package jp.Practice.p0417;
import java.util.ArrayList;

public class Practice0417_8 {
	public static void main(String[] args) {
	//Practice0417_8
		ArrayList<Integer> strArray = new ArrayList<>(3);
		strArray.add(0,100);
		strArray.add(1,200);
		strArray.add(2,300);
		for(int i = 0; i < strArray.size(); i++) {
			System.out.println(strArray.get(i));
		}
		int total = 0;
		strArray.set(0,400);
		System.out.println(strArray.get(0));
		for(int i = 0; i < strArray.size(); i++) {
			total = total + strArray.get(i);
		}
		System.out.println(total);
		
		
	}
}
