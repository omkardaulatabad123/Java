import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        System.out.print("Enter the number of row : ");
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int i;
        for( i=1;i<=num;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
