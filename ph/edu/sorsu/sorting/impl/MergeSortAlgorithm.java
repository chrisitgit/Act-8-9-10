package ph.edu.sorsu.sorting.impl;

import ph.edu.sorsu.sorting.SortAlgorithm;

public class MergeSortAlgorithm implements SortAlgorithm {

    @Override
    public void sort(int[] myArray) {

        for (int i = myArray.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    swap(myArray, j, j + 1);
                   }    
                }
            }
        }
    //Method for Swaping numbers from each elements.. 
    private void swap(int[] myArray, int j, int i) {
        if (i == j) {
            return;
        }
        int temp = myArray[j];
        myArray[j] = myArray[i];
        myArray[i] = temp;
    }
        
    }