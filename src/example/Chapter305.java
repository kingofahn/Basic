package example;
import java.util.Scanner;
public class Chapter305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		System.out.print("입력 진수 결정<1>10 <2>16 <3>8 : ");
		int flag = sc.nextInt();
		System.out.print("값 입력 : ");
		String num1 = sc.next();
		switch(flag){
			case 1 : result=Integer.parseInt(num1,10); break;
			case 2 : result=Integer.parseInt(num1,16);break;
			case 3 : result=Integer.parseInt(num1,8);break;
		}
		
		System.out.printf("10진수 ==> %d\n",result);
		System.out.printf("16진수 ==> %X\n",result);
		System.out.printf("18진수 ==> %o\n",result);

	}

}
