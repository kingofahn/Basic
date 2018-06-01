package afterClassPractice;
//짝수에서 에러남 ..아직 못잡음
import java.util.Scanner;
public class Seq012Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.odd 2.even");
			switch (sc.nextInt()) {
			case 1:
				int max = 0, min = 0, sum = 0, oddTotal = 0;
				String result = "";
				System.out.println("insert no1");
				int num1 = sc.nextInt();
				System.out.println("insert no2");
				int num2 = sc.nextInt();

				max = num1 > num2 ? num1 : num2;
				min = num1 > num2 ? num2 : num1;

				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						sum = i++;  
					}
				}
				
				oddTotal = sum;
				sum=0;

				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						sum += i;
						result += (i == oddTotal) ? i+ "=" : i+ "+";
					}
				}
				System.out.println(result + sum);
				break;

			case 2:
				int max1 = 0, min1 = 0, sum1 = 0, evenTotal = 0;
				String result1 = "";
				System.out.println("insert no1");
				int num3 = sc.nextInt();
				System.out.println("insert no2");
				int num4 = sc.nextInt();

				max1 = num3 > num4 ? num3 : num4;
				min1 = num3 > num4 ? num3 : num4;

				for (int i = min1; i <= max1; i++) {
					if (i % 2 == 0) {
						sum1 = i++;
					}
				}
				evenTotal = sum1;
				sum = 0;
				System.out.println(evenTotal);

				for (int i = min1; i <= max1; i++) {
					if (i % 2 == 0) {
						sum1 += i;
						result1 += (i == evenTotal) ? i+ "=" : i+ "+";
					}
				}
				System.out.println("sum1 " + sum1);
				System.out.println("result1 " + result1);
				System.out.println("sum1 +" + "result1 " + result1 + sum1);
				break;

			default:System.out.println("Error");break;
			}
		}
	}
}
