package sub1;

/*
 * 날짜 : 2024/07/08
 * 이름 : 강유정
 * 내용 : 클래스와 객체 실습하기
 */
public class Class {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소타나";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		//두번째 객체 생성
		Car avante = new Car();
		
		avante.name = "아반데";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 색성
		Account kb = new Account();
		
		//객체 초기화
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 10000;
		
		//객체 활용
		kb.deposit(40000);
		kb.withraw(30000);
		kb.show();
		
		//우리 은행
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.acc = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(20000);
		wr.withraw(15000);
		wr.show();
	}

}
