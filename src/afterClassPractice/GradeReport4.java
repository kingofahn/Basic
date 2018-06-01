package afterClassPractice;

import java.util.Scanner;

public class GradeReport4 {
	public static boolean input(int param) {
		return (param >= 0 && param <= 100);
	}
	
	public static String[] getTotal(String[] params) {
		String[] result = new String[10];
		result[0] = String
				.valueOf(Integer.parseInt(params[0]) + Integer.parseInt(params[1]) + Integer.parseInt(params[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		return result;
	}

	
	
	public static String[] getGrade(String[] params) {
		String[] result = new String[10];
		
		result[0] = params[0];
		result[1] = params[1];
		switch((Integer.parseInt(params[1])/3)) {
		case 9 : result[2]="A" ; break;
		case 8 : result[2]="B" ; break;
		case 7 : result[2]="C" ; break;
		case 6 : result[2]="D" ; break;
		case 5 : result[2]="E" ; break;
		default : result[2]="F" ; break;
		}
		
		return result;
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("name?");
			String name = sc.next();
			String[] params = new String[10]; 
			String[] subject = { "kor", "eng", "math" };
			int[] score = new int[10];
			for (int i = 0; i < subject.length; i++) {
				System.out.println(subject[i] + "score?");
				int temp = sc.nextInt();
				if (input(temp)) {
					params[i] = String.valueOf(temp);
				} else {
					i--;
				}
			}
			String[] arr = getGrade(getTotal(params));
			
			System.out.printf(" name : " +  "%s" + " sum " + "%s" + " avg : " + "%s" + " grade " + "%s", name, arr[0], arr[1], arr[2]);
	}
}
