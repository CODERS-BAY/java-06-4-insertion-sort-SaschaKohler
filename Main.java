package com.sksoft;

public class Main {

    public static void main(String[] args) {

        int[] unsorted = {5, 2, 4, 6, 1, 3,17,23,2,3,4,7,8,4};

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }

        System.out.println();

        for (int i = 1; i < unsorted.length; i++) {
            int sort = unsorted[i];
            int j = i;
            while (j > 0 && unsorted[j - 1] > sort) {
                unsorted[j] = unsorted[j - 1];
                j = j - 1;
            }
            unsorted[j] = sort;
        }

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }


    }
}
