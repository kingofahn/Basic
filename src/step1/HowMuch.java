package step1;
import java.util.Scanner;
/**
"얼마에요?
100
100원 입니다.
몇개 드릴까요?
5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
int dc = total / 10;
total = total - dc;
그럼 450원만 주세요"
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