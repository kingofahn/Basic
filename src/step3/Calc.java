package step3;

import javax.swing.JOptionPane;

/*
값을 두개 입력받아서 오칙연산(+,-,*,/,%) 
 * */
public class Calc {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("num1");
		int result = Integer.parseInt(num1);
		String result2 = num1;
		while (true) {
			String num2 = "";
			switch (JOptionPane.showInputDialog("op")) {
			case "=":
				JOptionPane.showMessageDialog(null, result2+"="+result);
				return;
			case "+":
				num2 = JOptionPane.showInputDialog("num2");
				result += Integer.parseInt(num2);
				result2 += "+"+num2;
				break;
			case "-":
				num2 = JOptionPane.showInputDialog("num2");
				result -= Integer.parseInt(num2);
				result2 += "-"+num2;
				break;
			case "*":
				num2 = JOptionPane.showInputDialog("num2");
				result *= Integer.parseInt(num2);
				result2 += "*"+num2;
				break;
			case "/":
				num2 = JOptionPane.showInputDialog("num2");
				result /= Integer.parseInt(num2);
				result2 += "/"+num2;
				break;
			case "%":
				num2 = JOptionPane.showInputDialog("num2");
				result %= Integer.parseInt(num2);
				result2 += "%"+num2;
				break;
			default:
				break;
			}
		}
	}
}