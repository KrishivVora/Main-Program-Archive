import java.io.*;
import java.util.*;
public class file_menu
{   Scanner sc=new Scanner(System.in);
    public void filewrite() throws IOException
    {
        System.out.println("Enter name of file");
        String s=sc.next();
        System.out.println("Enter number of records");
        int n=sc.nextInt();
        FileWriter fout= new FileWriter("D:\\"+s+".txt", true);
        BufferedWriter bout= new BufferedWriter(fout);
        PrintWriter pout= new PrintWriter(bout);
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        for(int i=0; i<=n; i++)
        {
            String g=br.readLine();
            pout.println(g);
        }
        pout.flush();
        fout.close();
        bout.close();
        pout.close();
    }
    public void readfile()throws IOException
    {
        System.out.println("Enter name of file");
        String s=sc.next();
        FileReader fin= new FileReader("D:\\"+s+".txt");
        BufferedReader bin= new BufferedReader(fin);
        String str= new String();
        while((str=bin.readLine())!=null)
        {
            System.out.println(str);
        }
        bin.close();
        fin.close();
    }
    public void copyfile()throws IOException
    {
        System.out.println("Enter name of file");
        String s1=sc.next();
        FileWriter fout= new FileWriter("D:\\"+s1+".txt", true);
        BufferedWriter bout= new BufferedWriter(fout);
        PrintWriter pout= new PrintWriter(bout);
        System.out.println("Enter name of file to be copied");
        String s=sc.nextLine();
        FileReader fin= new FileReader("D:\\"+s+".txt");
        BufferedReader bin= new BufferedReader(fin);
        String str= new String();
        while((str=bin.readLine())!=null)
        {
            pout.println(str);
        }
        bin.close();
        fin.close();
        bout.flush();
        pout.close();
    }
    public void deleteRecords() throws IOException
    {
        System.out.println("Enter file to be read");
        String s=sc.next();
        System.out.println("Enter records to be deleted");
        InputStreamReader obj= new InputStreamReader(System.in);
        BufferedReader k= new BufferedReader(obj);
        String del=k.readLine();
        FileReader fin= new FileReader("D:\\"+s+".txt");
        BufferedReader bin= new BufferedReader(fin);
        String i="";
        String str= new String();
        while((str=bin.readLine())!=null)
        {
            if(del.equalsIgnoreCase(str)==false)
            {
                i+=str+"*";
            }
        }
        FileWriter fout= new FileWriter("D:\\"+s+".txt");
        BufferedWriter bout= new BufferedWriter(fout);
        PrintWriter pout= new PrintWriter(bout);
        StringTokenizer b= new StringTokenizer(i, "*");
        while(b.hasMoreTokens())
        {
            pout.println(b.nextToken());
        }
        bout.flush();
        pout.close();
        bin.close();
    }
    public void deletefile()
    {   String s= new String();
        System.out.println("Enter file to be deleted");
        s=sc.nextLine();
        String s1="D:\\"+s+".txt";
        File f= new File(s1);
        f.delete();
    }
    public void insertrecords()throws IOException
    { 
        filewrite();
    }
    public void mergefile()throws IOException
    {   
        System.out.println("Enter files to be merged");
        String s1= sc.next();
        String s2= sc.next();
        FileReader f1= new FileReader("D:\\"+s1+".txt");
        BufferedReader b1= new BufferedReader(f1);
        FileReader f2= new FileReader("D:\\"+s2+".txt");
        BufferedReader b2= new BufferedReader(f2);
        FileWriter f= new FileWriter("D:\\"+s1+s2+".txt");
        BufferedWriter b=new BufferedWriter(f);
        PrintWriter p=new PrintWriter(b);
        String str1="",str2="";
        while((str1=b1.readLine())!=null)
        {
            p.println(str1);
        }
        while((str2=b2.readLine())!=null)
        {
            p.println(str2);
        }
        b.flush();
        f.close();
        p.close();
        f1.close();
        f2.close();
        b1.close();
        b2.close();
    }
    public void rename() throws IOException
    {   System.out.println("Enter file to be renamed");
        String s= sc.next(); 
        System.out.println("Enter new name for file");
        String s1= sc.next();
        String name1="D:\\"+s+".txt";
        String name2="D:\\"+s1+".txt";
        File f1=new File(name1);
        File f2= new File(name2);
        f1.renameTo(f2);
    }
    public void sort2()throws IOException
    {   System.out.println("Enter name of file");
        String s=sc.next();
        FileReader fin= new FileReader("D:\\"+s+".txt");
        BufferedReader bin= new BufferedReader(fin);
        String str= new String(); String ns=new String(); 
        while((str=bin.readLine())!=null)
        { 
            ns+=str+"*";
        }
        StringTokenizer st= new StringTokenizer(ns,"*");
        String a[]=new String[st.countTokens()];int n=0;
        while(st.hasMoreTokens())
        {
            a[n]=st.nextToken();
            n++;
        }
        String temp="";
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            { 
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        FileWriter f=new FileWriter("D:\\"+s+".txt");
        BufferedWriter b=new BufferedWriter(f);
        PrintWriter p= new PrintWriter(b);
        for(int i1=0; i1<a.length; i1++)
        {
            p.println(a[i1]);
        }
        b.flush();
        f.close();
        p.close();
    }
    public void main() throws IOException
    {   
        System.out.println("Enter your choice");
        System.out.println("1.Create file 2.Read a file 3.Copy a file 4.Delete records 5.Delete file 6.Insert records 7.Merge a file 8.Sort a file 9.Rename file 10.Exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
            {
                filewrite();
                System.out.println("File has been created");
                break;
            }
            case 2: 
            {
                readfile();
                break;
            }
            case 3: 
            {
                copyfile();
                break;
            }
            case 4: 
            {
                deleteRecords();
                break;
            }
            case 5: 
            {
                deletefile();
                break;
            }
            case 6: 
            {
                insertrecords();
                break;
            }
            case 7:
            {
                mergefile();
                break;
            }
            case 8: 
            {
                sort2();
                System.out.println("File has been sorted");
                break;
            }
            case 9: 
            {
                rename();
                break;
            }
            case 10: 
            {
                System.out.println("Program terminated");
                System.exit(0);
            }
            default: System.out.println("Enter numbers from 1 to 10 only");
        }
    }
}