import java.util.Scanner;

public class Pattern22 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int space=-1;
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
            for(int j=1 ; j<=star ; j++){
                if(j<n){
                    System.out.print("*\t");
                }
            }
            System.out.println();
            star--;;
            space+=2;
        }

    }
}
