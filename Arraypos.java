# subnet
import java.io.*;
import java.util.*;
public class Arraypos
{
  public static void main(String args[]) throws IOException
  {  int a1=0;
    int b1=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of  first array");
    int x=Integer.parseInt(br.readLine());
    int []a=new int[x] ;
    int []b=new int[x] ;
    System.out.println("Enter the element of first string");
    for(int i=0;i<x;i++)
    {
      
      a[i]=Integer.parseInt(br.readLine());
    }
    for(int i=0; i<x-1;i++)
    {
      for(int j=0;j<x;j++)
      {
        int xx=a[i]-a[j];
        
        if(xx==1 || xx== -1)
        {
          a1=a[i];
          b1=a[j];
          break;
        } 
      }
    }
    System.out.println("The element are:" +a1+"\t"+b1);
  }
}
