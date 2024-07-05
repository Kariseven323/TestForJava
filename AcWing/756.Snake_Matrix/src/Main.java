import java.util.Scanner;

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr= new int[n][m];
        int []dx = {-1, 0, 1, 0};
        int []dy = {0, 1, 0, -1};
        int x=0,y=0,d =1;
        for(int i=1;i<=n*m;i++){
            arr[x][y] = i;
            int a = x+dx[d],b=y+dy[d];
            if(a<0||a>=n||b<0||b>=m||arr[a][b]>0){
                d = (d+1)%4;
                a=x+dx[d];
                b=y+dy[d];
            }
            x=a;
            y=b;
        }
        for(int[] row:arr){
            for(int val:row){
                System.out.printf("%d ",val);
            }
            System.out.println();
        }
    }
}
