import java.util.Scanner;

public class Pattern23 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int one=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=space ;j++){
                System.out.print("\t");
            }
            for(int j=1 ; j<=one ; j++){
                System.out.print("1\t");
            }
            System.out.println();
            space--;
            one+=2;
        }

    }
}
