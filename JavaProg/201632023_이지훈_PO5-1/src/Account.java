
public class Account {
	private String name; // 필드부분
	private int balance;
	static int donateM;
	public Account(String name, int balance) { // 이름과 금액을 모두 입력받는경우
		this.name = name; 
		this.balance = balance;
	}
	
	public String getName() { // getter와 setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int balance) { // 입금
		this.balance += balance;
	}

	public boolean withdraw(int balance) { // 출금의 성공 여부를 알리고 성공시 현재 잔액에서 -
		if(this.balance - balance < 0) {
			System.out.println("잔액이 부족하여 기부할 수 없습니다.");
			return false;
			}
		else {
			this.balance -= balance;
			return true;
			}
	}
	
	public int showInfo(){ // 현재 금액 조회
		return balance;
	}
	
	public boolean donate(int balance) { // 기부의 성공여부를 알리고 성공시 현재 잔액에서 -
		if(this.balance - balance < 0)
			return false;
		else {
			this.balance -= balance;
			return true;
			}
	}
	
	public static int totalDonate(int balance) { // 총 기부금액을 저장 및 리턴해 주는 스태틱 메소드
		donateM += balance;
		return donateM;
	}
}
