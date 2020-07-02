package hw0_2;

import java.util.Scanner;

public class CompareSet {
	public static int MAX = 0;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("hw0_2 : 201632023 이지훈");
		int[] arr1 = new int[100]; // 사용자에게 입력받을 집합들을 저장하는 배열 arr1
		int[] arr2 = new int[100]; // 사용자에게 입력받을 집합들을 저장하는 배열 arr2
		System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		arr1 = createArr(); // creatArr을 불러와서 arr1안에 값을 넣어줌
		int total1 = MAX; // total1에 arr1의 크기 저장
		System.out.print("두번째 집합을 입력하세요. 집합 입력을 마치려면 양이 아닌 정수를 입력하세요 : ");
		arr2 = createArr(); // creatArr을 불러와서 arr2안에 값을 넣어줌
		int total2 = MAX; // total1에 arr2의 크기 저장
		
		// 두 배열의 크기가 다르면 당연히 다른것이므로 다르다고 알림
		if(total1 != total2) {
			System.out.println("두 집합은 서로 다릅니다.");
		}
		// 만약 두 배열의 크기가 같을시 서로 비교
		else {
			arr1 = sortArr(arr1); // sortArr을 가져와 배열을 오름차순으로 정리
			arr2 = sortArr(arr2); // 마찬가지
			for(int i = 0; i < MAX; i++) { // 오름차순으로 정렬한 배열을 하나하나 비교
				if(arr1[i] != arr2[i]) { // 만약 두 배열의 값이 다른것이 하나라도 나온다면
					System.out.println("두 집합은 서로 다릅니다."); 
					System.exit(0); // 적절한 안내문 후에 바로 프로그램 종료
				}
			}
			System.out.println("두 집합은 같습니다."); // 이상없으면 같다고 알림.
		}
	}
	
	public static int[] createArr() { // 매개변수는 없고 배열을 return하는 함수
		int[] arr = new int[100]; // return하는 배열
		for(int i = 0; i < arr.length; i++) {
			int a = scan.nextInt(); // 사용자에게 값을 입력받음
			if(a < 0) { // 음수를 입력하면 더이상 입력받지 않도록 함
				MAX = i; // 전역변수 MAX에 현재 몇개의 값이 저장되었는지 저장
				break;
			}
			arr[i] = a;
		}
		return arr;	
	}
	
	public static int[] sortArr(int[] arr) { // 배열을 매개변수로 받고 배열을 return하는 함수
		for(int i = 0; i < MAX; i++) { // 오름차순으로 배율을 정렬
			for(int j = i+1; j < MAX; j++) { // MAX값만큼의 개체가 있을테니 MAX값 만큼만 돌림
				if(arr[i] > arr[j]) {
					int temp = arr[i]; // hw0_1과 같은 과정으로 오름차순 정리. temp에 arr[i]값 넣는다.
					arr[i] = arr[j]; // arr[i]에 arr[j]값을 넣는다
					arr[j] = temp; // arr[j]에 arr[i]값이 저장되어있던 temp값을 넣는다. 이걸 반복함으로써 정렬완료
				}
			}
		}
		return arr; // 그후 배열 리턴
	}
}
