import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=1;
        int star=(n-1)/2;
        for (int i = 0; i <n; i++) {
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*");
            }
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*");
            }
            if(i >= (n-1)/2){
                space-=2;
                star++;
            }else{
                space+=2;
                star--;
            }
            System.out.println();
        }

    }
}
