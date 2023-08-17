import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n;
        int star=n;
        for (int i = 0; i <2*n-1; i++) {
            //space
            for(int j=0 ; j<space ; j++){
                System.out.print("\t");
            }
            //star
            for(int j=0 ; j<star ; j++){
                System.out.print("*\t");
            }
            if(i >= n-1){
                space++;
                star++;
            }else{
                space--;
                star--;
            }
            System.out.println();
        }
    }
}
