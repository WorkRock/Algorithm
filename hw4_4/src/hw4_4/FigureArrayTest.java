//***************************
// 파일명: hw4_4
// 작성자: 201632023 이지훈	
// 작성일: 2020.04.12.
// 내용: 정렬 알고리즘 구현을 준비하기 위해 인터페이스와 클래스 정의를 복습 - 원과 삼각형의 갯수 입력 및 면적 계산
//***************************
package hw4_4;

import java.util.Scanner;

public class FigureArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner를 이용하기 위해 선언
		System.out.println("hw4_4 ; 201632023 이지훈");
		
		System.out.print("원 갯수 입력 : "); // 적절한 안내문 이후 사용자에게 원 갯수 입력받기
		int n1 = scan.nextInt();
		System.out.print("삼각형 갯수 입력 : "); // 적절한 안내문 이후 사용자에게 삼각형 갯수 입력받기
		int n2 = scan.nextInt();
		int count = n1 + n2; // 원과 삼각형을 합친 갯수를 저장해 놓는 count
		
		Figure[] figureArray = new Figure[count]; // 인터페이스로 구성된 배열 figureArray선언
		
		System.out.println(n1 + "개의 원 정보(반지름)을 입력하세요 : ");
		for(int i = 0; i < n1; i++) { // n1개 만큼 Circle클래스로된 figureArray를 만들어준뒤 반지름을 입력받음
			figureArray[i] = new Circle();
			((Circle) figureArray[i]).setRadius(scan.nextDouble());
		}
		
		System.out.println(n2 + "개의 삼각형 정보(밑변과 높이)를 입력하세요 : ");
		for(int i = n1; i < count; i++) { // n2개 만큼 Triangle클래스로된 figureArray를 만들어준뒤 밑변, 높이를 입력받음
			figureArray[i] = new Triangle();
			((Triangle) figureArray[i]).setBase(scan.nextDouble());
			((Triangle) figureArray[i]).setHeight(scan.nextDouble());
		}
		
		System.out.println(count + "개의 도형 정보와 면적 : ");
		for(int i = 0; i < count; i++) {
			System.out.println((figureArray[i]).toString()); // toString을 이용해 출력
		}
		
	}

}
