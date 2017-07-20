# subnet
import java.io.*;
import java.util.*;
public class Subnet
{
  public static void main(String args[]) throws IOException
  {
     String a1,a2;
  boolean c;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of  first array");
  int x=Integer.parseInt(br.readLine());
  System.out.println("Enter the element of first string");
  List<String> l1= new ArrayList<String>();
  for(int i=0;i<x;i++)
  {
    a1=br.readLine();
      l1.add(a1);
  }
  System.out.println("Enter the size of  second array");
  int y=Integer.parseInt(br.readLine());
  System.out.println("Enter the element of second string");
  List<String> l2= new ArrayList<String>();
  for(int i=0;i<y;i++)
  {
    a2=br.readLine();
    l1.add(a2);
  }  
     if(x<y)
     {
      c=l2.containsAll(l1);
          }
          else
          {
            c=l1.containsAll(l2);
            }
            if(c==true)
            {
              System.out.println(" a1 is the subset of a2");
              }
              else
              {
                System.out.println("a2 is the subset of a1");
                }
                }
                }
