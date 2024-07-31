package yujeong;

import java.util.Scanner;

public class Online {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        System.out.println("정수를 입력하세요 (0을 입력하면 종료됩니다): ");

        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break; // 0 입력 시 반복문 종료
            }
            sum += input; // 합계에 입력 값 추가
            count++; // 입력된 값의 개수 증가
        }

        if (count > 0) {
            double avg = (double) sum / count; // 평균 계산
            System.out.println("합계는 " + sum + "입니다.");
            System.out.println("평균은 " + avg + "입니다.");
        } else {
            System.out.println("입력된 값이 없습니다.");
        }

        sc.close();
    }

}