import java.util.Scanner; // 사용자에게 입력받기 위해 Scanner import

public class Problem2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner를 사용하기 위해 선언
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 배열 선언 및 초기화
		System.out.print("금액을 입력하시오 : "); // 사용자에게 입력받기 전 적절한 안내문
		int n = scan.nextInt(); // 이후 입력받기
		for(int i = 0; i < unit.length; i++) { // i가 0부터 unit의 길이만큼 도는 반복문
			int a = n / unit[i]; // 자주 사용하므로 n을 unit[i]로 나눈값 미리 저장
			if(a != 0) { // 만약 나눈값이 0이 아닐시
				System.out.println(unit[i] + "원 짜리 :" + a); // 몇 번 있다고 출력해줌
				n -= unit[i]*a; // 그리고 그 가격 빼줌
			}
		}
	}
}
