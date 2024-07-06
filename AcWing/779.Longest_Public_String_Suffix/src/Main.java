import java.util.Scanner;

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String[] strs = new String[n];
            for (int i = 0; i < n; i ++ ) {
                strs[i] = sc.next();
            }

            StringBuilder res = new StringBuilder("");
            for (int i = 0; i < strs[0].length(); i ++ ) {
                char c = strs[0].charAt(strs[0].length() - 1 - i);
                boolean flag = true;
                for (int j = 1; j < n; j ++ ) {
                    if (i >= strs[j].length() || strs[j].charAt(strs[j].length() - 1 - i) != c) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res.append(c);
                } else {
                    break;
                }
            }

            res.reverse();
            System.out.println(res);
        }
    }
}