import java.util.Scanner;
public class Bubble_Sort{
    public static void main(String[] args) {

       System.out.println("enter array size:");
       Scanner S=new Scanner(System.in);
       int size=S.nextInt();
       int[] array=new int[size];
       System.out.println("enter array elements:");
       for(int i=0;i<size;i++)
       {
           array[i]=S.nextInt();
       }
        for (int i = 0; i <=size - 2; i++) {

            for (int j = 0; j <= size-2-i; j++) {
                if (array[j+1] < array[j]) {
                    // Swap array[j+1] and array[j]
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }


        }

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
        }
    }
