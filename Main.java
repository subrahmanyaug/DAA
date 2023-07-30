import java.util.Scanner;
public class Main {
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
            int min = i;
            for (int j = i + 1; j <= size-1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // Swap array[i] and array[min]
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
        }
    }
