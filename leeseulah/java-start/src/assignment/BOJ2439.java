package assignment;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // i는 행의 인덱스
        for (int i = 0; i < n; i++) {   // 0, ..., n - 1 (총 n번 반복)
            // 공백 출력
            for (int k = (n - 1); k > i; k--) { // n - 1은 첫번째 줄에 출력할 공백의 개수, 이후 줄마다 공백이 하나씩 줄어들어 k > i
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1); j++) { // i + 1은 현재 줄에 출력할 별의 개수
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
