import java.util.*;
import java.io.*;
public class Admission_txt
{
    int N=0;
    int flag=0;
    Scanner sc=new Scanner(System.in);
    public void input() throws IOException
    {
        FileWriter fw;
        if(flag==0)
        fw=new FileWriter("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\admission.txt", false);
        else
        fw=new FileWriter("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\admission.txt", true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw); 
        System.out.println("\fEnter the number of students.");
        N=sc.nextInt();
        String S="";
        System.out.println("Enter the names of students one by one, along with their stream.");
        System.out.println("For example,");
        System.out.println("Raju Shah   Science");
        for(int cnt=0; cnt<=N; cnt++)
        {
            S=sc.nextLine();
            if(cnt==0)
            continue;
            pw.println(S);
        }
        pw.flush();
        fw.close();
        bw.close();
        pw.close();
    }
    public void main(String args[]) throws IOException
    {   System.out.println("Enter the operation you would like to perform:");
        System.out.println("Press 1 to create file:");
        System.out.println("Press 2 to add records to file:");
        if(sc.next().charAt(0)=='2')
        flag++;
        input();
        FileReader fin=new FileReader("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\admission.txt");
        BufferedReader bin=new BufferedReader(fin);
        String str="";
        System.out.println("\fThe file contains the following data:");
        for(int cnt=0; cnt<N; cnt++)
        {
            str=bin.readLine();
            System.out.println(str);
        }
    }
}