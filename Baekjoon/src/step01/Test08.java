package step01;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int byear = sc.nextInt();
		int syear = byear-543;
		
		System.out.println(syear);
		
		sc.close();
	}

}
