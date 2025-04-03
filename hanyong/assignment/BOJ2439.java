package assignment;

import java.util.Scanner;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) { //입력한 갯수만큼 층 생성
            for (int j = 0; j < N - (i+1); j++) {//공백란 출력
                System.out.print(" ");
                }
            for (int k = 0; k <= i; k++) {//별 출력
                System.out.print("*");
            }
            System.out.println();//다음줄로 출력
            }
        }
    }

