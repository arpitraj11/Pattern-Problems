import java.util.Scanner;

public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-1-2;
        for(int i=1 ; i<=n ; i++){
            //star
            for(int j=1 ; j<=star ; j++){
                System.out.print("*\t");
            }
            //space
            for(int j=1 ; j<=space ; j++){
                System.out.print("\t");
            }
            //star
            if(i==n) star--;
            for(int j=1 ; j<=star ; j++){
                System.out.print("*\t");
            }
            System.out.println();
            star++;
            space-=2;
        }

    }
}
