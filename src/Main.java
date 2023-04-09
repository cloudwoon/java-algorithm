import java.io.*;
import java.util.*;

class Main {
    public int solution(int n, int m, int[] num) {
        int answer = 0;
        int s = 0;
        int e = 0;
        int sum = 0;
        Arrays.sort(num);
        //n = 4 , m = 2
        while(true) {
            if(sum >= m) {
                sum -= num[s++];
            }
            else if( e == n) break;
            else if(sum < m) {
                sum += num[e++];
            }

            if(sum == m) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException, IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(T.solution(N,M,num));
    }
    //오답 
}