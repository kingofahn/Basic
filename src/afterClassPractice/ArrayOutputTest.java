package afterClassPractice;

public class ArrayOutputTest {

	public static void main(String[] args) {
		int [][] mtx = new int[5][5];
		int k=0, n=0, q=0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				mtx[n][q] =k;
				k++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("\n");
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d \t", mtx[i][j]);
			}
		}
	}
}
