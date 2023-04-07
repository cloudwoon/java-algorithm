import java.io.*;
import java.util.*;
class Main {
    public void solution(int N, int M, int[] Nnum, int[] Mnum) {
        int[] answer = new int[N + M];
        System.arraycopy(Nnum, 0, answer, 0, Nnum.length);
        System.arraycopy(Mnum, 0, answer, Nnum.length, Mnum.length);
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] Nnum = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Nnum[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] Mnum = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Mnum[i] = Integer.parseInt(st.nextToken());
        }
        T.solution(N, M, Nnum, Mnum);
    }
}