package ph.edu.sorsu.sorting.impl;

import ph.edu.sorsu.sorting.SortAlgorithm;

public class InsertionSortAlgorithm implements SortAlgorithm {
    
    @Override
    public void sort(int[] myArray) {
        System.out.println("Applying Insertion Sort Algorithm.");

        for (int i = 1; i < myArray.length; i++) {
            int ai = myArray[i],j;

           for (j = i; j > 0 && myArray[j - 1] > ai; j--) {
            myArray[j] = myArray[j - 1];
           }
           myArray[j] = ai;
        }
        
        //printing Sorted Array...
        System.out.println("Sorted Array...");

        for (int num:myArray){
            System.out.printf("%s ", num);
        }
        System.out.println();
    }  
}
