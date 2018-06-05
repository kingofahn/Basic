package step3;

import javax.swing.JOptionPane;

public class ArrayTest {
	public static int getTotal(String[] param) {
		int kor = Integer.parseInt(param[1]);
		int eng = Integer.parseInt(param[2]);
		int math = Integer.parseInt(param[3]);
		int result = kor + eng + math;
		return result;
	}

	public static int getAvg(int param) {
		int result = param / 3;
		return result;
	}

	public static String getGrade(int param) {
		String result = "";
		switch (param / 10) {
		case 10:
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		case 5:
			result = "E";
			break;
		default:
			result = "F";
			break;
		}
		return result;
	}

	public static boolean getScoreCheck(String[] param) {
		int[] arr = { Integer.parseInt(param[1]), Integer.parseInt(param[2]), Integer.parseInt(param[3]) };
		boolean result;
		result = (arr[0] >= 0 && arr[0] <= 100) && (arr[1] >= 0 && arr[1] <= 100) && (arr[2] >= 0 && arr[2] <= 100)
				? true
				: false;
		return result;
	}
	
	public static int[] getRank(String[] param){
		int result[] =new int[3];
		String temp[] = new String[3];
		temp = param[0].split("\\|");
		int a = Integer.parseInt(temp[4]);
		temp = param[1].split("\\|");
		int b = Integer.parseInt(temp[4]);
		temp = param[2].split("\\|");
		int c = Integer.parseInt(temp[4]);
		if (a > b & a > c) {
			if (b > c) {
				result[0] = 1;
				result[1] = 2;
				result[2] = 3;
			} else {
				result[0] = 1;
				result[1] = 3;
				result[2] = 2;
			}
		} else if (b > c) {
			if (a > c) {
				result[0] = 2;
				result[1] = 1;
				result[2] = 3;
			} else {
				result[0] = 3;
				result[1] = 1;
				result[2] = 2;
			}
		} else if (c > a) {
			if (a > b) {
				result[0] = 2;
				result[1] = 3;
				result[2] = 1;
			} else {
				result[0] = 3;
				result[1] = 2;
				result[2] = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int sum = 0, avg = 0, count = 0;
		boolean check = true;
		String result = "";
		String grade = "";
		String[] student = new String[3];
		String[] ranking = new String[3];
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료  1.성적입력 2.전체보기 ");
			switch (menu) {
			case "0":
				return;
			case "1":
				String score = JOptionPane.showInputDialog("이름/국어/영어/수학");
				String[] arr = score.split("/");
				if (getScoreCheck(arr) == true) {
					sum = getTotal(arr);
					avg = getAvg(sum);
					grade = getGrade(avg);
					student[count] = "|" + arr[0]+"|" + arr[1] + "|" + arr[2] + "|" + arr[3] + "|" + sum + "|" + avg + "|" + grade
							+ "|";
					count++;
				} else {
					JOptionPane.showMessageDialog(null, "숫자 입력 오류");
				}
				break;
			case "2":
				int rank [] = new int[3];
				rank = getRank(student);
				for (int i = 0; i < count; i++) {
					result += student[i] + rank[i]+ "\n";
				}
				JOptionPane.showMessageDialog(null, " | 이  름 |국어 | 영어 | 수학 | 총점 | 평균 | 학점 | 순위 | \n" + result);
				break;
			default:
				break;

			}
		}
	}
}
