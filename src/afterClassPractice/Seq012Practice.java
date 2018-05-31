package afterClassPractice;

/**
입력 받은 것을 2가지 값의 홀수와 짝수의 합을 구하기 [메소드분할]
* */
import java.util.Scanner;

public class Seq012Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Odd 2.Even");
			switch (sc.nextInt()) {
			case 1:
				int min1 = 0, max1 = 0, sum1 = 0, oddTotal = 0;
				String result1 = "";
				System.out.println("Insert number1");
				int num3 = sc.nextInt();
				System.out.println("Insert number2");
				int num4 = sc.nextInt();
				max1 = (num3 > num4) ? num3 : num4;
				min1 = (num3 > num4) ? num4 : num3;

				for (int i = min1; i <= max1; i++) {
					if (i % 2 == 1) {
						sum1 = i++;
					}
				}
				oddTotal = sum1;
				sum1 = 0;

				for (int i = min1; i <= max1; i++) {
					if (i % 2 == 1) {
						sum1+=i;
						result1 += (i == oddTotal) ? i + "=" : i + "+";
					}
					

				}
				System.out.println(result1 + sum1);
				break;
			case 2:
				int max = 0, min = 0, sum = 0, evenTotal = 0;
				String result = "";
				System.out.println("Insert number1");
				int num1 = sc.nextInt();
				System.out.println("Insert number2");
				int num2 = sc.nextInt();
				max = (num1 > num2) ? num1 : num2;
				min = (num1 > num2) ? num2 : num1;

				for (int i = min; i <= max; i++) {
					if (i % 2 == 0) {
						sum = i++;
					}
				}
				evenTotal = sum;
				sum = 0;

				for (int i = min; i <= max; i++) {
					if (i % 2 == 0) {
						sum += i;
						result += (i == evenTotal) ? i + "=" : i + "+";
					}
				}
				System.out.println(result + sum);
				;
				break;
			default:
				System.out.println("Error");
				break;

			}
		}
	}
}
