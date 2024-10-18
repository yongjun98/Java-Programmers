package programmersLv0;

import java.util.Arrays;


public class ex59 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    private static int[] solution(String my_string) {
        // 숫자를 찾기전 저장할 배열 설정
        int[] temp = new int[my_string.length()];
        // 배열의 크기를 지정할 변수 설정
        int count = 0;

        // my_string에서 하나씩 추출하여 숫자인지 판별
        for (int i = 0; i <my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= '0' && ch <= '9'){
                //문자 숫자를 정수형 숫자로 변환 후 저장
                // temp에 count만큼의 배열 저장
                temp[count++] = ch - '0';
            }
        }
        // 필요한 만큼의 크기로 새로운 배열 생성
        int[]answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}
