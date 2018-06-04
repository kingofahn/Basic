package afterClassPractice;

import javax.swing.JOptionPane;

public class Calc3 {
	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("num1?");
		String result = num1;
		int sum = Integer.parseInt(num1);
		while (true) {
			String num2 = "";
			switch (JOptionPane.showInputDialog("OP")) {
			case "+":
				num2 = JOptionPane.showInputDialog("Num2?");
				result += "+" + num2;
				sum += Integer.parseInt(num2);
				break;
			case "-":
				num2 = JOptionPane.showInputDialog("Num2?");
				result += "-" + num2;
				sum += Integer.parseInt(num2);
				break;
			case "*":
				num2 = JOptionPane.showInputDialog("Num2?");
				result += "*" + num2;
				sum *= Integer.parseInt(num2);
				break;
			case "/":
				num2 = JOptionPane.showInputDialog("Num2?");
				result += "/" + num2;
				sum /= Integer.parseInt(num2);
				break;
			case "%":
				num2 = JOptionPane.showInputDialog("Num2?");
				result += "%" + num2;
				sum %= Integer.parseInt(num2);
				break;
			case "=":
				JOptionPane.showMessageDialog(null, result + "=" + sum);
				return;
			}
		}
	}
}
