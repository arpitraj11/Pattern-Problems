import java.util.Scanner;

public class Pattern29 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int izero=-1;
        int space=n-1;
        for(int i=1 ; i<=n ; i++){
            //for space
            for(int j=1 ; j<=space ;j++){
                System.out.print("\t");
            }
            //for inner num
            System.out.print(i+"\t");

            //for inner zero
            for(int j=1 ; j<=izero ; j++){
                System.out.print("0\t");
            }

            // Print outer numbers
            if(i>1){
                System.out.print(i+"\t");
            }
            System.out.println();
            space--;
            izero+=2;
        }

    }
}
