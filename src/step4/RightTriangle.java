package step4;
public class RightTriangle {
	public static void main(String[] args) {
		int k=0;
		int [][] matrix = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=4-i; 4-j>=0 ; j++) {
				k++;
				matrix[i][j]=k;
				System.out.println("");
			}
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
