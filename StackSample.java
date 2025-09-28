class Stack
{
    int maxsize;
    int StackArr[];
    int top;
    Stack(int size)
    {
        maxsize=size;
        StackArr=new int[maxsize];
        top=-1;
    }
    public void push(int val)
    {
        if (top==maxsize-1)
        System.out.println("Stack overflow");
        else
        {
            StackArr[++top]=val;
            System.out.println(val+"is pushed in stack");
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack under flow");
            return -1;
        }
        else
        {
            System.out.println(StackArr[top]+"is poped from stack");
            return StackArr[top--];
        }
    }
    public void display()
    {
        if (top==-1)
        System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack element are: ");
            for(int i=0;i<=top;i++)
            {
                System.out.println(StackArr[i]+"\t");
            }
        }
    }
}
public class StackSample {

    public static void main(String[] args) 
    {
        Stack st =new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.pop();
        st.display();



    }
}