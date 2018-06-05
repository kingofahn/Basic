package step4;

public class Zigzag {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int k = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println();
			if(i%2==0) {
				for (int j = 0; j < 5; j++) {
					k++;
					matrix[i][j] = k;}
			} else {
				for (int j = 4; j >= 0; j--) {
					k++;
					matrix[i][j] = k;}
			}
		}

	for(int i = 0;i<5;i++)	{
		System.out.println();
		for (int j = 0; j < 5; j++) {
			System.out.print(matrix[i][j] + "\t");
		}
	}

}

}
