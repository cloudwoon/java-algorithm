import java.util.*;

class Main {
    public int solution(int n) {
        int answer = 2;
        int[] prime = new int[n/2];
        prime[0] = 2;
        prime[1] = 3;
        for (int i = 5; i < n + 1; i+=2) {
            boolean flag = false;
            for (int j = 1; prime[j]*prime[j] <= i;j++){
                if(i%prime[j] == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[answer++] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}