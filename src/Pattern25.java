import java.util.Scanner;

public class Pattern25 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int num=1;
        int count=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=space ;j++){
                System.out.print("\t");
            }
            for(int j=1 ; j<=num ; j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
            space--;
            num+=2;
        }

    }
}
