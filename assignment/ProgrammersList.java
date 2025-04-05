package assignment;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersList {

    public static List<Integer> solution(int n, int[] slicer, List<Integer> num_list) {

        int a = slicer[0]; //slicer의 0번째 배열값을 a에 저장
        int b = slicer[1]; //slicer의 1번째 배열값을 b에 저장
        int c = slicer[2]; //slicer의 2번째 배열값을 c에 저장

        List<Integer> result = new ArrayList<>();
        //새로운 리스트 생성
        switch (n) { //n값에 따라 실행
            case 1: //n이 1일 때, 0번부터 b까지
                for (int i = 0; i < b + 1; i++) {
                    result.add(num_list.get(i));
                }
                break;

            case 2: //n이 2일 때, a부터 끝까지
                for (int i = a; i < num_list.size(); i++) {
                    result.add(num_list.get(i));
                }
                break;

            case 3: //n이 3일 때, a부터 b까지
                for (int i = a; i < b + 1; i++) {
                    result.add(num_list.get(i));
                }
                break;

            case 4: //n이 4일 때, a부터 b까지 c씩 증가하며
                for (int i = a; i < b + 1; i += c) {
                    result.add(num_list.get(i));
                }
                break;
        }

        return result; //결과값 반환
    }
}
