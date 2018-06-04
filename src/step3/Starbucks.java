package step3;

import java.util.Scanner;

public class Starbucks {
	public static int getCost(int i, int j) {
		int result =0;
		result= i * j;
		return result;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String orderMenu = "";
		int orderPrice = 0, totalPrice = 0, cost =0, cup = 0;

		while (true) {
			System.out.printf(" 0종료\n" + " 1아메리카노3000\n" + " 2라떼3500\n" + " 3카푸치노4000\n");
			System.out.printf("무엇으로 드릴까요");
			orderMenu = scanner.next();
			switch (orderMenu) {
			case "0":
				System.out.println("종료되었습니다.");
				System.out.printf("Total Price : %d 원 입니다.\n",totalPrice);
				return;
			case "1":
				orderPrice = 3000;
				System.out.println("몇잔 드릴까요");
				cup = scanner.nextInt();
				cost = 3000*cup;
				totalPrice +=(getCost(orderPrice,cup));
				break;
			case "2":
				orderPrice = 3500;
				System.out.println("몇잔 드릴까요");
				cup = scanner.nextInt();
				totalPrice +=(getCost(orderPrice,cup));
				break;
			case "3":
				orderPrice = 4000;
				System.out.println("몇잔 드릴까요");
				cup = scanner.nextInt();
				totalPrice +=(getCost(orderPrice,cup));
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}
}

