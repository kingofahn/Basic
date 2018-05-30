package step1;
import java.util.Scanner;
/**
 국어 영어 수학점수 받아서 학점주고
 평균 구하는 문제
 a 90이상
 b 80이상
 c 70이상
 d 60이상
 e 50이상
 f 나머지
  * */
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