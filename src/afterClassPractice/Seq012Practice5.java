package afterClassPractice;

// 짝수에서 에러남 ..아직 못잡음 짝수를 계산하면 홀수로 가는 현상이 있음...
import java.util.Scanner;

public class Seq012Practice5 {
	public static void min(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ODD 2.EVEN");
			switch(sc.nextInt()) {
			case 1 : 
				int max = 0, min = 0, sum = 0, oddTotal = 0;
				String result = "";
				System.out.println("intser number1");
				int num1 = sc.nextInt();
				System.out.println("intser number1");
				int num2 = sc.nextInt();

				max = (num1 > num2) ? num1 : num2;
				min = (num1 > num2) ? num2 : num1;

				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						sum += i;
						result += (i == max) ? i + "=" : i + "+";
					}
				}
				System.out.println(result + sum);
				break;
				
				
			case 2 : 
				int start = 0, end = 0, sum1 = 0; 
				String result1 = "";
				System.out.println("intser number1");
				num1 = sc.nextInt();
				System.out.println("intser number1");
				num2 = sc.nextInt();
				start = (num1 > num2) ? num1 : num2;
				end = (num1 > num2) ? num2 : num1;

				for(int i = start; i <= end; i++) {
					if (i%2==0) {
						sum1+=i;
						if(i==end) {
							result1 += i + "=";
						} else {
							result1 += i + "=";
						}
					}
				}
				System.out.println("result" + result1 + "sum" + sum1);
					break;
			default : System.out.println("Error"); return;
				
			}
		}
	}
}
