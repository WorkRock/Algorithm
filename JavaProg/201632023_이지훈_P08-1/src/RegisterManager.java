import java.util.ArrayList;
import java.util.Scanner;

public class RegisterManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Register> register = new ArrayList<Register>();
		Register a = regist(register);
		register.add(a);
	}
	
	static Register regist(ArrayList<Register> register) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세대주 이름 : ");
		String name = scan.next();
		System.out.print("\n부양가족 수 : ");
		int family = scan.nextInt();
		String id = computeRegID(register);
		Register regis = new Register(name, id, family, 0);
		return regis;
	}
	
	static String computeRegID(ArrayList<Register> register) {
		
		return null;
	}
	
	int computeFund(int money) {
		return money;
	}
	
	void showAll() {
		
	}
}
