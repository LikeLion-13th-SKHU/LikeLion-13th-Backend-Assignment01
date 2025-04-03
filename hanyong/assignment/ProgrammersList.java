package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>(); // 리스트 선언
        int a = slicer[0]; //각 인덱스값을 a로 지정
        int b = slicer[1];
        int c = slicer[2];

        if(n== 1){
            for(int i = 0; i <= b; i++){
                list.add(num_list[i]); //선언된 리스트에 조건에 맞게 추가한다
            }
        }else if(n == 2){
            for(int i = a; i < num_list.length; i++){
                list.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i = a; i <= b; i++){
                list.add(num_list[i]);
            }
        }else if(n== 4){
            for(int i = a; i <= b; i+=c){
                list.add(num_list[i]);
            }
        }
        //리스트를 int형 반환하기 위해서 배열로 전환
        int [] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;//배열을 반환
    }
}
public class ProgrammersList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] slicer = {1, 5, 2};
        int [] num_list = {1,2,3,4,5,6,7,8,9};
        int [] result = solution.solution(4, slicer, num_list);
        System.out.println(Arrays.toString(result));//배열 출력
    }



    }

