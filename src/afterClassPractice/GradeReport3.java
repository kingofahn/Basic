package afterClassPractice;

import java.util.Scanner;

public class GradeReport3 {
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
		switch (Integer.parseInt(params[1]) / 3) {
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		String[] params = new String[10]; // 점수 임시저장
		Scanner scan = new Scanner(System.in); // 스캐너
		System.out.println("이름?");
		String name = scan.next();
		String[] subjects = { "국어", "영어", "수학" }; // for문 돌리기 위해 과목명 배열저장
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + "점수입력"); // 배열사용 과목명 할당
			int temp = scan.nextInt();// 입력갑 인트화
			if (input(temp)) {
				params[i] = String.valueOf(temp);
			} else {
				i--;
			}
		}
		String[] arr = getGrade(getTotal(params));
		System.out.printf("****************************\n");
		System.out.printf("| 이름  |  총점     |  평균    | 등급  |\n");
		System.out.printf("----------------------------\n");
		System.out.printf("| %s | %s | %s | %s |\n", name, arr[0], arr[1], arr[2]);
		System.out.print("****************************");
	}

}
