package ph.edu.sorsu.sorting.impl;

import ph.edu.sorsu.sorting.SortAlgorithm;

public class SelectionSortAlgorithm implements SortAlgorithm {

    @Override
    public void sort(int[] myArray) {

        System.out.println("Applying Selection Sort Algorigthm...");

        for (int i = myArray.length - 1; i > 0; i--){
        int m = 0;

        for (int j = 1; j <= i; j++) {
            if (myArray[j] > myArray[m]) {
                m = j;
            }
        }
        swap(myArray ,i ,m);
    }

    //printing sorted Array..
    System.out.println("Sorted Array..");

    for (int num: myArray) {
        System.out.printf("%s ", num);
    }
 }
    //Method for Swaping numbers from each elements.. 
    private void swap(int[] myArray, int i, int m) {
        int temp = myArray[m];
        myArray[m] = myArray[i];
        myArray[i] = temp;
    }
}
