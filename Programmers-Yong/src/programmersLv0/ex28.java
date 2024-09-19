package programmersLv0;

public class ex28 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String answer = "";
        // 조건에 맞게 문자열 내의 값에서 대문자와 소문자를 변환
        // 자바 라이브러리 : isUpperCase,isUpperCase,toLowerCase,toUpperCase
        for (int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))){
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
            else{
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }
        }
        return answer;
    }
}
