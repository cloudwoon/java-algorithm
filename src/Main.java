import java.util.*;

class Main {
    public void solution(int n, int[] a) {
        //
        int[] reverse = new int[n];

        for (int i = 0; i < n; i++) {
            while (a[i] != 0) {
                reverse[i] = reverse[i] * 10 + a[i] % 10;
                a[i] /= 10;
            }
        }

        for (int num : reverse) {
            boolean isPrime = true;
            for (int i = 2; i < num / 2; i++) {
                if (num < 2) {
                    isPrime = false;
                    break;
                }
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                //  System.out.println(i+":"+isPrime);
            }
            if (num < 2) isPrime = false;
            System.out.print(isPrime ? num + " " : "");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        T.solution(n, a);
    }
}
