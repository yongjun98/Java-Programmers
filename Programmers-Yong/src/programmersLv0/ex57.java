package programmersLv0;

public class ex57 {
    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));
    }

    private static int solution(int order) {
        int answer = 0;
        // order를 문자열로 변환
        String strOrder = Integer.toString(order);
        for (int i = 0; i < strOrder.length(); i++) {
            // strOrder를 char로 변환해 하나씩 체크
            char str = strOrder.charAt(i);
            if (str == '3' || str == '6' || str == '9'){
                answer++;
            }
        }
        return answer;
    }
}
