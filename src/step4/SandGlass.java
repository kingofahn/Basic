package step4;

public class SandGlass {
	public static void main(String[] args) {
		int k = 0, t = 0, x = 0, y = 0;
		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 0 + x; j < 5 - x; j++) {
					k++;
					matrix[i][j] = k;
				}
				x++;
			} else {
				for (i = 3; i < 5; i++) {
					for (int j = 1 - y; j < 4 + y; j++) {
						k++;
						matrix[i][j] = k;
					}
					y++;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("");
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		}
	}
}
