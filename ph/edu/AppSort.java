package ph.edu;

import ph.edu.sorsu.sorting.impl.BubbleSortAlgorithm;
import ph.edu.sorsu.sorting.impl.InsertionSortAlgorithm;
import ph.edu.sorsu.sorting.impl.MergeSortAlgorithm;
import ph.edu.sorsu.sorting.impl.SelectionSortAlgorithm;

public class AppSort {
    public static void main(String[] args) {
    int[] myArray = {-5, -10, -15, -20, -25, -30, 35, -40};

    System.out.println("Unsorted array ...");

    
        for (int num : myArray) {
            System.out.printf("%s ", num);
        }

        System.out.println();
        System.out.println();

    

        long bubbleSortStartTime = System.nanoTime();
        bubbleSort(myArray); // Sort using bubble sort algorithm and display its result...
        long bubbleSortEndTime = System.nanoTime();
        System.out.println("Bubble Sort Time Execution is " + (bubbleSortEndTime - bubbleSortStartTime) + " nanoseconds.");
        System.out.println();

        long selectionSortStartTime = System.nanoTime();
        selectionSort(myArray); // Sort using selection sort algorithm and display its result...
        long selectionSortEndTime = System.nanoTime();
        System.out.println("Selection Sort Time Execution is " + (selectionSortEndTime - selectionSortStartTime) + " nanoseconds.");
        System.out.println();

        long insertionSortStartTime = System.nanoTime();
        insertionSort(myArray); // Sort using insertion sort algorithm and display its result...
        long insertionSortEndTime = System.nanoTime();
        System.out.println("Insertion Sort Time Execution is " + (insertionSortEndTime - insertionSortStartTime) + " nanoseconds.");
        System.out.println();

        long mergeSortStartTime = System.nanoTime();
        System.out.println("Processing Merge Sort Algorithm ...");
        mergeSort(myArray, 0, myArray.length); // Sort using the merge sort algorithm and display its result...
        // Print the sorted array.
        System.out.println("Sorted array ...");

        for (int num : myArray) {
            System.out.printf("%s ", num);
        }

        System.out.println();

        long mergeSortEndTime = System.nanoTime();
        System.out.println("Merge Sort Time Execution is " + (mergeSortEndTime - mergeSortStartTime) + " nanoseconds.");
        System.out.println();
    }

    private static void mergeSort(int[] myArray, int i, int length) {
        MergeSortAlgorithm mergeSort = new MergeSortAlgorithm();
        mergeSort.sort(myArray);
        
    }

    private static void bubbleSort(int[] myArray) {
        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        bubbleSort.sort(myArray);
    }
    private static void insertionSort(int[] myArray) {
        InsertionSortAlgorithm insertionSort = new InsertionSortAlgorithm();
        insertionSort.sort(myArray);
    }

    private static void selectionSort(int[] myArray) {
        SelectionSortAlgorithm selectionSort = new SelectionSortAlgorithm();
        selectionSort.sort(myArray);
    }

}