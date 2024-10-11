package programmersLv0;

import java.util.Arrays;

public class ex40 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strlist)));
    }

    private static int[] solution(String[] strlist) {
        int[]answer = new int[strlist.length];
        int length = strlist.length;

        // 문자열 길이 계싼 for each
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (char c : strlist[i].toCharArray()) {
                count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
