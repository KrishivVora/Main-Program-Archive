import java.util.*;
class TestLink
{
    Node head;
    TestLink()
    {
        head=null;
    }
    void addbeg(int r)
    {
        Node ob=new Node(r,head);
        head=ob;
    }
    void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("****No Link List Found****");
        }
        else
        {
            System.out.println("Data\t Link");
            while(temp!=null)
            {
                System.out.println(temp.data+"\t"+temp.link);
                temp = temp.link;
            }
        }
    }
    void addend(int r)
    {
        Node ob=new Node(r,null);
        if(head==null)
        {
            head=ob;
        }
        else
        {
            Node temp=head;
            while(temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link=ob;
        }
    }
    void insertat(int n,int r)
    {
        boolean flag=false;
        if(head==null)
        {
            System.out.println("List does not exist");
        }
        else
        {
            Node temp=head;
            for(int i=0;i<n-1;i++)
            {
                temp=temp.link;
                if(temp==null)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                Node ob=new Node(r,temp.link);
                temp.link=ob;
            }
            else
            {
                System.out.println("****Node not found****");
            }
        }
    }
    void delete(int r)
    {
        boolean flag=false;
        if(head==null)
        {
            System.out.println("List does not exist");
        }
        else if(head.data==r)
        {
            head=head.link;
        }
        else
        {
            Node pre=null;
            Node next=head;
            while(next!=null)
            {
                if(next.data==r)
                {
                    pre.link=next.link;
                    flag=true;
                    System.out.println("Deleted");
                    break;
                }
                else
                {
                    pre=next;
                    next=next.link;
                }
            }
            if(flag==false)
            {
                System.out.println("****"+r+"****");
            }
        }
    }
    int count()
    {
        Node temp=head;
        int cnt=0;
        if(temp==null)
        {
            System.out.println("****No link list found****");
        }
        else
        {
            while(temp!=null)
            {
                cnt++;
                temp=temp.link;
            }
            System.out.println("List has "+cnt+" elements");
        }
        return cnt;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        TestLink te = new TestLink();
        boolean repeat;
        do
        {
            System.out.println("Choose a function:");
            System.out.println("1 - Add a node to the beginning of the LinkedList.");
            System.out.println("2 - Add a node to the end of the LinkedList.");
            System.out.println("3 - Insert a node at any point of the LinkedList.");
            System.out.println("4 - Delete a node from the LinkedList.");
            System.out.println("5 - Count the number of elements in the LinkedList.");
            System.out.println("6 - Display the LinkedList.");
            int y = sc.nextInt();
            repeat = false;
            switch(y)
            {
                case 1:
                {
                    System.out.println("Enter the value to be added.");
                    int r = sc.nextInt();
                    te.addbeg(r);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the value to be added.");
                    int r = sc.nextInt();
                    te.addend(r);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the value to be added and the location where it should be inserted.");
                    int r = sc.nextInt();
                    int n = sc.nextInt();
                    te.insertat(n,r);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the value to be deleted.");
                    int r = sc.nextInt();
                    te.delete(r);
                    break;
                }
                case 5:
                {
                    te.count();
                    break;
                }
                case 6:
                {
                    te.display();
                    break;
                }
                default:
                {
                    System.out.println("Wrong input.");
                }
            }
            System.out.println("Press y to rerun.");
            char c = sc.next().charAt(0);
            if(c == 'y' || c == 'Y')
            {
                repeat = true;
            }
        }
        while(repeat);
    }
}