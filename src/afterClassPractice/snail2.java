package afterClassPractice;

public class snail2 {
	public static void main(String[] args) {
		int k=0; // 저장증가 값
		int end=5; // 끝값 
		int sw=1;  // 증가와 감소  기억 스위치
		int num1=0;  // 첫번재 
		int num2=-1; // 두번째 
		int [][]  mtx = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<end; j++) {
				k++;
				num2+=sw;
				mtx[num1][num2]=k;
			}
			end--;
			for(int j=0; j<end; j++) {
				k++;
				num1+=sw;
				mtx[num1][num2]=k;
			}
			sw*=-1;
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%d\t",mtx[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
