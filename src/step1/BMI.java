package step1;
import java.util.Scanner;
/**
BMI = 몸무게 / 키² 로서, 
여기서 몸무게는 kg, 키는 m 단위이다. 
예를 들자면, 
몸무게 55kg에 키 1.68m인 사람의 BMI는 
55kg/(1.68m)^2 = 19.4이다.
2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 
18.5 미만이면 저체중, 
18.5∼23은 정상, 
23~25이면 '비만 전단계'[5], 
25∼30은 '1단계 비만', 
30∼35는 '2단계 비만' , 
35 이상이면 '3단계 비만'으로 구분한다.
 * */
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("0.종료 1.시작");
		switch(sc.nextInt()){
			case 0 :System.out.println("종료"); return;
			case 1 :System.out.println("시작");
				String result = "";
				System.out.print("키를 입력하세요(cm) > : ");
				double height = sc.nextDouble();
				height = height/100;
				System.out.print("몸무게를 입력하세요(kg) > : ");
				double weight = sc.nextDouble();
				double BMIResult = weight/(height*height);
				System.out.println("BMI지수는 " + BMIResult  + "입니다.");
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
				break;  
			default : System.out.println("Wrong!!!"); continue;
			
			}
		}
	}
}
