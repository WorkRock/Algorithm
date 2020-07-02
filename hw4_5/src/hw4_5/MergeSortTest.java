//***************************
// ���ϸ�: MergeSortTest
// �ۼ���:  201632023 ������
// �ۼ���: 2020.04.15.
// ����: ���� ������ ���ϰ� ������ ������������ �����Ͽ� ����ϴ� ����Ŭ����
//***************************
package hw4_5;

import java.util.Scanner;

public class MergeSortTest {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hw4_5 : 201632023 ������");
 
		System.out.print("�� ���� �Է� : ");
		int n1 = scan.nextInt();
		System.out.print("�ﰢ�� ���� �Է� : ");
		int n2 = scan.nextInt();

		Figure[] figureArray = new Figure[n1 + n2];

		System.out.println(n1 + "���� �� ����(������)�� �Է��ϼ���: ");

		for (int i = 0; i < n1; i++) {
			Circle c = new Circle(); // Circle() ��ü ����
			c.setRadius(scan.nextDouble());
			figureArray[i] = c;
		}

		System.out.println(n2 + "���� �ﰢ�� ����(�غ��� ����)�� �Է��ϼ���: ");

		for (int i = 0; i < n2; i++) {
			Triangle t = new Triangle(); // Triangle() ��ü ����
			t.setWidth(scan.nextDouble());
			t.setHeight(scan.nextDouble());
			figureArray[n1 + i] = t;
		}
		
		FigureSortService.mergeSort(figureArray, 0, n1+n2-1); // ��������
		
		for (int i = 0; i < figureArray.length; i++) {
			System.out.println(figureArray[i]);
		}
	}
}
