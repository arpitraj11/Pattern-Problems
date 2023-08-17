import java.util.Scanner;

public class Pattern32 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int loop=1;
        for(int i=1 ; i<=2*n-1 ; i++){
            //num
            for(int j=0 ; j<loop ; j++){
                if(j%2==0){
                    System.out.print(num+"\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if(i<n) {
                num++;
                loop+=2;
            }
            else {
                num--;
                loop-=2;
            }

        }

    }
}
