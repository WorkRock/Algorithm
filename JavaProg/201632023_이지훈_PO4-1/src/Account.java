import java.util.Scanner;

public class Account {
	String name; // 필드부분
	int money;
	public Account(String name) { // 이름만 입력받을때
		this.name = name;
	}
	
	public Account(String name, int money) { // 이름과 금액을 모두 입력받는경우
		this.name = name; 
		this.money = money;
	}
	
	public void deposit(int money) { // 입금
		this.money += money;
	}
	
	public void withdraw(int money) { // 출금
		this.money -= money;
	}
	
	public int showInfo(){ // 현재 금액 조회
		return money;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하시어 계좌를 생성해주십시오 : ");
		Account a1 = new Account(scan.next()); // 계좌 생성
	
		int s;
		int money;
		while(true) { // 무한루프문
			System.out.println("이 후 수행하실 업무의 번호를 입력하십시오.");
			System.out.println("1.계좌 개설  2.계좌 개설 및 입금  3.입금  4.출금  5.계좌 조회  0.프로그램 종료"); // 알맞은 번호에 따라서 임무 수행
			s = scan.nextInt();
			switch(s) { // switch문을 이용해 사용자가 원하는 임무를 수행
				case 1:
					System.out.println("계좌 개설을 수행합니다");
					System.out.print("이름을 입력하시어 계좌를 생성해주십시오 : ");
					a1  = new Account(scan.next());
					System.out.println(a1.name + " 고객님의 계좌가 개설되었습니다.");
					break;
				case 2:
					System.out.println("계좌 개설 및 입금을 수행합니다");
					System.out.print("이름 및 입금할 금액을 입력하시어 계좌를 생성해주십시오 : ");
					a1  = new Account(scan.next(),scan.nextInt());
					System.out.println(a1.name + " 고객님의 계좌가 개설되었습니다.");
					break;
				case 3:
					System.out.println("계좌 입금을 수행합니다");
					System.out.print("입금하실 금액을 입력하십시오 : ");
					money = scan.nextInt();
					a1.deposit(money);;
					System.out.println(a1.name + " 고객님의 계좌로 " + money +"원이 입금되었습니다.");
					continue;
				case 4:
					System.out.println("계좌 출금을 수행합니다");
					System.out.print("출금하실 금액을 입력하십시오 : ");
					money = scan.nextInt();
					a1.withdraw(money);;
					System.out.println(a1.name + " 고객님의 계좌에서 " + money +"원이 출금되었습니다.");
					break;
				case 5:
					System.out.println("계좌 조회를 수행합니다");
					System.out.println(a1.name+" 고객님의 잔액 : "+a1.showInfo());
					break;
				case 0:
					System.out.println("프로그램 종료");
					break;
				
			}
			if(s == 0) // 프로그램 종료인 0을 입력하면 프로그램 종료
				break;
		}
	}

}
