import java.util.Scanner;
public class arm{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check wheter the number is armstrong: ");
        int num=sc.nextInt();
        int temp= num;
        int armstrong =0;
        while(num!=0)
        {
            int digit = num%10;
            armstrong =armstrong + digit *digit *digit;
            num = num/10;
            
        }
        {
        if(temp==armstrong)
        
            System.out.println("Then number is amstrong;)");
        else
            System.out.println("The number given is not an amstrong:(");
        }
    }
}
