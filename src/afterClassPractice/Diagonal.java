package afterClassPractice;

public class Diagonal {
	public static void main(String[] args) {
		int k=0, i=0;
		int [][] mtx = new int [5][5];
		
		for(int cnt =0; cnt<9; cnt++) {
			for(int s=0; s<=cnt; s++) {
				k++;
				int j=cnt;
				mtx[i][j]=k;
				j--;
			}
		}
		
		for(i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf("%d\t",mtx[i][j]);
			}
		}
	}
}
