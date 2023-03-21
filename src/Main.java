import java.util.*;

class Main {
    public int[] solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;
        System.out.print(answer[1]+" ");
        for (int i = 2; i < n + 1; i++) {
            answer[i] = answer[i - 2] + answer[i-1];
            System.out.print(answer[i] + " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}