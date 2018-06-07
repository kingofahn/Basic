package step5;

import javax.swing.JOptionPane;

public class Salary {
	enum Butt {
		EXIT, 
		INPUT, 
		LIST
	}

	public static void main(String[] args) {
			Butt[] buttons= {
					Butt.EXIT,
					Butt.INPUT,
					Butt.LIST
			};
		String[] contents = {"부서","성명","본봉","수당"};
		String [][] mtx = new String[5][5];
		String result="";
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, // frame
					"부서별 합계", // frame title
					"기능을 선택하시오", // ORDER
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
					);
			
			switch(select){
				case EXIT : return;

				case INPUT : 
					for(int i=0; i<4; i++) {
						for(int j=0;j<4; j++ ) {
							mtx[i][j]= JOptionPane.showInputDialog(contents[j]+"?");
						}
					} 
					
					break;
				case LIST : 
					for(int i=0; i<4; i++) {
						for(int j=0; j<4; j++) {
							result+=mtx[i][j] +" | ";	
						}
						result+="\n";
					}
					JOptionPane.showMessageDialog(null,"| 부서 | 성명 | 본봉 | 수당 | \n" + result);
					break;

				
				default : break; 
			}
		}
	}
}
