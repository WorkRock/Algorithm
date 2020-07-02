//***************************
// ���ϸ�: FigureSortService
// �ۼ���:  201632023 ������
// �ۼ���: 2020.04.15.
// ����: ���������� �����ϴ� Ŭ����
//***************************
package hw4_5;

public class FigureSortService {
	public static void mergeSort(Figure[] figureArray, int left, int right) { // figure�� �迭, ���� ������ ������ ������ �Ű������� �޴� �޼ҵ�
		if(left < right){
			int mid = (left + right)/2;
			mergeSort(figureArray, left, mid); // �ٽ� �ҷ����� ��͹�� - figureArray�� ���� ��� ����
			mergeSort(figureArray, mid+1, right); // �ٽ� �ҷ����� ��͹�� - figureArray�� ������ ��� ����
			merge(figureArray, left, right); // �� �� �ٽ� ����
		}		
	}
	
	 // ���� �迭, ������ ���� �ε���, ���� �ε����� �Ű������� �ް� ���ҵ� ����� �����ϴ� merge�޼ҵ�
	public static void merge(Figure[] figureArray, int left, int right) {
		int i = left; // ���� ���ʰ��� ������ �ε���
		int mid = (left + right)/2; // �߰����� ������ �ε���
		int j = mid + 1; // �߰��� �ٷ� ���� �����ϴ� ���ʰ��� �����ϴ� �ε���
		int k = left; // ��� �迭�� �ε�����
		Figure[] tempFigureArray = new Figure[figureArray.length]; // ��� �迭
		
		while(i <= mid && j <= right) {
			if(figureArray[i].getArea() < figureArray[j].getArea()) { // ������ ��
				tempFigureArray[k] = figureArray[i]; // ��� �迭�� ���� �����س���
				i++; // ���ʰ� �� ĭ ����
			}
			else {
				tempFigureArray[k] = figureArray[j];
				j++; // �߰�+1 ��ĭ ����
			}
			k++; // ��� �迭�� �ε����� 1 ����
		}
		
		if(i > mid) { // ������ ����� ���� ���� �Ǿ��� ���
			for(int x = j; x <= right; x++) { // ���� ����� ���ʴ�� �־���
				tempFigureArray[k] = figureArray[x];
				k++;
			}
		}
		else { // �ݴ�� ���� ����� ���� ���� �Ǿ��� ���
			for(int x = i; x <= mid; x++) { // ������ ����� ���ʴ�� �־���
				tempFigureArray[k] = figureArray[x];
				k++;
			}
		}
		
		for(int x = left; x <= right; x++) { // ������ �迭�� ��� �迭���� �־��ָ� ����
			figureArray[x] = tempFigureArray[x];
		}
	}
}
