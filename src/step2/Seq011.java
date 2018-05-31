package step2;
/**
[수열011] 1-2+3-4+5-6....-100 = -50 합계(스캐너 없음)
 * */
public class Seq011 {
	public static void main(String[] args) {
		String result = "";
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				sum = sum+i;
				if(i==100) {
					result = result + i + "=";
				} else {
					result = result + i + "+";
				}
				
			} else {
				if(i==100) {
					sum = sum-i;
					result +=  i + "=";
				} else {
					result +=  i + "-";
				}
			}
		}
		System.out.println(result+ sum);
	}
}
