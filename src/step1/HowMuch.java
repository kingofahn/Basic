package step1;
import java.util.Scanner;
/**
가격과 갯수를 입력 받음
비싸다고 생각하는 소비자에게 원하는 할인가격이 10% 미만이면
 할인가격을 알려주고
 10%이상이면 안판다.  
 * */
public class HowMuch {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.End 1.Start");
			switch(sc.nextInt()) {
				case 0 : System.out.println("종료합니다.") ; return;
				case 1:
					System.out.println("얼마에요?");
					int price = sc.nextInt();
					System.out.println("몇개 드릴까요");
					int unit = sc.nextInt();
					System.out.println(unit +"개 주세요");
					System.out.println("총 금액은 " + price*unit + " 원 입니다.");
					System.out.println("비싸요 깍아주세요!!!");
					System.out.println("몇 퍼센트 dc 할까요?");
					int dc = sc.nextInt();
					String result = price*unit*(100-dc)/100+"원" ;
					if(dc>=10){
						result ="안팔아요!!!";
					} 
					System.out.println(result);	
					break;
				default : ; continue;
			}
		}
	}
}