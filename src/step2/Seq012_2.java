package step2;

/**
입력 받은 것을 2가지 값의 홀수와 짝수의 합을 구하기 [메소드분할]
* */
import java.util.Scanner;

public class Seq012_2 {
	public static int[] input(Scanner sc) {
		int[] result = new int[2];
		int start = 0, end = 0;

		System.out.print("숫자1을 입력해주세요." + "\n");
		int num1 = sc.nextInt();

		System.out.print("숫자2를 입력해주세요." + "\n");
		int num2 = sc.nextInt();

		end = (num1 > num2) ? num1 : num2;
		start = (num1 > num2) ? num2 : num1;

		result[0] = start;
		result[1] = end;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1:Odd sum 2:Even sum");
			String result = "";
			switch (sc.nextInt()) {
			case 0:
				return;

			case 1:
				int start = 0, end = 0, count = 0, totalCount = 0, sum = 0;
				int[] arr = input(sc);
				start =  arr[0];
				end =  arr[1];
								
				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count = i++;
					}
				}
				totalCount = count;
				count = 0;

				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						sum += i;
						if (i == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
					}
				}
				System.out.println("RESULT: " + result + sum);
				break;

			case 2:
				start = 0; end = 0; count = 0; totalCount = 0; sum = 0;
				int[] arr1 = input(sc);
				start =  arr1[0];
				end =  arr1[1];
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						i++;
						end = i++;
					}
				}
				System.out.println("end : " + end);
				totalCount = end;
				end = 0;
				System.out.println("totalCount : " + totalCount);
				for (int i = start; i <= end; i++) {
					if (i%2==0) {
						sum += i;
						if (i == totalCount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
					}
				}
				System.out.println("RESULT: " + result + "sum" + sum);
				break;

			default:
				System.out.println("Error");
				break;
			}
		}
	}
}