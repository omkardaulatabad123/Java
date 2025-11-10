class queue
{
    int front;
    int rear;
    int count;
    int queueArray[];
    int maxsize;

    queue(int size)
    {
        maxsize=size;
        rear=-1;
        front=0;
        count=0;
        queueArray=new int[maxsize];
    }
    public void enQueue(int val)
    {
        if (rear==maxsize-1)
        System.out.println("Queue is full..");
        else
        {
            rear=(rear+1)%maxsize;
            queueArray[rear]=val;
            System.out.println(val+" is being added to Queue...");
            count++;
        }
    }
    public void deQueue()
    {
        if (rear==-1)
        System.out.println("Queue is empty...");
        else
        {
            System.out.println(queueArray[front]+" is being removed...");
            front=(front+1)%maxsize;
            count--;

        }
    }
    public void display()
    {
        if ((rear==-1)) 
        {
            System.out.println("Queue is empty...");  
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                int index=(front+1)%maxsize;
                System.out.println(queueArray[index]+" remains..");
            }
        }
    }
}
public class QueueDemo {

    public static void main(String[] args) 
    {
        queue q1=new queue(5);
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.enQueue(60);


        q1.deQueue();
        q1.deQueue();

        q1.display();
    }
}
