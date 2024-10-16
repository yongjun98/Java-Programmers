package programmersLv0;

public class ex53 {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        // answer에 my_string을 대입
        String answer = my_string;
        // 제거할 모음 배열 설정
        String[]str = {"a","e","i","o","u"};
        // str에 있는 문자를 answer에서 replace로 제거
        for (String s : str) {
            answer = answer.replace(s,"");
        }
        return answer;
    }
}
