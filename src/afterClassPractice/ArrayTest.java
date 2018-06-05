package afterClassPractice;
import javax.swing.JOptionPane; 
public class ArrayTest {
	public static boolean getScoreCheck(int kor, int eng, int math) {
		boolean result =(kor>=0&&kor<=100)&&(eng>=0&&eng<=100)&&(math>=0&&math<=100)?true:false;
		return result;
	}
	
	public static int getTotal(int kor, int eng, int math) {
		int result=kor+eng+math;
		return result;
	} 
	
	public static int getAverage(int param) {
		int result = param/3;
		return result;
	}
	
	public static String getGrade(int param) {
		String result = "";
		
		switch(param/10) {
		case 10 : case 9 : result ="A" ;break;
		case 8 :  result = "B";break;
		case 7 :  result = "C";break;
		case 6 :  result = "D";break;
		case 5 :  result = "E";break;
		default :  result = "F";break;
		}
		return result;
	}
	
	
	public static int[] getRank(int[] param) {
		int[] result =  new int[3];
		int a=param[0], b=param[1], c=param[2];
		
		if(a>b&&a>c) {
			if(b>c){
				result[0]=1;
				result[1]=2;
				result[2]=3;
			} else {
				result[0]=1;
				result[1]=3;
				result[2]=2;
				
			}
		} else if(b>c) {
			if(c>a) {
				result[0]=3;
				result[1]=1;
				result[2]=2;
			} else {
				result[0]=2;
				result[1]=1;
				result[2]=3;
			}
			
		} else if(b>a) {
			if(a>c) {
				result[0]=2;
				result[1]=3;
				result[2]=1;
			} else {
				result[0]=3;
				result[1]=2;
				result[2]=1;
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] student = new String[4];
		int kor=0, eng=0, math=0, total=0, avg=0, count=0;
		String grade="", result="";
		String students[] = new String[10];
		int rank[] = new int[3];
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료 1.성적입력 2.성적출력")) {
		case "0": JOptionPane.showMessageDialog(null,"종료되었습니다");return; 
		case "1":
			student = JOptionPane.showInputDialog("이름/kor/eng/math").split("/");
			if(getScoreCheck(kor,eng,math)==true) {
				kor=Integer.parseInt(student[1]);
				eng=Integer.parseInt(student[2]);
				math=Integer.parseInt(student[3]);
				total = getTotal(kor,eng,math);
				avg = getAverage(total);
				grade = getGrade(avg);
				students[count]=student[0]+"/"+student[1]+"/"+student[2]+"/"+student[3]+ "/"+ total +"/"+ avg +"/"+ grade +"\n";
				count++;
				
			} else {
				JOptionPane.showMessageDialog(null,"Score Error");
			}
			break;
		case "2":
			for (int i = 0; i < count; i++) {
				result += student[i] + rank[i]+ "\n";
			}
			JOptionPane.showMessageDialog(null,"name/kor/eng/math/total/avg/grade/rank\n"+result);	
			return;
		}
		}
	}
}