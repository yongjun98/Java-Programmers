package programmersLv0;

public class ex32 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution(my_string,letter));
    }

    private static String solution(String my_string, String letter) {
        String answer = "";
        // replace(찾고자하는 문자, 바꾸고자 하는 문자열)
        answer = my_string.replace(letter,"");
        return answer;
    }
}
