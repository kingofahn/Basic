package afterClassPractice;
import javax.swing.JOptionPane;
public class RPSGame {
	public static void main(String[] args) {
		int random=0, win=0,lose=0,draw=0;
		while(true) {
					switch (JOptionPane.showInputDialog("0종료 1시작")) {
					case "0": JOptionPane.showMessageDialog(null,"win : " + win + " lose : " + lose + " draw : " + draw); return;
					case "1": 
						int player1 = Integer.parseInt(JOptionPane.showInputDialog("1.가위 2.바위 3.보"));
						int player2=(int)(Math.random()*3)+1;
						JOptionPane.showMessageDialog(null,"Computer =" + player2);
						switch(player1-player2) {
						case -1 : case 2:JOptionPane.showMessageDialog(null,"Player win");win+=1;break;
						case 1 : case -2:JOptionPane.showMessageDialog(null,"Player lose");	lose+=1;break;
						case 0: JOptionPane.showMessageDialog(null,"draw");	draw+=1;break;
						default : JOptionPane.showMessageDialog(null,"error");break;
						}break;
					default :JOptionPane.showMessageDialog(null,"error"); break;
					}		
		}
	}
}
