import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] arr = new Car[3];
		Scanner scan = new Scanner(System.in);
		
		Sedan sed = new Sedan("람보르기니"); // 객체를 만들고 저장
		Truck euro = new Truck("볼보");
		SUV suv = new SUV(); // 객체에 이름을 넣지 않으면 자동으로 성공회자동차가 저장된다.
		
		arr[0] = sed; // 각 배열의 원소에 하나하나 저장
		arr[1] = euro;
		arr[2] = suv;
		
		/* 사용자에게 직접 이름을 입력받는 경우
		String name;
		for(int i = 0; i < 3; i++) {
			System.out.print("자동차 이름 입력 : ");
			name = scan.next();
			
			if(i == 0)
				arr[i] = new Sedan(name); // 0이면 arr[0]에 세단 객체를 넣어준다. 뒤도 동일한 양상.
			else if(i == 1)
				arr[i] = new Truck(name);
			else
				arr[i] = new SUV(name);
		}
		*/
		
		for(int i = 0; i < 3; i++) {
			arr[i].accelPedal();
			arr[i].accelPedal();
			arr[i].accelPedal();
		}
		
		for(int i = 0; i < 3; i++) {
			arr[i].showSpeed();
		}
		
		System.out.println();
		for(int i = 0; i < 3; i++) {
			arr[i].breakPedal();
			arr[i].breakPedal();
		}
		
		for(int i = 0; i < 3; i++) {
			arr[i].showSpeed();
		}
		
	}

}
