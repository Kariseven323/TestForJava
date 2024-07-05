import java.util.Scanner;

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]<=0)
            {
                a[i]=1;
            }
        }
        int i=0;
        for (int j : a) {
            System.out.println("X["+i+"] = "+j);
            i++;
        }
    }
}
