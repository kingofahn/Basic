package step1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("0.종료 1.시작");
		switch(sc.nextInt()){
			case 0 :System.out.println("종료"); return;
			case 1 :System.out.println("시작");break;
			default : System.out.println("Wrong!!!"); continue;
		}

		System.out.println("년도 입력해주세요");
		int year = sc.nextInt();
		String result ="";

		if(year%4==0 && year%100!=0 || year%400==0 ){
		result="윤년";
		} else {
		result="평년";
		}

		System.out.println(result);
		}


	}

}
