package com.bichel.other.algorithms;

public class RecSortArray {
}

//my solution
class MySolution {

    public static void sortArray(int[] array, int n) {

        if(n > 0) {
            for(int i = 0; i < n; i++) {
                if(array[i] > array[n-1]) {
                    int temp = array[i];
                    array[i] = array[n-1];
                    array[n-1] = temp;
                }
            }

            sortArray(array, n-1);
        } else {
            if( n > 0 && n < array.length)
                System.out.print(array[n]);
        }

    }
}

class SuggestedSolution {

    public static void sortArray(int[] array, int n) {
        if (n==1) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        sortArray(array, n-1);
    }

    public static void main(String[] args) {
        System.out.println("Unsorted Array: ");

        int[] array = {40, 24, 60, 15, 10, 45, 93};
        //int[] array = {1,2,2,2,1};

        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");

        System.out.println("Sorted Array: ");

        sortArray(array, array.length);

        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");
    }
}
