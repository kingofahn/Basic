package step4;

public class Triangle {
	public static void main(String[] args) {
		int k=0, t=0;
		int [][] matrix = new int[7][4];

		
		for(int j=0; j<4;j++) {
			for(int i=3-t; i<4+t; i++) {
			System.out.println();
				k++;
				matrix[i][j]=k;
			}
			t++;
		}
		for(int i=0; i<7;i++) {
			System.out.println();
			for(int j=0; j<4;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
		}
	}
}