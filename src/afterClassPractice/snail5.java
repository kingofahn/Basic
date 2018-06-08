package afterClassPractice;
public class snail5 {
	public static void main(String[] args) {
		int [][] mtx = new int [5][5];
		int num1=0;
		int num2=-1;
		int k=0;
		int end=5;
		int sw=1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<end; j++) {
				k++;
				num2+=sw;
				mtx [num1][num2] =k;
			}
			end--;
			for(int j=0; j<end; j++) {
				k++;
				num1+=sw;
				mtx [num1][num2] =k;
			}
			sw*=-1;
		}
			
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf("%d \t",mtx[i][j]);
			}
		}
	}
}
