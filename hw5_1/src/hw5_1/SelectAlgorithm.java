//***************************
// ���ϸ�: SelectAlgorithm
// �ۼ���: 201632023 ������
// �ۼ���: 20.04.23.
// ����: ���þ˰���� ��Ƽ�� �˰����� �̿��� �߾Ӱ� ã��
//***************************
package hw5_1;

import java.util.Scanner;

public class SelectAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_1 : 201632023 ������");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�������� �Է�: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print(n + "���� ���� �Է�: ");
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		
		int length = arr.length;
		int mid;
		if(length%2 != 0)
			mid = length/2+1;
		else
			mid = length/2;
		System.out.println("�߾Ӱ� : " + select(arr,0,length-1,mid));
	}
	
	
	private static int select(int[]arr, int p, int r, int i) {
		if(p == r) // ���Ұ� �ϳ����̸� �ٷ� ����
			return arr[p];
		
		int q = partition(arr, p, r); // �迭 ����
		
		int k = q - p + 1; // ���ؿ��Ұ� �迭���� k��° ���� �������� �ǹ���
		
		if(i < k) 
			return select(arr, p, q-1, i); // ���� ���ҷ� ������ ����
		
		else if(i == k) 		
			return arr[q]; // ���ؿ��Ұ� ã�´��϶�
		
		else 
			return select(arr, q+1, r, i-k); // ������ ���ҷ� ������ ����
			
	}
	
	
	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r]; // ���� ������ ���ذ����� ����
		int i = l-1; // i���� ���� �ε��������� ���ذ����� ���� ������ ���Ե�
		for(int j = l; j<r; j++) { // �ݴ�� i+1~j���� ���ذ����� ū ������ ��
			if(arr[j] <= pivot) {
				swap(arr, ++i, j); // ���ذ����� ���� ������ �������� ���
				}
		}
		swap(arr,i+1,r); // ���������� ���ذ��� i�� �ٷ� ���ʿ� �־��־ �迭�� ���ʿ��� ���ذ����� ������, �����ʿ��� ū���� ���� ����
		return i+1; // �� ���ذ��� �ε��� ����
	}
	
	private static void swap(int[]arr, int i, int j) { // ���ֳ��� swap�޼ҵ�
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
