//***************************
// 파일명: SelectAlgorithm
// 작성자: 201632023 이지훈
// 작성일: 20.04.23.
// 내용: 선택알고리즘과 파티션 알고리즘을 이용해 중앙값 찾기
//***************************
package hw5_1;

import java.util.Scanner;

public class SelectAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw5_1 : 201632023 이지훈");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수갯수 입력: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print(n + "개의 정수 입력: ");
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		
		int length = arr.length;
		int mid;
		if(length%2 != 0)
			mid = length/2+1;
		else
			mid = length/2;
		System.out.println("중앙값 : " + select(arr,0,length-1,mid));
	}
	
	
	private static int select(int[]arr, int p, int r, int i) {
		if(p == r) // 원소가 하나뿐이면 바로 리턴
			return arr[p];
		
		int q = partition(arr, p, r); // 배열 분할
		
		int k = q - p + 1; // 기준원소가 배열에서 k번째 작은 원소임을 의미함
		
		if(i < k) 
			return select(arr, p, q-1, i); // 왼쪽 분할로 범위를 좁힘
		
		else if(i == k) 		
			return arr[q]; // 기준원소가 찾는답일때
		
		else 
			return select(arr, q+1, r, i-k); // 오른쪽 분할로 범위를 좁힘
			
	}
	
	
	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r]; // 가장 끝값을 기준값으로 삼음
		int i = l-1; // i보다 작은 인덱스값에는 기준값보다 적은 수들이 들어가게됨
		for(int j = l; j<r; j++) { // 반대로 i+1~j에는 기준값보다 큰 값들이 들어감
			if(arr[j] <= pivot) {
				swap(arr, ++i, j); // 기준값보다 값이 작으면 앞쪽으로 당김
				}
		}
		swap(arr,i+1,r); // 마지막으로 기준값을 i의 바로 앞쪽에 넣어주어서 배열을 왼쪽에는 기준값보다 작은값, 오른쪽에는 큰값이 들어가게 정렬
		return i+1; // 그 기준값의 인덱스 리턴
	}
	
	private static void swap(int[]arr, int i, int j) { // 자주나온 swap메소드
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
