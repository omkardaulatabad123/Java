class node
{
    int marks;
    int rollno;
    String name;
    node next;

    node(int marks,String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        this.next=null;
    }
}
class LinkedList
{
    int size=0;
    node head;

    public void add(int marks ,String name,int rollno)
    {
        node n1= new node(marks, name , rollno);
        if(head==null)
        {
            head=n1;
            size++;
            return;              // stop here when list was empty
        }
        node temp =head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n1;
        size++;
    }
    public void show()
    {
        if (head==null)
        {
            System.out.println("The linked list is empty");
            return;
        }
        node temp=head;
        System.out.print("Linked list is ");
        while(temp!= null)
        {
            System.out.print("marks:"+temp.marks+" ");
            System.out.print("Name:"+temp.name+" ");
            System.out.print("Rollno:"+temp.rollno+" ");
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();

    }
   
    public void delete(int rollno)
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        if(head.rollno==rollno)
        {
            System.out.println("Deleted student name "+head.name+" Rollno "+head.rollno);
            head=head.next;
            size--;
            return;
        }
        node prev =head;
        node curr =head.next;
        while (curr!=null) 
        {
            if(curr.rollno==rollno)
            {
                System.out.println("Deleted student name "+curr.name+" Rollno "+curr.rollno);
                prev.next=curr.next;
                size--;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        System.out.println("Student with rollno "+rollno+" not found");
    }
    public void search(int rollno)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.rollno==rollno)
            {
                System.out.println("Student found "+temp.name+" Roll no "+temp.rollno+" marks "+temp.marks);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student with rollno "+rollno+" not found");
       
    }
    
}
public class Listing
{
    public static void main (String args[])
    {
        LinkedList l1= new LinkedList();
        l1.show();
        l1.add(99, "ramesh", 12);
        l1.add(90, "omkar", 14);
        l1.add(57, "rishi", 44);
        l1.show();
        l1.delete(12);
        l1.show();
    }
}
