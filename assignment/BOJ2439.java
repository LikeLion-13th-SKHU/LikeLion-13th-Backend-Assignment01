package assignment;

import java.util.Scanner;
public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //n에 입력받은 값 저장
        for (int i = 1; i <= n; i++) { //i는 1부터 n과 같을 때까지 반복
            System.out.println(" ".repeat(n - i) + ("*".repeat(i)));
            // n-i값 만큼 " " 공백 출력, 추가로 i 값만큼 * 출력
        }
        scanner.close();
    }
}
