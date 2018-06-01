package afterClassPractice;

/**
입력 받은 것을 2가지 값의 홀수와 짝수의 합을 구하기 [메소드분할]
* */
import java.util.Scanner;

	public class Seq012Practice {
		public static int[] input(Scanner sc) {
			int[] result = new int[2];
			int max = 0, min = 0;
	
			System.out.println("Insert number1");
			int num1 = sc.nextInt();
			System.out.println("Insert number2");
			int num2 = sc.nextInt();
			max = (num1 > num2) ? num1 : num2;
			min = (num1 > num2) ? num2 : num1;
			
			result[0] = max;
			result[1] =min;
	
			return result;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Odd 2.Even");
			switch (sc.nextInt()) {
			case 1:
				int min = 0, max = 0, sum = 0, oddTotal = 0;
				String result = "";
				
				int[] arr = input(sc);
				max = arr[0];
				min = arr[1];

				for (int i = min; i <= max; i++) {
					if (i % 2 == 1) {
						sum = i++;
					}
				}
				oddTotal = sum;
				sum = 0;

				for (int i = min; i <= max; i++) {
					if (i % 2 == 1) {
						sum += i;
						result += (i == oddTotal) ? i + "=" : i + "+";
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				max = 0; min = 0; sum = 0; 
				int evenTotal = 0;
				result = "";
				int[] arr1 = input(sc);

				for (int i = min; i <= max; i++) {
					if (i % 2 == 1) {
						sum = i++;
					}
				}
				oddTotal = sum;
				sum = 0;

				for (int i = min; i <= max; i++) {
					if (i % 2 == 1) {
						sum += i;
						result += (i == oddTotal) ? i + "=" : i + "+";
					}
				}
				System.out.println(result + sum);
				break;
				
			default:
				System.out.println("Error");
				break;

			}
		}
	}
}
