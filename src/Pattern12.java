import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                // for !
                if(j%2==0){
                    System.out.print("! ");
                    // star
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
