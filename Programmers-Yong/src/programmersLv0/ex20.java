package programmersLv0;
public class ex20 {
    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(numbers));
    }

    private static double solution(int[] numbers) {
        double answer = 0;
        // 전체를 합한 값의 변수 선언
        double sum = 0;
        // numbers 배열을 순회하면서 모든 값을 sum에 합함
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        // 소수점 한자리까지 출력되게 배열의 평균값을 도출하기 위해 합한 값에서 numbers배열의 길이를 나눔
        answer = sum / numbers.length;
        return answer;
    }
}
