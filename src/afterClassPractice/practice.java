package afterClassPractice;

public class practice {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int num1=0;
		int num2=0;
		int k=0; // 값
		
		
		for(int i=0;i<8; i++) {
			int a=i;
			int j=0;
			num2=i;
			for(j=0; j<a; j++) {
				System.out.print("*");
				k++;
				mtx[num1][num2]=k;
				num1++;
				num2--;
			}
			System.out.print("-");
		}
		

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", mtx[i][j]);
			}
			System.out.printf("\n");
		}

	}
}
