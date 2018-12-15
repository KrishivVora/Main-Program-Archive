import java.util.*;
import java.io.*;
public class names_txt
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw=new FileWriter("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\names.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw); 
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of students.");
        int N=sc.nextInt();
        String S="";
        System.out.println("Enter the names of students one by one.");
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
        FileReader fin=new FileReader("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\names.txt");
        BufferedReader bin=new BufferedReader(fin);
        String str="";
        System.out.println("\fThe file contains the following data:");
        for(int cnt=0; cnt<N; cnt++)
        {
            str=bin.readLine().toUpperCase();
            System.out.println(str);
        }
    }
}