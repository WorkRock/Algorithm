//***************************
// 파일명: MergeSortTest
// 작성자:  201632023 이지훈
// 작성일: 2020.04.15.
// 내용: 원과 반지름 구하고 면적을 오름차순으로 정렬하여 출력하는 메인클래스
//***************************
package hw4_5;

import java.util.Scanner;

public class MergeSortTest {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hw4_5 : 201632023 이지훈");
 
		System.out.print("원 개수 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("삼각형 개수 입력 : ");
		int n2 = scan.nextInt();

		Figure[] figureArray = new Figure[n1 + n2];

		System.out.println(n1 + "개의 원 정보(반지름)를 입력하세요: ");

		for (int i = 0; i < n1; i++) {
			Circle c = new Circle(); // Circle() 객체 생성
			c.setRadius(scan.nextDouble());
			figureArray[i] = c;
		}

		System.out.println(n2 + "개의 삼각형 정보(밑변과 높이)를 입력하세요: ");

		for (int i = 0; i < n2; i++) {
			Triangle t = new Triangle(); // Triangle() 객체 생성
			t.setWidth(scan.nextDouble());
			t.setHeight(scan.nextDouble());
			figureArray[n1 + i] = t;
		}
		
		FigureSortService.mergeSort(figureArray, 0, n1+n2-1); // 병합정렬
		
		for (int i = 0; i < figureArray.length; i++) {
			System.out.println(figureArray[i]);
		}
	}
}
