package step1;
import java.util.Scanner;
	/*[요구사항] 평균 점수에 따라 A ~ F 까지 등급을 부여하는
	프로그램을 작성해 주시오.
	100 ~ 90 A
	89 ~ 80 B
	79 ~ 70 C
	69 ~ 60 D
	59 ~ 50 E
	49 ~ 0 F
	화면 출력은 다음과 같습니다.
	********************************
	| 이름 | 총점 | 평균 등급 |
	--------------------------------
	| 홍길동 | 270 | 90 | A |*/
public class GradeReport{
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("0.End 1.Start > ");
			switch(sc.nextInt()){
				case 0 : System.out.println("end"); return;
				case 1 : System.out.println("Start"); 
					System.out.println("이름?");	
					String name = sc.next();
					System.out.println("국어점수?");
					int kor = sc.nextInt();
					if(kor >100 || 0 > kor){
						System.out.println("Error");
						break;
					}
					System.out.println("영어점수?");
					int eng = sc.nextInt();
					if(eng >100 || 0 > eng){
						System.out.println("Error");
						break;
					}
					System.out.println("수학점수?");
					int math = sc.nextInt();
					if(math >100 || 0 > math){
						System.out.println("Error");
						break;
					}
					int avg = (kor + eng + math)/3;
					
					String hak = "";
					if(avg >= 90){
						hak = "A";
					} else if(avg>=80){
						hak = "B";
					} else if(avg>=70){
						hak = "C";
					} else if(avg>=60){
						hak = "D";
					} else if(avg>=50){
						hak = "E";
					} else {
						hak = "F";
					}
					System.out.println(" [이름] : " + name + " " + " [평균] : " + avg + " [학점] : " + hak);
					break;
			default : System.out.println("Wrong!!!"); continue;
			}
		}
	}
}