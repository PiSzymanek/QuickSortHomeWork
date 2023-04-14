package pl.szymanek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] notSortedArray = {20,2,31,254,123,12,3,4,5,6,7,8,123,1251,6788,123,60,0};
        quickSort(notSortedArray, 0, notSortedArray.length - 1);
        for (double s : notSortedArray) {
            System.out.println(s);
        }
    }

    public static void quickSort(int[] notSortedArray, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int half = partitions(notSortedArray, startIndex, endIndex);

            quickSort(notSortedArray, startIndex, half - 1);
            quickSort(notSortedArray, half + 1, endIndex);
        }

    }

    public static int partitions(int[] notSortedArray, int startIndex, int endIndex) {
        int currentIndex = startIndex;
        int placeholder;
        int pivot = notSortedArray[endIndex];
        int swapMarker = startIndex - 1;
        while (currentIndex < endIndex + 1) {
            if (notSortedArray[currentIndex] <= pivot) {
                swapMarker++;
                if (notSortedArray[currentIndex] < notSortedArray[swapMarker]) {
                    placeholder = notSortedArray[currentIndex];
                    notSortedArray[currentIndex] = notSortedArray[swapMarker];
                    notSortedArray[swapMarker] = placeholder;
                }
            }
            currentIndex++;
        }
        return swapMarker;
    }


}






