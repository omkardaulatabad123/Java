import java.lang.*;
class bubblesort{
    public static void main(String args[]){
        int A[]={12,3,5,6,0,1,13,2,10,15};
        int temp=0;
        
        for (int k=0;k<A.length;k++)
        {
            for (int j=k+1;j<A.length;j++)
            {
                if (A[k]>A[j])
                {
                    temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;
                }
            }
        }   
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"\t");
        }
    }
}