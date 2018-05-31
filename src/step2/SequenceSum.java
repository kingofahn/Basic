package step2;
/**
 기사시험문제[수열1] 1+2+3...+100 까지의 합계
 변형된 요구사항
 정수를 입력받아 두수 사이의 합을 구하는
 프로그램을 구현하시오
 출력 : 1+2+3+....=55
 * */
import java.util.Scanner;
public class SequenceSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int min=0, max=0; sum=0;
		
		switch(sc.nextInt()) {
		case 0: System.out.println("종료합니다"); return;
		case 1: 
			System.out.println("숫자1을 입력해주세요.");
			int num1 = sc.nextInt();
			System.out.println("숫자2를 입력해주세요.");
			int num2 = sc.nextInt();
			
			if(num1>num2) {
				
			} else {
				
			}
			
			break;
		default : System.out.println("Error");break;
		}
		

	}

}
