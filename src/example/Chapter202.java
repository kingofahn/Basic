package example;
import java.util.Scanner;
public class Chapter202 {
	public static void main(String[] args) {
		int sum=0; String result="";
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요==>");
		int num1=sc.nextInt();
		System.out.println("<1> 덧셋 <2> 뺄셈 <3> 곱셈 <4> 나눗셈");
		int op=sc.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요==>");
		int num2=sc.nextInt();
		
		switch(op) {
		case 1: sum = num1+num2;
				result=num1+"+"+num2+"="+sum;break;
		case 2: sum = num1-num2; 
				result=num1+"-"+num2+"="+sum;break;
		case 3: sum = num1*num2;
				result=num1+"*"+num2+"="+sum;break;
		case 4: sum = num1/num2; 
				result=num1+"/"+num2+"="+sum;break;
		}
		
		System.out.println(result);
		
		
	}
}
