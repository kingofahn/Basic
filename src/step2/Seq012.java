package step2;
/**
입력 받은 것을 2가지 값의 홀수와 짝수의 합을 구하기
* */
import java.util.Scanner;
public class Seq012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1:Odd sum 2:Even sum");
			String result = "";
			switch (sc.nextInt()) {
				case 1:
					int min = 0, max = 0, sum = 0, count=0, totalCount=0;
					System.out.print("숫자1을 입력해주세요." + "\n");
					int num1 = sc.nextInt();
					System.out.print("숫자2를 입력해주세요." + "\n");
					int num2 = sc.nextInt();
						max=(num1>num2)?num1:num2;
						min=(num1>num2)?num2:num1;
						
							for(int i=min; i<=max; i++) {
								if(i%2!=0) {
									count++;
								}
							}
							
						totalCount= count;
						count = 0;
						for(int i=min; i<=max; i++) {
							if(i%2!=0) {
								count++;
								sum+=i;
								result += (count==totalCount)?  i+"=" : i+"+";
							}
						}
						System.out.println(result + sum); break;
	
				case 2:
					int min1 = 0, max1 = 0, sum1 = 0, count1=0, totalCount1=0;
					String result1="";
					System.out.print("숫자1을 입력해주세요." + "\n");
						int num3 = sc.nextInt();
					System.out.print("숫자2를 입력해주세요." + "\n");
						int num4 = sc.nextInt();
						max1=(num3>num4)?num3:num4;
						min1=(num3>num4)?num4:num3;
						
							for(int i=min1; i<=max1; i++) {
								if(i%2!=0) {
									count1++;
								}
							}
							
						totalCount1= count1; 
						count1 = 0;
						
						for(int i=min1; i<=max1; i++) {
							if(i%2!=0) {
								count1++;
								sum1+=i;
								result1 += (count1==totalCount1)?  i+"=" : i+"+";
							}
						}
						System.out.println(result1 + sum1); break;
			}
		}
	}
}