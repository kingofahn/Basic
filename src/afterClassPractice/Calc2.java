package afterClassPractice;
import javax.swing.JOptionPane;
public class Calc2 {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("num1?");
		int result = Integer.parseInt(num1);
		String result1 = num1;
		while(true) {
			String num2 ="";
			switch(JOptionPane.showInputDialog("op?")) {
			case "+": 
				num2 = JOptionPane.showInputDialog("num2?");
				result1+= "+" + num2;
				result+=Integer.parseInt(num2);
				break;
			case "-": 
				num2 = JOptionPane.showInputDialog("num2?");
				result1+= "-" + num2;
				result-=Integer.parseInt(num2);
				break;
			case "*": 
				num2 = JOptionPane.showInputDialog("num2?");
				result1+= "*" + num2;
				result*=Integer.parseInt(num2);
				break;				
			case "/": 
				num2 = JOptionPane.showInputDialog("num2?");
				result1+= "/" + num2;
				result/=Integer.parseInt(num2);
				break;
			case "%": 
				num2 = JOptionPane.showInputDialog("num2?");
				result1+= "%" + num2;
				result%=Integer.parseInt(num2);
				break;	
			case "=": 
				JOptionPane.showMessageDialog(null,result1 + "=" + result);
				result1+= "=";
				;
				break;
				
			}
		}
	}
}
