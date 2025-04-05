class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int[] result;

        if (n == 1) {
            result = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                result[i] = num_list[i];
            }
        } else if (n == 2) {
            result = new int[num_list.length - a];
            for (int i = a; i < num_list.length; i++) {
                result[i - a] = num_list[i];
            }
        } else if (n == 3) {
            result = new int[b - a + 1];
            for (int i = a; i <= b; i++) {
                result[i - a] = num_list[i];
            }
        } else { //이 부분이 n==4인데 그냥 switch문을 이용할걸 그랬네요...너무 어려워요
            int size = 0;
            for (int i = a; i <= b; i += c) {
                size++;
            }

            result = new int[size];
            int j = 0;
            for (int i = a; i <= b; i += c) {
                result[j] = num_list[i];
                j++;
            }
        }

        return result;
    }
}
