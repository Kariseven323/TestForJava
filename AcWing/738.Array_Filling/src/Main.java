import java.util.Scanner;

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0]=sc.nextInt();
        for(int i=1;i<10;i++)
        {
            arr[i]=2*arr[i-1];
        }
        for(int i = 0;i<10;i++){
            System.out.println("N["+i+"] = "+arr[i]);
        }
    }
}
