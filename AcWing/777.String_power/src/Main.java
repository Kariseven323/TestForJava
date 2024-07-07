import java.util.Scanner;

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(".".equals(s)){
                break;
            }

            int n = s.length();
            for(int i =1;i<=n;i++){
                if(n%i==0){
                    String str =s.substring(0,i);
                    String r = "";
                    for(int j = 0;j<n/i;j++){
                        r+=str;
                    }
                    if(r.equals(s)){
                        System.out.println(n/i);
                        break;
                    }
                }
            }
        }
    }
}
