package step4;

public class MatrixBasic2 {
	public static void main(String[] args) {
		int k=0;
		int [][]  mtx = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				k++;
				mtx[i][j]=k;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
