package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersList {
    public static void main(String[] args) {

        int n = 4;
        int[] slier = {1,5,2};
        int[] num_list = {1,2,3,4,5,6,7,8,9};

        int[] r= solution(n, slier, num_list);
        System.out.println(Arrays.toString(r));

    }

    private static int[] solution(int n, int[] slicer, int[] num_list){
        //인덱스분리
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        //배열로만 코드를 작성하면 배열의 길이 설정이 힘들어서, 결과값 받을 리스트를 만들었습니다.
        List<Integer> resultList = new ArrayList<>();

        //입력 케이스에 따라서 입력 받은 배열을 기반으로 결과 리스트를 만들었습니다.
        if (n==1) {
            for (int i = 0; i <= b; i++) {
                resultList.add(num_list[i]);
            }
        } else if (n==2) {
            for (int i = a; i < num_list.length ; i++) {
                resultList.add(num_list[i]);
            }

        } else if (n ==3) {
            for (int i = a; i <= b ; i++) {
                resultList.add(num_list[i]);
            }
        } else if (n==4) {
            for (int i = a; i <= b ; i+=c) {
                resultList.add(num_list[i]);
            }
        }

        //합수 출력 값이 배열임으로, 리스트 값을 배열로 만들었습니다.
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;

    }
}
