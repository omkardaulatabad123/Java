import java.util.Scanner;
public class Binary1{
    static void bubblesort(int A[])
    {
        int temp=0;
        int j;
        int k;
        for( k=0;k<A.length;k++)
        {
            for(j=k+1;j<A.length;j++)
            {
                if(A[k]>A[j])
                {
                    temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int A[]=new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array : ");
        int i;
        for(i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();

        }
        System.out.println("Aray befor sort:");
        for(i=0;i<A.length;i++)
        {
            System.out.println(A[i]+"\t");
        }
        bubblesort(A);
        System.out.println("Array after sort:");
        for(i=0;i<A.length;i++)
        {
            System.out.println(A[i]+"\t");
        }
    }
}