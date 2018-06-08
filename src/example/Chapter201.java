package example;
import java.util.Scanner;
public class Chapter201 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫 번째 계산할 값을 입력하세요 ==>");
	int a = sc.nextInt();
	System.out.println("두 번째 계산할 값을 입력하세요 ==>");
	int b = sc.nextInt();
	System.out.println("세 번째 계산할 값을 입력하세요 ==>");
	int c = sc.nextInt();
	System.out.println("네 번째 계산할 값을 입력하세요 ==>");
	int d = sc.nextInt();
	System.out.println(a+"+"+b+"+"+c+"+"+d+"=" + (a+b+c+d));

	}
}
