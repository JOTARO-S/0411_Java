package jp.Practice.p0417;

public class Practice0417_5 {
	public static void main(String[] args) {
	//Practice0417_5
		String[] array = {"りんご", "みかん", "ばなな"};
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals("りんご")) {
				System.out.println(array[i]+"(apple)");
			} else if(array[i].equals("みかん")) {
				System.out.println(array[i]+"(orange)");
			} else if(array[i].equals("ばなな")) {
				System.out.println(array[i]+"(banana)");
			}
			
		}
	}
}
