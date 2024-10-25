package org.programs;

public class AscDesOrders {
    public static void main(String[] args) {
        ascendingOrder();
        descendingOrder();
    }

    private static void ascendingOrder() {
        int temp;
        int a[] = {10, 100, 200, 40, 20};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        int maximumnumber = a[a.length - 1];
        System.out.println("maximum number is " + maximumnumber);
        int minimumnumber = a[0];
        System.out.println("maximum number is " + minimumnumber);
        int thirdMaxNum = a[a.length - 3];
        System.out.println("maximum number is " + thirdMaxNum);
        int thirdMinNum = a[a.length - 1];
        System.out.println("maximum number is " + thirdMinNum);

    }

    private static void descendingOrder() {
        int temp;
        int a[] = {10, 100, 200, 40, 20};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Descending Order");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
