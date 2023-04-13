package jp.ssie.ocjp;

/* 									
 *		実験用								
 */

public class Experiment {
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i == 6 && j == 6) {
                	System.out.println("i = " + i + " j = " + j + " ゾロ目!! & Finish!!");
                } else if (i == j) {
                	System.out.println("i = " + i + " j = " + j + " ゾロ目!!");
                } else {
                	System.out.println("i = " + i + " j = " + j);
                }
            }
		}
	}
}
