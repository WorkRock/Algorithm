import java.util.Scanner; // ����ڿ��� �Է¹ޱ� ���� Scanner import

public class Problem2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner�� ����ϱ� ���� ����
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // �迭 ���� �� �ʱ�ȭ
		System.out.print("�ݾ��� �Է��Ͻÿ� : "); // ����ڿ��� �Է¹ޱ� �� ������ �ȳ���
		int n = scan.nextInt(); // ���� �Է¹ޱ�
		for(int i = 0; i < unit.length; i++) { // i�� 0���� unit�� ���̸�ŭ ���� �ݺ���
			int a = n / unit[i]; // ���� ����ϹǷ� n�� unit[i]�� ������ �̸� ����
			if(a != 0) { // ���� �������� 0�� �ƴҽ�
				System.out.println(unit[i] + "�� ¥�� :" + a); // �� �� �ִٰ� �������
				n -= unit[i]*a; // �׸��� �� ���� ����
			}
		}
	}
}
