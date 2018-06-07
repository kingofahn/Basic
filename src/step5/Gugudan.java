package step5;

import javax.swing.JOptionPane;

public class Gugudan {
	public static void main(String[] args) {
		String result="";
			for(int i=1; i<=9; i++) {
				for(int j=2; j<=5; j++) {
					result+=j + " X " + i + " = " + i*j + "   ";
				}
				result+="\n";
			}
			result+="===================================\n";;
			
			for(int i=1; i<=9; i++) {
				for(int j=6; j<=9; j++) {
					result+=j + " X " + i + " = " + i*j + "    ";
				}
				result+="\n";	
		}
		JOptionPane.showMessageDialog(null,result);
	}
}
