package jp.Practice.p0417;

public class Practice0417_4 {
	public static void main(String[] args) {
	//Practice0417_4
		int[] array = {7, 3, 2, 9, 1};
		int sum = 0;
		double avg = 0;
		int max = array[0];
		int min = array[0];
		
		
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		for(int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		avg = sum / array.length;
		
		System.out.println("合計は" + sum);
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
		System.out.println("平均は" + avg);
	}
}
