import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=(n-1)/2;
        int star=1;
        for (int i = 0; i <n; i++) {
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*");
            }
            if(i >= (n-1)/2){
                space++;
                star-=2;
            }else{
                space--;
                star+=2;
            }
            System.out.println();
        }

    }
}
