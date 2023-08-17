import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<i ; j++){
                System.out.print("  ");
            }
            for(int j=i ; j<n ; j++){
                System.out.print(j+" ");
            }
            System.out.print(0+" ");
            for(int j=n-1 ; j>=i ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
