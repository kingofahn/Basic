package example;
import java.util.Scanner;
public class Chapter307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 ==> ");
		String input = sc.next();
		System.out.println("input.length() : "+input.length());

		for(int i=input.length()-1; i>=0; i--) {
			System.out.printf("%c", input.charAt(i));
		}
	}
}
