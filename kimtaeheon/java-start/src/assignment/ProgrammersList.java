package assignment;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                answer.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                answer.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                answer.add(num_list[i]);
            }
        } else {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                answer.add(num_list[i]);
            }
        }
        return answer;
    }
}

public class ProgrammersList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> result = solution.solution(3, slicer, num_list);
        System.out.println(result);
    }
}
