import java.util.Scanner; // ����ڿ��� �Է¹ޱ� ���� Scanner import 

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner�� ����ϱ� ���� ����
		
		System.out.print("���� : ");
		int start = scan.nextInt(); // ����ڿ��� �����ϴ� ���� �Է¹ް�
		System.out.print("���� : ");
		int end = scan.nextInt(); // ������ ���� �Է¹ް�
		System.out.print("��� : ");
		int multiple = scan.nextInt(); // ����� �Է¹��� ��
		int total = 0; // �� ���� ������ total�̶�� ���� ���� �� �ʱ�ȭ
		for(int i = start; i <= end; i++) { // start���� �����ؼ� end���� ���� �ݺ���
			if(i%multiple == 0) // ���� i�� ����� ���������� �������� 0�϶��� total�� �����ֱ�
				total += i; 
		}
		System.out.println(start + "���� " + end + "������ " + multiple +"�� ����� �� : " + total); // �� �� ���
	}

}
