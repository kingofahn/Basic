package afterClassPractice;

public class MatrixPractice {
	public static void main(String[] args) {
		int k = 0;
		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					k++;
					matrix[i][j] = k;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					k++;
					matrix[i][j] = k;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				k++;
				System.out.printf("%d\t", matrix[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
