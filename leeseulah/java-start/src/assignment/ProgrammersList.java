package assignment;

import java.util.ArrayList; // ArrayList 자료구조를 사용하기 위해 불러옴
import java.util.Arrays;    // 배열을 쉽게 다루기 위해 불러옴
import java.util.List;  // List 인터페이스 사용하기 위해 불러옴

public class ProgrammersList {
    public int[] solution(int n, int[] slicer, int[] num_list) {

        // 배열은 크기가 고정되어 있고, 리스트는 크기를 마음대로 늘릴 수 있음
        List<Integer> list = new ArrayList<>(); // 결과를 임시로 저장할 리스트

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1:
                for (int i = 0; i < b + 1; i++) {
                    list.add(num_list[i]);  // list.add(값): 리스트에 새로운 값을 추가
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i < b + 1; i++) {
                    list.add(num_list[i]);
                }
                break;
            default:
                for (int i = a; i < b + 1; i += c) {
                    list.add(num_list[i]);
                }
        }

        // 리스트에 저장된 값들을 다시 배열로 바꿔줌
        int[] answer = new int[list.size()];    // list.size(): 리스트에 저장된 값의 개수
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);    // list.get(인덱스): 리스트에서 특정 위치의 값을 꺼냄
        }

        return answer;
    }

    public static void main(String[] args) {
        ProgrammersList pl = new ProgrammersList();

        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = pl.solution(n, slicer, num_list);
        // 배열은 주소값이 출력되기 때문에 문자열로 변환
        System.out.println(Arrays.toString(result));    // Arrays.toString(배열): 배열을 문자열 형태로 바꿈
    }
}