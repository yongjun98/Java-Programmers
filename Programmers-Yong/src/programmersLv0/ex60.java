package programmersLv0;

import java.util.Arrays;

public class ex60 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer = "";
        // my_string를 소문자로 변환하고 split으로 각 문자별로 분리
        String[]strArr = my_string.toLowerCase().split("");
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }
        return answer;
    }
}
