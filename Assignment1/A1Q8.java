package Assignment1;

import java.util.*;

public class A1Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter "+ n +" values for array a => ");
        for (int i = 0; i < a.length; i++) 
            a[i]=input.nextInt();
        for (int i = 0; i < b.length; i++) 
            b[i]=input.nextInt();
        int[] array = returnArray(a, b);
        System.out.println("Required array => ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        input.close();
    }

    public static int[] returnArray(int a[], int b[]) {
        int c[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = (a[i] * b[i]);
        }
        return c;

    }
}