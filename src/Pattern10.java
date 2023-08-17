import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int star=2*n-1;
        for(int i=0 ; i<n ; i++){
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print("\t");
            }
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*\t");
            }
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print("\t");
            }
            space++;
            star-=2;
            System.out.println();
        }

    }
}
