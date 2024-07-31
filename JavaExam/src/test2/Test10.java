package test2;
/*
 * 날짜 : 2024/07/05
 * 이름 : 강유정
 * 내용 : 자바 피보나치 수열 재귀 메서드 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(fibo(i)+" ");
		}
	}
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-2) + fibo(n-1);
	}

}






//n-2       //n-1