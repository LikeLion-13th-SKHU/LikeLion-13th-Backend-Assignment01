package assignment;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        //결고 담을 곳
        int size = 0;

        // n이 1일 경우에는 0~b니까 b - 0 + 1
        if (n == 1) size = b - 0 + 1;
        else if (n == 2) size = num_list.length - a;        // n이 2일 경우에는 a~마지막이니까 전체길이 - a
        else if (n == 3) size = b - a + 1;      // n이 3일 경우에는 a~b니까 b-a+1
        else if (n == 4) size = ((b - a) / c) + 1;      // n이 4일 경우에는 간격이 c

        // 계산된 size만큼 배열 만들기
        int[] result = new int[size];

        int idx = 0; // 인덱스 변수


        if (n == 1) {       //n이 1일 경우
            // 0~b까지 하나씩 복사
            for (int i = 0; i <= b; i++) {
                result[idx++] = num_list[i];    // 복사하고 인덱스 증가시키기
            }
        } else if (n == 2) {
            // a~마지막까지 복사
            for (int i = a; i < num_list.length; i++) {
                result[idx++] = num_list[i];
            }
        } else if (n == 3) {
            // a~b까지 복사
            for (int i = a; i <= b; i++) {
                result[idx++] = num_list[i];
            }
        } else if (n == 4) {
            // a~b까지 c간격 복사
            for (int i = a; i <= b; i += c) {
                result[idx++] = num_list[i];
            }
        }

        return result;  //result값 반환

    }
}



