package step4;
public class Diamond {
	public static void main(String[] args) {
		int k=0, t=0;
		int [][] matrix = new int[5][5];

		for(int i=0;i<5;i++) {
			if(i<3) {
				for(int j=2-i; j<3+i; j++) {
					k++;
					matrix[i][j] = k;
				}	
			} else {
				for(int j=1+t; j<4-t; j++) {
					k++;
					matrix[i][j] = k;
				}
				t++;	
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				System.out.printf("%d \t",matrix[i][j]);
			}
		}
	}
}
