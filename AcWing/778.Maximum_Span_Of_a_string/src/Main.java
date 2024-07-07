import java.util.Scanner;
/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        String s1 = s[1];
        String s2 = s[2];
        int maxSpan = s[0].lastIndexOf(s2)-s[0].indexOf(s1)-s1.length();
        if(s[0].lastIndexOf(s2)!=-1&&s[0].indexOf(s1)!=-1&&maxSpan>=0)
        {
            System.out.println(maxSpan);
        }else{
            System.out.println(-1);
        }
    }
}
