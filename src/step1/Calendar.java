package step1;
import java.util.Scanner;
/**
 월을 입력해서 해당 월의 마지막 날을 알려주는 로직.      
 예를 들면, 3월이면 말일이 3월31일입니다.        
 9월이면 말일이 9월30일입니다.라고 알려줌.        
 단 2월은 2월28일을 말일로 해서 2월28일입니다. 라고 함.
 * */
public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){

			System.out.println("0.종료 1.시작");
			switch(sc.nextInt()){
				case 0 : System.out.println("종료"); return;
				case 1 : System.out.println("시작");
				String endDay = "";
				System.out.println("월을 입력해주세요");
				switch(sc.nextInt()){
					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : endDay ="31"; break;
					case 2 : endDay ="28"; break;
					case 4 : case 6 : case 9 : case 11: endDay ="30"; break;
					default : endDay = "다시 입력해주세요";break;
					}
				
				
						if(endDay.equals("다시 입력해주세요")){
							System.out.println(endDay);
						} else {
							System.out.println(endDay + "일 까지 있습니다.");	
						}
					break;
				default : System.out.println("Wrong!!!"); break;
			}
		}
	}
}
