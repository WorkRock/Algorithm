import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) { // ����ڿ��� �Է¹���
			System.out.print("���� �Է� : ");
			int n = scan.nextInt();
			arr[i] = n;
		}
		
		for(int i = 0; i < 3; i++) { // �������� ����
			for(int j = i+1; j < 3; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) { // ������ �ȳ����� �Բ� ���
			System.out.println(i+1 + "�� : " + arr[i]);
		}
	}

}
