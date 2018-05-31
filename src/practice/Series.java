package practice;
import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료  1.시작");
			int sum=0;
			String result = "";
			switch(sc.nextInt()){
			case 0 : System.out.println("종료되었습니다.");return;
			case 1 :  
				System.out.println("숫자1를 입력해주세요");
				int num1 = sc.nextInt();
				System.out.println("숫자2를 입력해주세요");
				int num2 = sc.nextInt();
				int min=0, max=0;
				
				if(num1>num2) {
					max=num1;
					min=num2;
				} else {
					max=num2;
					min=num1;
				}
				for(int i=min; i<=max; i++) {
					sum += i;
					if(i==max) {
						result += i + "=";
					} else {
						result += i + "+";
					}
				}  
				System.out.println(result + sum); break;
			default : System.out.println("잘못 누르셨습니다."); break;
			}
			
		}
	}
}
