// input: Scanner
// lines: 총 줄 수
// line: 현재 줄 번호4
// star: 현재 줄에서 출력될 별 수

package assignment;

import java.util.Scanner;

public class BOJ2439 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();



        int line = 1;
        while (line <= lines) {

            int space = lines - line;
            while (space > 0) {
                System.out.print(" ");
                space = space - 1;
            }


            int star = line;
            while (star > 0) {
                System.out.print("*");
                star = star - 1;
            }


            System.out.println();
            line = line + 1;
        }
    }
}
