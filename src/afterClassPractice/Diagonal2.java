package afterClassPractice;

public class Diagonal2 {
	public static void main(String[] args) {
		int num1=0, num2=0;
		int k=0, a=0,b=4;
		int [][] mtx = new int[5][5];
		
		
		for(int i=a; i<5-b; i++) {
			k++;
			num2++;
			mtx[num1][num2]=k;
			k++;
			num2=0;
			num1++;
			mtx[num1][num2]=k;
			num1--;
			b++;
		}  
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(mtx[i][j]);
			}
			System.out.println();
		}
	}
}
