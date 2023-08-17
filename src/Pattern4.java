import java.util.*;
public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        for(int i=1 ; i<=n ; i++){
            //for space
            for(int j=1 ; j<=sp ; j++){
                System.out.print("\t");
            }
            //for star
            for(int j=1  ; j<=i; j++){
                System.out.print("*\t");
            }
            sp--;
            System.out.println();
        }

    }
}
