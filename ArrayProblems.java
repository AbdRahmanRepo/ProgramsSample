package org.programs;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {
//        crateAndInitializeArray();
//        finalLargestNumberInArray();
//        sumOfAllElementsInArray();
//        sortArray();
//        removeElementFromArray();
//        mergeArray();
        reverseArray();
    }


    public static void crateAndInitializeArray() {
        int[] arr = {2, 5, 18, 92, 1, 33, 5, 29, 13};
        for (int num : arr) {
            System.out.println("Value is : " + num);
        }
    }

    public static void finalLargestNumberInArray() {
        int[] arr = {2, 5, 18, 92, 1, 33, 5, 29, 13, 152, 200, 112};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Largest Number is : " + max);

    }

    public static void sumOfAllElementsInArray() {
        int[] arr = {2, 5, 18, 92, 1, 33, 5, 29, 13, 152, 200, 112};
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum of all elements in array is : " + sum);
    }

    public static void sortArray() {
        int[] arr = {2, 120, 101, 59, 5, 18, 92, 1, 33, 5, 29, 13, 152, 200, 112};
//        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println("Sorted Array is : " + num);
        }

    }

    public static void removeElementFromArray() {
        int[] arr = {2, 120, 101, 59, 5, 18, 92, 1, 33, 5, 29, 13, 152, 200, 112};
        int[] newArr = new int[arr.length - 1];
        int target = 4;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (target == i) {
                continue;
            }
            newArr[k++] = arr[i];
        }
        for (int num : newArr) {
            System.out.println(num);
        }

    }

    public static void mergeArray(){
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] mergedArr = new int[array1.length+array2.length];

        System.arraycopy(array1, 0, mergedArr, 0, array1.length);
        System.arraycopy(array2, 0, mergedArr, array1.length, array2.length);

        // Arrays.copyOf(original, original.length);

        System.out.println("Merged Array : "+Arrays.toString(mergedArr));
    }

    public static void reverseArray(){
        int[] arr = {2, 120, 101, 59, 5, 18, 92, 1, 33, 5, 29, 13, 152, 200, 112};
        for(int i=arr.length -1 ;i>=0;i--){
            System.out.println(arr[i]);
        }
    }




}
