package hw4_6;
//***************************
// ���ϸ�: FigureSortService
// �ۼ���:  201632023 ������
// �ۼ���: 2020.04.17.
// ����: �� ������ �̿��� ������������ �����ϴ� Ŭ����
//***************************


public class FigureSortService {
	public static void maxHeapify(Figure[] figureArray, int length, int i) {
	    int parent = i; // �θ� �ε�����
	    int leftChild = i * 2 + 1; // ���� �ڽ� �� 
	    int rightChild = i * 2 + 2; // ������ �ڽ� ��
	    
	    if (leftChild < length && figureArray[parent].getArea() < figureArray[leftChild].getArea()) { // ���� �ڽ� ���� �θ� ������ Ŭ ���
	        parent = leftChild; // �θ� �ε����� ������ �ڽ� �ε����� �Ҵ���
	    }
	 
	    if (rightChild < length && (figureArray[parent].getArea() < figureArray[rightChild].getArea())) { // �������� �ڽ� ���� �θ��� ������ Ŭ ���
	        parent = rightChild; // �θ� �ε����� �������� �ڽ� �ε����� �Ҵ���
	    }
	 
	    if (i != parent) { // �θ� �ε����� ������ �������
	        swap(figureArray, parent, i); // ��ġ ���� ��
	        maxHeapify(figureArray, length, parent); // ���
	    }
	}
	 
	public static void heapSort(Figure[] figureArray) {
	    int length = figureArray.length - 1; // �ε��� ���̱� ������ -1
	 
	    for (int i = length / 2; i >= 0; i--) { // �ִ� ������ �������
	    	maxHeapify(figureArray, length, i);
	    }
	
	    for (int i = length; i > 0; i--) { // ���� �ϳ� �������� ������ ����
	        swap(figureArray, 0, i);
	        maxHeapify(figureArray, i, 0);
	    }
	}
	 
	public static void swap(Figure[] figureArray, int i, int k) {
	    Figure temp = figureArray[i];
	    figureArray[i] = figureArray[k];
	    figureArray[k] = temp;
	}
}
