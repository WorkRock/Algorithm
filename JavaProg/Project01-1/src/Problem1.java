import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ��� : ");
		int a = scan.nextInt();
		int x = a % 3600;
		int hour = a / 3600;
		int minute = x / 60;
		int second = x % 60;
		
		
		System.out.println(a + "��: " + hour + "�ð� " +  minute + "�� " + second + "��");
	}

}
