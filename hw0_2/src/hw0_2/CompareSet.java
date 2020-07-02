package hw0_2;

import java.util.Scanner;

public class CompareSet {
	public static int MAX = 0;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("hw0_2 : 201632023 ������");
		int[] arr1 = new int[100]; // ����ڿ��� �Է¹��� ���յ��� �����ϴ� �迭 arr1
		int[] arr2 = new int[100]; // ����ڿ��� �Է¹��� ���յ��� �����ϴ� �迭 arr2
		System.out.print("ù��° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� : ");
		arr1 = createArr(); // creatArr�� �ҷ��ͼ� arr1�ȿ� ���� �־���
		int total1 = MAX; // total1�� arr1�� ũ�� ����
		System.out.print("�ι�° ������ �Է��ϼ���. ���� �Է��� ��ġ���� ���� �ƴ� ������ �Է��ϼ��� : ");
		arr2 = createArr(); // creatArr�� �ҷ��ͼ� arr2�ȿ� ���� �־���
		int total2 = MAX; // total1�� arr2�� ũ�� ����
		
		// �� �迭�� ũ�Ⱑ �ٸ��� �翬�� �ٸ����̹Ƿ� �ٸ��ٰ� �˸�
		if(total1 != total2) {
			System.out.println("�� ������ ���� �ٸ��ϴ�.");
		}
		// ���� �� �迭�� ũ�Ⱑ ������ ���� ��
		else {
			arr1 = sortArr(arr1); // sortArr�� ������ �迭�� ������������ ����
			arr2 = sortArr(arr2); // ��������
			for(int i = 0; i < MAX; i++) { // ������������ ������ �迭�� �ϳ��ϳ� ��
				if(arr1[i] != arr2[i]) { // ���� �� �迭�� ���� �ٸ����� �ϳ��� ���´ٸ�
					System.out.println("�� ������ ���� �ٸ��ϴ�."); 
					System.exit(0); // ������ �ȳ��� �Ŀ� �ٷ� ���α׷� ����
				}
			}
			System.out.println("�� ������ �����ϴ�."); // �̻������ ���ٰ� �˸�.
		}
	}
	
	public static int[] createArr() { // �Ű������� ���� �迭�� return�ϴ� �Լ�
		int[] arr = new int[100]; // return�ϴ� �迭
		for(int i = 0; i < arr.length; i++) {
			int a = scan.nextInt(); // ����ڿ��� ���� �Է¹���
			if(a < 0) { // ������ �Է��ϸ� ���̻� �Է¹��� �ʵ��� ��
				MAX = i; // �������� MAX�� ���� ��� ���� ����Ǿ����� ����
				break;
			}
			arr[i] = a;
		}
		return arr;	
	}
	
	public static int[] sortArr(int[] arr) { // �迭�� �Ű������� �ް� �迭�� return�ϴ� �Լ�
		for(int i = 0; i < MAX; i++) { // ������������ ������ ����
			for(int j = i+1; j < MAX; j++) { // MAX����ŭ�� ��ü�� �����״� MAX�� ��ŭ�� ����
				if(arr[i] > arr[j]) {
					int temp = arr[i]; // hw0_1�� ���� �������� �������� ����. temp�� arr[i]�� �ִ´�.
					arr[i] = arr[j]; // arr[i]�� arr[j]���� �ִ´�
					arr[j] = temp; // arr[j]�� arr[i]���� ����Ǿ��ִ� temp���� �ִ´�. �̰� �ݺ������ν� ���ĿϷ�
				}
			}
		}
		return arr; // ���� �迭 ����
	}
}
