import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        for (int i = 0; i <2*n-1; i++) {
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*");
            }
            if(i >= n-1){
                space++;
                star--;
            }else{
                space--;
                star++;
            }
            System.out.println();
        }

    }
}
