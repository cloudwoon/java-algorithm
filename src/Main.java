import java.util.*;

class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[][] pan = new int[n + 2][n + 2];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                pan[i + 1][k + 1] = arr[i][k];
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < n + 1; k++) {
                if (pan[i][k] > pan[i][k - 1] &&
                        pan[i][k] > pan[i + 1][k] &&
                        pan[i][k] > pan[i][k + 1] &&
                        pan[i][k] > pan[i - 1][k]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}