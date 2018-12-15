import java.util.*;
public class Student_Report
{
    String name;
    int age, m1 ,m2 ,m3, m4, max;
    double avg;
    Student_Report(String n, int a, int b, int c, int d, int e)
    {
        m1=a;
        m2=b;
        m3=c;
        m4=d;
        age=e;
        name=n;
    }
    public void compute()
    {
        avg=(m1+m2+m3+m4)/4;
        int x=0;
        x=Math.max(m1,m2);
        x=Math.max(x,m3);
        x=Math.max(x,m4);
        max=x;
    }
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Marks in subjects:-");
        System.out.println("Astronomy:"+m1);
        System.out.println("Physics:"+m2);
        System.out.println("Engineering:"+m3);
        System.out.println("Computers:"+m4);
        System.out.println("Highest Marks:"+max);
        System.out.println("Average Marks:"+avg);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, marks for 4 subjects and age.");
        String n1=sc.next();
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int c1=sc.nextInt();
        int d1=sc.nextInt();
        int e1=sc.nextInt();
        Student_Report ob=new Student_Report(n1, a1, b1, c1, d1, e1);
        ob.compute();
        ob.display();
    }
}