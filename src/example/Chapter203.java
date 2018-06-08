package example;
import java.util.Scanner;
public class Chapter203 {
	public static void main(String[] args) {
		int sum=0; String result="";
		while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("첫번째 계산할 값을 입력하세요==>");
			int num1=sc.nextInt();
			System.out.println("+  -  *  /  %");
			String op=sc.next();
			System.out.println("두번째 계산할 값을 입력하세요==>");
			int num2=sc.nextInt();
				switch(op) {
				case "+": sum = num1+num2;
						result=num1+"+"+num2+"="+sum;break;
				case "-": sum = num1-num2; 
						result=num1+"-"+num2+"="+sum;break;
				case "*": sum = num1*num2;
						result=num1+"*"+num2+"="+sum;break;
				case "/": if(num1==0 || num2==0) {
								System.out.println("0으로 나누면 안됩니다.");
							} else {
								sum = num1/num2; 
								result=num1+"/"+num2+"="+sum;
							}break;
				case "%": sum = num1%num2; 
							result=num1+"%"+num2+"="+sum;break;
				default : 
					System.out.println("Error");break;
		}
		System.out.println(result);break;
		}
	}
}
