package step1;
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
		System.out.print("0.종료 1.시작");
		int flag = sc.nextInt();
		switch(flag){
			case 0 :System.out.println("종료"); return;
			case 1 :System.out.println("시작"); break;  
			default : System.out.println("Wrong!!!"); continue;
		}

		System.out.print("키를 입력하세요(cm) > : ");
		double height = sc.nextDouble();
		height = height/100;
		System.out.print("몸무게를 입력하세요(kg) > : ");
		double weight = sc.nextDouble();

		double BMIResult = weight/(height*height);
		System.out.println("BMI지수는 " + BMIResult  + "입니다.");
		
		String result = "";
		if(BMIResult >= 35){
			result = "3단계 비만";
		} else if(BMIResult >= 30){
			result = "2단계 비만";
		} else if(BMIResult >= 25){
			result = "1단계 비만";
		} else if(BMIResult >= 23){
			result = "비만 전단계";
		} else if(BMIResult >= 18.5){
			result = "정상";
		} else{
			result = "저체중";
		}
		System.out.println("BMI 결과는" + result + "입니다.");

		}
	}
}
