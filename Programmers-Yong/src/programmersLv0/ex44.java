package programmersLv0;

public class ex44 {
    public static void main(String[] args) {
        int[]num_list = {3,4,5,2,1};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        // 곱셉을 초기화 할떄는 항등원에 따라 1로 시작한다.(중요)
        int multi = 1;

        // for문으로 모든 원소들의 합과 곱의 값을 저장
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multi *= num_list[i];
        }
        if(sum * sum > multi){
            answer = 1;
        }
        else {
            answer = 0;
        }
        return answer;
    }
}
