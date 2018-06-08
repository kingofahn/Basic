package example;
import java.util.Scanner;
public class Chapter408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result,	a,b=0;
		System.out.println("첫 번째 계산할 값을 입력하세요 ==> ");
		a = sc.nextInt();
		System.out.println("두 번째 계산할 값을 입력하세요 ==> ");
		b = sc.nextInt();
		
		result = a + b;
		System.out.println(a + b);
		

	}

}
