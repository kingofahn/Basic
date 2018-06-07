package step4;

import javax.swing.JOptionPane;
enum Butt{
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGJAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
	DIAGONAL,
	SNAIL,
	MAGIC_SQUARE,
	MATRIX_CONVERSION;
}

public class matrix {
	public static String leftTriangle() {
	String result ="";
		int[][] matrix = new int[5][5];
		int k=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				k++;
				matrix[i][j] = k;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0; j<5 ;j++) {
				result+=(matrix[i][j] + "  ");
			}
			result+=("\n");
		}
		return result;
	}
	
	private static String diagonal() {
		String result ="";
		
        int[][] mtx = new int[5][5];
        int i = 0, j = 0, k = 0;
        for (int a = 0; a <= 8; a++) {
            if (a <= 4) {
                i = 0;
                j = a;
                for (int s = 0; s <= a; s++) {
                    k++;
                    mtx[i][j] = k;
                    i++;
                    j--;
                }
            } else {
                i = a - 4;
                j = 4;
                for (int t = 8 - a; t >= 0; t--) {
                    k++;
                    mtx[i][j] = k;
                    i++;
                    j--;
                }
            }
        }
        for (int y = 0; y <= 4; y++) {
            for (int u = 0; u <= 4; u++) {
            	result+=(mtx[y][u]);
            }
            result+=("\n");
        }
		
		return result;
	}

	
	private static String diamond() {
		String result ="";

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
				result+=matrix[i][j];
			}
			result+="\n";
		}
		
		return result;
	}
	
	private static String magicSqure() {
		String result ="";
		
		int S[][] = new int[5][5];
		int R=0, C=2;
		for(int N = 1;N<=25;N++){
			S[R][C] = N;
			int NR = R - 1;
			int NC = C + 1;
			if (NR == -1) {
				NR = 4;
			}
			if (NC == 5) {
				NC = 0;
			}
			if (S[NR][NC] == 0) {
				R = NR;
				C = NC;
			} else {
				R++;
			}
		}
		
			for (int NR = 0; NR <= 4; NR++) {
				System.out.println();
				for (int NC = 0; NC <= 4; NC++) {
					result+=S[NR][NC];
				}
				result+="\n";
			}
		
		return result;
	}
	
	
	private static String matrixVertical() {
		String result ="";
		
		int k =0;
		int[][] mtx = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				k++;
				mtx[j][i] =k;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<5; j++) {
				result+=mtx[i][j];
			}
			result+="\n";
		}
		
		return result;
	}
	
	private static String rightTriangle() {
		String result ="";
			int k=0;
			int [][] matrix = new int[5][5];
			for(int i=0; i<5; i++) {
				for(int j=4-i; 4-j>=0 ; j++) {
					k++;
					matrix[i][j]=k;
				}
			}

			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					result+=matrix[i][j];
				}
				result+="\n";
			}
		
		return result;
	}
	
	private static String sandGlass() {
		String result ="";
		int k = 0, t = 0, x = 0, y = 0;
		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			if (i < 3) {
				for (int j = 0 + x; j < 5 - x; j++) {
					k++;
					matrix[i][j] = k;
				}
				x++;
			} else {
				for (i = 3; i < 5; i++) {
					for (int j = 1 - y; j < 4 + y; j++) {
						k++;
						matrix[i][j] = k;
					}
					y++;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("");
			for (int j = 0; j < 5; j++) {
				result+=matrix[i][j];
			}
			result+="\n";
		}
		return result;
	}
	
	private static String snail() {
		String result ="";
		
		int A[][] = new int[5][5];
		int N = 0, S = 1, i = 0, j = -1, K = 5;
					
		while(true) {
			for(int P = 0; P < K; P++) {
				N = N + 1;
				j = j + S;
				A[i][j] = N;
			}
			K = K - 1;
			if(K <= 0) break;
			for(int P=0; P < K; P++) {
				N = N + 1;
				i = i + S;
				A[i][j] = N;
			}
			S = S * (-1);
		}
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++)
				result+=A[i][j] + " ";
		 	result+="\n";
			
		}
		
		return result;
	}
	
	private static String triangle() {
		String result ="";
		
			int k=0, t=0;
			int [][] matrix = new int[7][4];

			
			for(int j=0; j<4;j++) {
				for(int i=3-t; i<4+t; i++) {
					k++;
					matrix[i][j]=k;
				}
				t++;
			}
			for(int i=0; i<7;i++) {
				for(int j=0; j<4;j++) {
					System.out.print(matrix[i][j]+"\t");
				}
				System.out.println();
			}
		
		return result;
	}
	
	private static String zigzag() {
		String result ="";
		
		int[][] matrix = new int[5][5];
		int k = 0;

		for (int i = 0; i < 5; i++) {
			if(i%2==0) {
				for (int j = 0; j < 5; j++) {
					k++;
					matrix[i][j] = k;}
			} else {
				for (int j = 4; j >= 0; j--) {
					k++;
					matrix[i][j] = k;}
			}
		}

	for(int i = 0;i<5;i++)	{
		System.out.println();
		for (int j = 0; j < 5; j++) {
			System.out.print(matrix[i][j] + "\t");
		}
	}
		
		return result;
	}
	
	public static void main(String[] args) {
		Butt[] buttons= {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGJAG,
				Butt.DIAMOND,
				Butt.SAND_GLASS,
				Butt.TRIANGLE,
				Butt.DIAGONAL,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE,
				Butt.MATRIX_CONVERSION
		};
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, // frame
					"MATRIX PAGE", // frame title
					"SELECT MATRIX MUNU", // ORDER
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
					);
			switch(select) {
			case EXIT : return;
			case LEFT_TRIANGLE: 
				JOptionPane.showMessageDialog(null,leftTriangle());
				break;
			case RIGHT_TRIANGLE: 
				JOptionPane.showMessageDialog(null,rightTriangle());
				break;
			case DIAGONAL: 
				JOptionPane.showMessageDialog(null,diagonal());
				break;
			case DIAMOND: 
				JOptionPane.showMessageDialog(null,diamond());
				break;
			case MAGIC_SQUARE: 
				JOptionPane.showMessageDialog(null,magicSqure());
				break;
			case MATRIX_CONVERSION: 
				JOptionPane.showMessageDialog(null,matrixVertical());
				break;
			case SAND_GLASS: 
				JOptionPane.showMessageDialog(null,sandGlass());
				break;
			case SNAIL: 
				JOptionPane.showMessageDialog(null,snail());
				break;
			case TRIANGLE: 
				JOptionPane.showMessageDialog(null,triangle());
				break;
			case ZIGJAG: 
				JOptionPane.showMessageDialog(null,zigzag());
				break;
			default: break;
			}
		}
	}
}
//		while(true) {
//			String menu ="1.LeftTriangle"+"2.Diagonal"+"3.Diamond"+"4.MagicSqure"+"6.MatrixVertical"+"7.RightTriangle"+"8.SandGlass"
//					+"9.Snail"+"10.Triangle"+"11.Zigzag";
//			switch (JOptionPane.showInputDialog("")) {
//			case "1":
//				JOptionPane.showMessageDialog(null,leftTriangle());
//				break;
//			case "2":
//				JOptionPane.showMessageDialog(null,diagonal());
//				break;
//			case "3":
//				JOptionPane.showMessageDialog(null,diamond());
//				break;
//			case "4":
//				JOptionPane.showMessageDialog(null,magicSqure());
//				break;	
//			case "5":
//				JOptionPane.showMessageDialog(null,matrixVertical());
//				break;
//			case "6":
//				JOptionPane.showMessageDialog(null,rightTriangle());
//				break;
//			case "7":
//				JOptionPane.showMessageDialog(null,sandGlass());
//				break;
//			case "8":
//				JOptionPane.showMessageDialog(null,snail());
//				break;
//			case "9":
//				JOptionPane.showMessageDialog(null,triangle());
//				break;
//			case "10":
//				JOptionPane.showMessageDialog(null,zigzag());
//				break;
//			default:
//				break;
//			}	

