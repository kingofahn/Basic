package step2;
/**
항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음)
1+2+4+7+11+16+22+...순서로 나열되는
수열의 20번째 항까지의 합계
 * */
public class Seq013 {
	public static void main(String[] args) {
		int sum=1, totalSum=0;
		String result = ""; 
		for(int i=0; i<20; i++) {
			sum+=i;
			totalSum += sum;
			if(i==19) {
				result += sum + "=";
			} else {
				result += sum + "+";	
			}
			
		}
		System.out.println(result + totalSum);
	}
}
