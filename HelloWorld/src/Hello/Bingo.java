package Hello;

public class Bingo {
	public static void main(String[] args) {

		int[][] aAry = new int[5][5]; // =
										// {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int c = 1;
		for (int a = 0; a < aAry.length; a++) {
			for (int b = 0; b < aAry.length; b++) {
				aAry[a][b] = c++;
			}
		}
//		for (int i = 0; i < aAry.length; i++) {
//			for (int j = 0; j < aAry.length; j++) {
		for (int j = 4; j >= 0; j--) {
			for (int i = 0; i <= 4; i++) {
				System.out.print(aAry[i][j] + " ");
			}
			System.out.println();
		}
	}
}
