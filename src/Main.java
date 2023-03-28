import java.util.*;

class Main {
    public int solution(int n, int[][] a) {
        int answer = 0;
        int sum = 0;

        //행의 합
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            if (sum > answer) answer = sum;
        }
        //열의 합
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j][i];
            }
            if (sum > answer) answer = sum;
        }
        sum = 0;
        //두 대각선의 합
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }
        if (sum > answer) {
            answer = sum;
        }
        sum = 0;

        //두 대각선의 합
        for (int i = n - 1; i >= 0; i--) {
            sum += a[i][i];
        }
        if (sum > answer) answer = sum;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, a));
    }
}
