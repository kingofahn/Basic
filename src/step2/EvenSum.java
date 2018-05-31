package step2;
/**
기사시험문제[수열1] 1+2+3...+100 까지의 합계
변형된 요구사항
정수를 입력받아 두수 사이의 합을 구하는
프로그램을 구현하시오
출력 : 1+2+3+....=55
* */
import java.util.Scanner;
public class EvenSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			String result = "";
			System.out.println("0. end   1. start");
			switch(sc.nextInt()) {
				case 0 : System.out.println("종료합니다"); return;
				case 1 : 
					int sum=0, min = 0, max = 0;
					System.out.println("숫자를 입력해주세요");
					int num1 = sc.nextInt();
					System.out.println("숫자를 입력해주세요");
					int num2 = sc.nextInt();
					
						if(num1>num2) {
							max = num1;
							min = num2;
						} else {
							max = num2;
							min = num1;
						}
						
					for(int i=min; i<=max; i++) {
						sum+=i;
						if(i==max) {
							result += i +"=";
						} else {
							result += i +"+";
						}
					}
					System.out.println(result + sum); break;
				default :System.out.print("error"); break;
			}
		}
	}
}