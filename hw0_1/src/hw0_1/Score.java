package hw0_1;

import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		System.out.println("hw0_1 : 201632023 이지훈");
		Scanner scan = new Scanner(System.in);
		int a = 0; // 사용자에게 입력받을 변수 a 선언 및 초기화.
		int[] arr = {9000, 40, 1, -15, 50, 200, 315, 800, -30, 12345}; // 미리 제시된 값이 들어간 배열 arr
		
		// 배열의 오름차순 정리
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i]; // 변수 temp에 arr[i]값을 넣은뒤
					arr[i] = arr[j]; // arr[i]에 arr[j]값을 넣고
					arr[j] = temp; // arr[j]에 arr[i]값이 저장된 temp값을 넣음으로 써 성공적인 교환 완료
				}
			}
		}
		
		// 사용자가 int의 값을 벗어나거나 정수값을 입력하지 않았을때 프로그램을 종료하는 시스템
		try {
			System.out.println("숫자 맞추기 프로그램입니다.");
			System.out.print("하나의 정수값을 입력하세요 : ");
			a = scan.nextInt();
			}catch(Exception e) { // 사용자가 소수나 문자열, -2,147,483,648 ~ 2,147,438,647 사이의 숫자를 입력하지 않았을시 예외처리
				System.out.println("범위를 벗어나거나 정수값을 입력하지 않아 프로그램을 종료합니다.");
				System.exit(0); // 바로 프로그램 종료
			}
		
		// 점수를 저장할 변수 score
		int score = 0;
		
		// 점수 계산
		for(int i = 1; i < arr.length; i++) {
			int x = arr[i-1];
			int y = arr[i];
			if(a > x && a < y) {
				int set1 = a - x; // a는 x와 y 사이의 숫자이므로 a는 x보다 무조건 크다
				int set2 = y - a; // 위의 말의 역이 성립						
				if(set1 < set2) {
					score = 100 - set1;
				}
				else
					score = 100 - set2;	
				}
			}
		
		// 0점 미만일시 그냥 0점
		if(score < 0)
			score = 0;
		System.out.println("점수 = " + score);	

	}

}