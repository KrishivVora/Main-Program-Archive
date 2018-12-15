import java.io.*;
class Node
{
    Node link;
    int data;
    Node()
    {
        data=0;
        link=null;
    }
    Node(int d,Node n)
    {
        data=d;
        link=n;
    }
}