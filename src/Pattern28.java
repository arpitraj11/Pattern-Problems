import java.util.Scanner;

public class Pattern28 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int loop=1;
        for(int i=1 ; i<=n ; i++){
            int num=i;
            //space
            for(int j=1 ; j<=space ; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=loop; j++){
                System.out.print(num+" ");
                if(j<=loop/2){
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println();
            space--;
            loop+=2;
        }

    }
}
