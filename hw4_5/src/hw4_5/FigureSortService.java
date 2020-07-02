//***************************
// 파일명: FigureSortService
// 작성자:  201632023 이지훈
// 작성일: 2020.04.15.
// 내용: 병합정렬을 수행하는 클래스
//***************************
package hw4_5;

public class FigureSortService {
	public static void mergeSort(Figure[] figureArray, int left, int right) { // figure형 배열, 왼쪽 끝값과 오른쪽 끝값을 매개변수로 받는 메소드
		if(left < right){
			int mid = (left + right)/2;
			mergeSort(figureArray, left, mid); // 다시 불러오는 재귀방식 - figureArray의 왼쪽 블록 분할
			mergeSort(figureArray, mid+1, right); // 다시 불러오는 재귀방식 - figureArray의 오른쪽 블록 분할
			merge(figureArray, left, right); // 그 후 다시 병합
		}		
	}
	
	 // 도형 배열, 병합할 하한 인덱스, 상한 인덱스를 매개변수로 받고 분할된 블록을 병합하는 merge메소드
	public static void merge(Figure[] figureArray, int left, int right) {
		int i = left; // 가장 왼쪽값을 저장할 인덱스
		int mid = (left + right)/2; // 중간값을 저장할 인덱스
		int j = mid + 1; // 중간값 바로 이후 시작하는 왼쪽값을 저장하는 인덱스
		int k = left; // 결과 배열의 인덱스값
		Figure[] tempFigureArray = new Figure[figureArray.length]; // 결과 배열
		
		while(i <= mid && j <= right) {
			if(figureArray[i].getArea() < figureArray[j].getArea()) { // 면적값 비교
				tempFigureArray[k] = figureArray[i]; // 결과 배열에 값을 저장해놓음
				i++; // 왼쪽값 한 칸 증가
			}
			else {
				tempFigureArray[k] = figureArray[j];
				j++; // 중간+1 한칸 증가
			}
			k++; // 결과 배열의 인덱스값 1 증가
		}
		
		if(i > mid) { // 오른쪽 블록이 먼저 소진 되었을 경우
			for(int x = j; x <= right; x++) { // 왼쪽 블록을 차례대로 넣어줌
				tempFigureArray[k] = figureArray[x];
				k++;
			}
		}
		else { // 반대로 왼쪽 블록이 먼저 소진 되었을 경우
			for(int x = i; x <= mid; x++) { // 오른쪽 블록을 차례대로 넣어줌
				tempFigureArray[k] = figureArray[x];
				k++;
			}
		}
		
		for(int x = left; x <= right; x++) { // 기존의 배열에 결과 배열값을 넣어주며 정리
			figureArray[x] = tempFigureArray[x];
		}
	}
}
