import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
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
