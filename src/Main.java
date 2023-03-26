import java.util.*;

class Main {
    public int[] solution(int n, int[] a) {
        int[] answer = new int[n];
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) cnt++;
            }
            answer[i] = cnt;
            cnt = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int x : T.solution(n, a)) {
            System.out.print(x + " ");
        }
    }
}
