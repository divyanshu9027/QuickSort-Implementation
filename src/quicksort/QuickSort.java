/*
* Created by Intellij IDEA,2020
* User : divyanshu9027
* Date : 10/08/20
* Time : 9:40 AM
*
* */
package quicksort;

import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        //using enhance for loop to print the unsorted array.....
        System.out.println("\nunsorted array is:");
        for(int items:array) {
            System.out.print(items + " ");
        }
        quicksort(array,0,n-1);
        //using for loop to print the sorted array......
        System.out.println("\nsorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }

    }
    //quick sort implementation..........
    public static void quicksort(int[] array,int left,int right) {
        int index = partition(array,left,right);
        if(left<index-1) {
            quicksort(array,left,index-1);
        }
        if(index>right) {
            quicksort(array,index,right);
        }

    }
    //implementation of partition algorithm......
    public static int partition(int[] array,int left,int right) {
        int pivot = array[(left+right)/2];
        while(left<=right) {
            while(array[left]<pivot) left++;
            while(array[right]>pivot) right--;
            int temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }

        return left;
    }
}
