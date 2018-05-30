package step1;
import java.util.Scanner;
/**
 To. 개발자님
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
 * */

public class CheckGender {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.시작");
			switch(sc.nextInt()){
				case 0 : System.out.println("종료"); return;
				case 1 : System.out.println("시작"); 
				System.out.println("주민등록번호를 입력하세요.");
				String idNum = sc.next();
				
				char idGen = idNum.charAt(7);
				String GenFin ="";

				switch(idGen){
					case '1': case '3': GenFin="남자";break;
					case '2': case '4': GenFin="여자";break;
					case '5': case '6': GenFin="외국인";break;
					default : GenFin="다시 입력하세요.";break;
				}
				System.out.println(GenFin);
				break;
				default : System.out.println("Wrong!!!"); break;
			}
		}
	}
}
