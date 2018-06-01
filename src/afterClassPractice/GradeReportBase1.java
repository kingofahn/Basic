package afterClassPractice;
import java.util.Scanner;
public class GradeReportBase1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.printf("0.End 1.Start\n");
			switch(sc.nextInt()){
			case 0 : System.out.println("End"); 
				break;
			case 1 : 
				System.out.println("name?");
				String name = sc.next(); 
				int sum=0, avg=0;
				String grade ="";
				
				System.out.println("math score?");
				int math=sc.nextInt();
				System.out.println("eng score?");
				int eng=sc.nextInt();
				System.out.println("kor score?");
				int kor=sc.nextInt();
				
			
				sum = math + eng + kor;
				avg = sum/3;
				
				
			    switch(avg/10){
	            case 9: grade="A"; break;
	            case 8: grade="B"; break;
	            case 7: grade="C"; break;
	            case 6: grade="D"; break;
	            case 5: grade="E"; break;
	            default : grade="F"; break;
			    }
				System.out.printf("************************************\n");
				System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
				System.out.printf("-------------------------------------\n");
				System.out.printf("| %s | %s | %s | %s |\n",name,sum,avg,grade);
				System.out.print("************************************\n");
				
				break;
			default : System.out.println("Error");return;
			
			}
		}
	}
}
