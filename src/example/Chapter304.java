package example;
import java.util.Scanner;
public class Chapter304 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==> ");
		int num1 = sc.nextInt();
		System.out.printf("10진수 ==> %d \n", num1);
		System.out.printf("16진수 ==> %x \n", num1);
		System.out.printf("8진수 ==> %o \n", num1);
	}

}
