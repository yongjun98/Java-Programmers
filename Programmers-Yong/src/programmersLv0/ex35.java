package programmersLv0;

public class ex35 {
    public static void main(String[] args) {
        int[] box = {1,1,1};
        int n = 1;
        System.out.println(solution(box, n));
    }

    private static int solution(int[] box, int n) {
        int answer = 0;
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;

        answer = width * length * height;
        return answer;
    }
}
