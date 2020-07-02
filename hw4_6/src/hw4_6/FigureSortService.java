package hw4_6;
//***************************
// 파일명: FigureSortService
// 작성자:  201632023 이지훈
// 작성일: 2020.04.17.
// 내용: 힙 정렬을 이용해 오름차순으로 정렬하는 클래스
//***************************


public class FigureSortService {
	public static void maxHeapify(Figure[] figureArray, int length, int i) {
	    int parent = i; // 부모 인덱스값
	    int leftChild = i * 2 + 1; // 왼쪽 자식 값 
	    int rightChild = i * 2 + 2; // 오른쪽 자식 값
	    
	    if (leftChild < length && figureArray[parent].getArea() < figureArray[leftChild].getArea()) { // 왼쪽 자식 값이 부모 값보다 클 경우
	        parent = leftChild; // 부모 인덱스에 왼쪽의 자식 인덱스를 할당함
	    }
	 
	    if (rightChild < length && (figureArray[parent].getArea() < figureArray[rightChild].getArea())) { // 오른쪽의 자식 값이 부모의 값보다 클 경우
	        parent = rightChild; // 부모 인덱스에 오른쪽의 자식 인덱스를 할당함
	    }
	 
	    if (i != parent) { // 부모 인덱스에 변동이 있을경우
	        swap(figureArray, parent, i); // 위치 변경 후
	        maxHeapify(figureArray, length, parent); // 재귀
	    }
	}
	 
	public static void heapSort(Figure[] figureArray) {
	    int length = figureArray.length - 1; // 인덱스 값이기 때문에 -1
	 
	    for (int i = length / 2; i >= 0; i--) { // 최대 힙으로 만들어줌
	    	maxHeapify(figureArray, length, i);
	    }
	
	    for (int i = length; i > 0; i--) { // 값이 하나 남아있을 때까지 정렬
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
