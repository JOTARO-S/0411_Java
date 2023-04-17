package jp.ssie.ocjp;

public class Practice0417_6 {
	public static void main(String[] args) {
	//Practice0417_6
		int[][] array = new int [9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
			array[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i = 0; i < 9; i++) {
			System.out.print("{ ");
			for(int j = 0; j < 9; j++) {
				if( j < array.length - 1) {
					System.out.print(array[i][j] + ", ");
				} else {
					System.out.print(array[i][j] + "");
				}
			}
			System.out.println("}");
		}
	}
}
