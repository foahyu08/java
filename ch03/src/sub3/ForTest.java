package sub3;

/*
 * 날짜 : 2024/07/01
 * 이름 : 강유정
 * 내용 : 반복문 for 실습
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		// for
		for(int i=1; i<=10; i++) {			
			System.out.println("i : " + i);			
		}		
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++){			
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지의 짝수합
		int total = 0;
		
		for(int k=1; k<=10; k++) {
			
			if(k % 2 == 0) {
			total += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : " + total);
		
		// for 중첩
		for(int a=1; a<=3; a++) {			
			
			System.out.println("a : " + a);			
			
			for(int b=1; b<=5; b++) {				
			
				System.out.println("b : " + b);
				
				for(int c=1; c<=7; c++) {
				
					System.out.println("c : " + c);
				
				}
			}
		}
		
		// 구구단
		for(int x=2; x<=9; x++) {
			
			System.out.println(x + "단");
			
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				
				System.out.println(x + "x" + y + "=" + z);
			}
		}
		
		// 별삼각형
		for(int start=1; start<=10; start++) {
			
			for(int end=1; end<=start; end++) {
				
				System.out.print("☆");
				
			}
			
			System.out.println();
		}
		
		// 별역삼각형
		for(int start2=10; start2>=1; start2--) {
			
			for(int end2=1; end2<=start2; end2++) {
				
				System.out.print("★");
				
			}
			
			System.out.println();
		}
				
	}

}
