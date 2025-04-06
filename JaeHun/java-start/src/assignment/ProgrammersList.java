
// n: 조건, a: 시작, b: 끝, c: 간격

package assignment;

public class ProgrammersList {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int[] answer = {};

        if (n == 1) {
            int size = b + 1;
            answer = new int[size];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
        }


        if (n == 2) {
            int size = num_list.length - a;
            answer = new int[size];
            for (int i = 0; i < size; i++) {
                answer[i] = num_list[a + i];
            }
        }

        if (n == 3) {
            int size = b - a + 1;
            answer = new int[size];
            for (int i = 0; i < size; i++) {
                answer[i] = num_list[a + i];
            }
        }

        if (n == 4) {
            int size = (b - a + c) / c;
            answer = new int[size];
            for (int i = 0; i < size; i++) {
                answer[i] = num_list[a + i * c];
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        ProgrammersList p = new ProgrammersList();

        int n = 2;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6};

        int[] result = p.solution(n, slicer, num_list);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
