import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution(int n, int k, int[] score) {
        int max = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + score[i];
            if (i == k-1) {
                max = sum;
            }
            if (i>=k) {
                sum = sum - score[i-k];
                max = Math.max(max,sum);
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        solution(N, K, score);
    }
}