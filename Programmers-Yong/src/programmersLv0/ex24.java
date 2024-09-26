package programmersLv0;

public class ex24 {
    public static void main(String[] args) {
        int price = 150000;
        System.out.println(solution(price));
    }

    public static int solution(int price) {
        int answer = 0;
        if(price >= 500000){
            answer = (int) (price - (price * 0.2));
        }
        else if(price >= 300000){
            answer = (int) (price - (price * 0.1));
        }
        else if(price >= 100000){
            answer = (int) (price - (price * 0.05));
        }
        else {
            answer = price;
        }
        return answer;
    }
}
