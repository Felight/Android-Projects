package com.felight.myapp.utils;

/**
 * Created by vinaynoah on 18/10/16.
 */
public class SortingAlgos {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }


    public static void mergeSort(int[] a, int low, int high) {
        int n = high - low;
        if (n <= 1)
            return;
        int mid = low + n / 2;
        // recursively sort
        mergeSort(a, low, mid);
        mergeSort(a, mid, high);
        // merge two sorted subarrays
        int[] temp = new int[n];
        int i = low, j = mid;
        for (int k = 0; k < n; k++) {
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j] < a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < n; k++)
            a[low + k] = temp[k];
    }


    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    //Heap Sort

    private static int N;
    /* Sort Function */
    public static void heapSort(int array[])
    {

            heapify(array);
            for (int i = N; i > 0; i--)
            {
                swap(array,0, i);
                N = N-1;
                maxheap(array, 0);
            }



    }
    /* Function to build a heap */
    private static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }
    /* Function to swap largest element in heap */
    private static void maxheap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */
    private static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    //Quick Sort

    private int[] array;
    private int length;

    public void quickSort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        qSort(0, length - 1);
    }

    private void qSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            qSort(lowerIndex, j);
        if (i < higherIndex)
            qSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
