import java.util.Scanner;

public class Pattern27 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1 ; i<=n ; i++){
            //for space
            for(int j=1 ; j<=space ;j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }

            // Print increasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j+"\t");
            }
            System.out.println();
            space--;
        }

    }
}
