import java.util.Scanner; // 사용자에게 입력받기 위해 Scanner import 

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scanner를 사용하기 위해 선언
		
		System.out.print("시작 : ");
		int start = scan.nextInt(); // 사용자에게 시작하는 수를 입력받고
		System.out.print("종료 : ");
		int end = scan.nextInt(); // 끝나는 수를 입력받고
		System.out.print("배수 : ");
		int multiple = scan.nextInt(); // 배수를 입력받은 뒤
		int total = 0; // 총 합을 저장할 total이라는 변수 선언 후 초기화
		for(int i = start; i <= end; i++) { // start에서 시작해서 end까지 도는 반복문
			if(i%multiple == 0) // 만약 i를 배수로 나누었을때 나머지가 0일때만 total에 더해주기
				total += i; 
		}
		System.out.println(start + "부터 " + end + "까지의 " + multiple +"의 배수의 합 : " + total); // 그 후 출력
	}

}
