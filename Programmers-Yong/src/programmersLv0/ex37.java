package programmersLv0;

public class ex37 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string,num1,num2));
    }

    private static String solution(String my_string, int num1, int num2) {
        // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();

        // temp를 통해 num1 num2 문자교환
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        // 배열을 다시 문자열로 변환
        String answer = new String(charArray);

        return answer;
    }
}
