package step3;
import javax.swing.JOptionPane;

public class Starbucks3 {
	public static int getCost(int i, int j) {
		int result =0;
		result= i * j;
		return result;
	}
	public static void main(String[] args) {
		int totalPrice = 0, cost =0, orderMenu=0;
		String cup="";
		int orderPrice []= {3000, 3500, 4000};
		String menu []= {" 0:종료\n", 
				"1: 아메리카노:" + orderPrice[0]+"\n", 
				"2: 라떼:" +orderPrice[1] +"\n", 
				"3: 카푸치노" +orderPrice[2]+"\n"};
		while (true) {
			String option =JOptionPane.showInputDialog("무엇을 주문하시겠습니까?\n"+ menu[1] + menu[2] + menu[3] + menu[0]);
			switch (Integer.parseInt(option)) {
			case 0 :
				JOptionPane.showMessageDialog(null,"Total Price :"+ totalPrice + " 원 입니다.");
				return;
			case 1:
				totalPrice +=(getCost(orderPrice[0],Integer.parseInt(cup = JOptionPane.showInputDialog("몇잔 드릴까요"))));break;
			case 2:
				totalPrice +=(getCost(orderPrice[1],Integer.parseInt(JOptionPane.showInputDialog("몇잔 드릴까요"))));break;
			case 3:
				totalPrice +=(getCost(orderPrice[2],Integer.parseInt(cup = JOptionPane.showInputDialog("몇잔 드릴까요"))));break;
			default:
				JOptionPane.showMessageDialog(null,"Error");
				break;
			}
		}
	}
}

