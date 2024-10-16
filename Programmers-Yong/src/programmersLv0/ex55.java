package programmersLv0;

public class ex55 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {
        int answer = 0;
        // contains를 사용해 str1 문자열에 str2가 포함되어있는지 체크
        if(str1.contains(str2)){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}
