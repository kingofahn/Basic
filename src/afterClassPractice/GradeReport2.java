package afterClassPractice;
import java.util.Scanner;
public class GradeReport2 {
	public static int[] input(Scanner sc) {
		int result[] = new int[3];
		System.out.println("Math score?");
		int math=sc.nextInt();
		System.out.println("Eng score?");
		int eng=sc.nextInt();
		System.out.println("Kor score?");
		int kor=sc.nextInt();
		result[0] = math;
		result[1] = eng;
		result[2] = kor;
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.end 1.start");
			switch(sc.nextInt()) {
			case 0: 
				return;
			case 1:
				int math=0, eng=0, kor=0, sum=0, avg=0;
				System.out.println("name?");
				String name = sc.next();
				int arr[] = input(sc);
				math = arr[0];
				eng = arr[1];
				kor = arr[2];
				
				sum = math + eng + kor;
				avg = sum/3;
				
				System.out.println("math : " + math );
				System.out.println("eng : " + eng );
				System.out.println("kor : " + kor );
				System.out.println("sum : " + sum );
				System.out.println("avg : " + avg );
						
				System.out.println("Name = " + name + "Sum = " + sum + "Avg = " + avg);
				break;
				
				
			default : System.out.println("Error");
				break;
			}
		}
	}
}
