package com.example.java_array_sorts;

/*
     * The fastest possible sort that O(N) = const*N
     * and used memory O(M)
*/
public final class CountingSort {
    private CountingSort() {
        // Do not instantiate this
    }
    private static int[] counter;
    // Preparing counter array according to expected range of values
    public static void prepare(final int valuesRange) {
        counter = new int[valuesRange];
    }

    public static void countingSort(final int[] A) {
        /* Index of an counter array item means value of the input array item
         * Value of an counter array item = number of a
         * repeating items in the input array */
        for (int i : A)
            counter[i]++;
        int n = 0;
        for (int j = 0; j < counter.length; j++)
            for (int valAmount = 0; valAmount < counter[j]; valAmount++)
                A[n++] = j;
    }
}
