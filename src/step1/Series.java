package step1;
import java.util.Scanner;
/**
 두 수를 입력 받아서 두 수 사이의 합을 구하는 문제 1+2+3........=합계가 출력
 * */
public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.종료 1.시작");
			int sum=0;
			String result = "";
			switch(sc.nextInt()){
				case 0 : System.out.println("종료"); return;
				case 1 : 
					System.out.println("첫번째 숫자를 입력해주세요");
					int input1 = sc.nextInt();
					System.out.println("첫번째 숫자를 입력해주세요");
					int input2 = sc.nextInt();
					int max=0, min=0;
					
					if(input1>input2){
						max = input1;
						min = input2;
					} else {
						max = input2;
						min = input1;
					}

					for(int i=min; i<=max; i++){
						sum += i;
						if(i==max){
							result +=  i + "=";
						}else{
							result +=  i + "+";
						}
					} 
					System.out.println(result+sum); break;	
				default : System.out.println("Error");break;
			}	
				
		}
	}
}
