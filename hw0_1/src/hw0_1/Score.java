package hw0_1;

import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		System.out.println("hw0_1 : 201632023 ������");
		Scanner scan = new Scanner(System.in);
		int a = 0; // ����ڿ��� �Է¹��� ���� a ���� �� �ʱ�ȭ.
		int[] arr = {9000, 40, 1, -15, 50, 200, 315, 800, -30, 12345}; // �̸� ���õ� ���� �� �迭 arr
		
		// �迭�� �������� ����
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i]; // ���� temp�� arr[i]���� ������
					arr[i] = arr[j]; // arr[i]�� arr[j]���� �ְ�
					arr[j] = temp; // arr[j]�� arr[i]���� ����� temp���� �������� �� �������� ��ȯ �Ϸ�
				}
			}
		}
		
		// ����ڰ� int�� ���� ����ų� �������� �Է����� �ʾ����� ���α׷��� �����ϴ� �ý���
		try {
			System.out.println("���� ���߱� ���α׷��Դϴ�.");
			System.out.print("�ϳ��� �������� �Է��ϼ��� : ");
			a = scan.nextInt();
			}catch(Exception e) { // ����ڰ� �Ҽ��� ���ڿ�, -2,147,483,648 ~ 2,147,438,647 ������ ���ڸ� �Է����� �ʾ����� ����ó��
				System.out.println("������ ����ų� �������� �Է����� �ʾ� ���α׷��� �����մϴ�.");
				System.exit(0); // �ٷ� ���α׷� ����
			}
		
		// ������ ������ ���� score
		int score = 0;
		
		// ���� ���
		for(int i = 1; i < arr.length; i++) {
			int x = arr[i-1];
			int y = arr[i];
			if(a > x && a < y) {
				int set1 = a - x; // a�� x�� y ������ �����̹Ƿ� a�� x���� ������ ũ��
				int set2 = y - a; // ���� ���� ���� ����						
				if(set1 < set2) {
					score = 100 - set1;
				}
				else
					score = 100 - set2;	
				}
			}
		
		// 0�� �̸��Ͻ� �׳� 0��
		if(score < 0)
			score = 0;
		System.out.println("���� = " + score);	

	}

}