import java.io.*;
import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0,p2=0;

        while (p1<n && p2<m){
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException, IOException {
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

        for (int x : T.solution(N, M, Nnum, Mnum)) {
            bw.write(x+" ");
        }
        bw.flush();
        bw.close();
    }
}