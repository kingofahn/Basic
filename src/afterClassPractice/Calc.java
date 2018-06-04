package afterClassPractice;
import javax.swing.JOptionPane;
public class Calc {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("num?");
		String result1= num1+"";
		int result = Integer.parseInt(num1);
		while(true) {
			String num2 ="";
			switch(JOptionPane.showInputDialog("Op?")) {
			case "+": 
				num2 = JOptionPane.showInputDialog("num?");
				result1+= "+"+ num2;
				result+=Integer.parseInt(num2);
				break;
			case "-": 
				num2 = JOptionPane.showInputDialog("num?");
				result1+= "-"+ num2;
				result-=Integer.parseInt(num2);
				break;
			case "*": 
				num2 = JOptionPane.showInputDialog("num?");
				result1+= "*"+ num2;
				result*=Integer.parseInt(num2);
				break;	
			case "%": 
				num2 = JOptionPane.showInputDialog("num?");
				result1+= "%"+ num2;
				result%=Integer.parseInt(num2);
				break;
			case "/": 
				num2 = JOptionPane.showInputDialog("num?");
				result1+= "/"+ num2;
				result%=Integer.parseInt(num2);
				break;
			case "=":
				JOptionPane.showMessageDialog(null, result1 + "=" + result);
				return;
				
			}
		}
	}
}
