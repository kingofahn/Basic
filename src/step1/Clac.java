package step1;
import java.util.Scanner;
/**
 두수를 입력받아서 계산하는 계산기
 * */
public class Clac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.End 1.Start");
			switch(sc.nextInt()){
				case 0 : System.out.println("End"); return;
				case 1 : System.out.println("Start");
				int sum=0;
				String result = "";
				System.out.print("Input number 1 > ");
				int num1 = sc.nextInt();
				System.out.print("Input operation code + - * / % > ");
				String opInput = sc.next();
				System.out.print("Input number 2 > ");
				int num2 = sc.nextInt();

				switch(opInput){
					case "+":sum = num1 + num2;break;
					case "-":sum = num1 - num2;break;
					case "*":sum = num1 * num2;break;
					case "/":sum = num1 / num2;break;
					case "%":sum = num1 % num2;break;
					default : result="Error"; 
				}
				if(!result.equals("Error")){
					result = "Result > " + num1 + opInput + num2 + "=" + sum;
				}
				System.out.println(result);	 break;
				default : System.out.println("Wrong!!!"); return;
			}	
		}
	}
}
