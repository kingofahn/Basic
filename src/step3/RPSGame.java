package step3;
import javax.swing.JOptionPane;
/**
 두 플레이어가 가위바위로를 해서 승리를 결정짓도록 출력
 */
public class RPSGame {
	public static void main(String[] args){
		int win = 0, lose = 0, draw=0, random=0;
		while(true) {
			String input = JOptionPane.showInputDialog("0.종료, 1시작");
			switch(Integer.parseInt(input)) {
				case 0 : JOptionPane.showMessageDialog(null,"종료합니다"); 
				JOptionPane.showMessageDialog(null," win : "+ win + " lose : " + lose + " Draw : " + draw);   
				return;
				case 1 : 
					int input1 = Integer.parseInt(JOptionPane.showInputDialog("===== Rock(1) Scissor(2) Paper(3) ======"));
					int input2= (int)(Math.random()*3)+1;
						JOptionPane.showMessageDialog(null,"Computer =" + input2);
						switch(input1-input2) {
						case -1 : case 2:JOptionPane.showMessageDialog(null,"Player win");win+=1;break;
						case 1 : case -2:JOptionPane.showMessageDialog(null,"Player lose");	lose+=1;break;
						case 0: JOptionPane.showMessageDialog(null,"draw");	draw+=1;break;
						default : JOptionPane.showMessageDialog(null,"error");break;
						}break;
				default : JOptionPane.showMessageDialog(null, "error");break;
			}
		}
	}
	
}
