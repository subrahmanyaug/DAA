import java.util.Scanner;
public class Sequential_Search {
    public static void main(String[] args) {

       System.out.println("enter array size:");
       Scanner S=new Scanner(System.in);
       int size=S.nextInt();
       int[] array=new int[size+1];
       System.out.println("enter array elements:");
       for(int i=0;i<size;i++)
       {
           array[i]=S.nextInt();
       }
       System.out.println("enter key value to findout:");
       int k=S.nextInt();
       array[size]=k;
       int i=0;
       while (array[i]!=k)
        {
            i=i+1;
        }
       if(i<size)
       {
           System.out.println("key "+ k+" found at position "+i);
       }
       else
       {
           System.out.println("not found");
       }

        }
    }
