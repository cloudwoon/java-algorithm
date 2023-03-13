import java.util.*;

public class Main {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]을 교환합니다.");
        System.out.println(Arrays.toString(a));
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        return sum;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);

        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void copy(int[] a, int[] b) {
        if(b.length>=a.length){
            for(int i = 0 ; i < a.length; i++){
                a[i] = b[i];
            }
        }else {
            for (int i = 0; i <b.length; i++){
                a[i] = b[i];
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = kb.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = kb.nextInt();
        }

       /* int sum = sumOf(x);
        System.out.println(sum);*/

        int[] a = new int[5];
        copy(a,x);
        System.out.println(Arrays.toString(a));
        //reverse(x);

        /*System.out.println("요소를 역순으로 정렬했음.");
        System.out.println("x ="+Arrays.toString(x));*/

    }
}