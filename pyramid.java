package org.programs;

public class pyramid {
    public static void main(String[] args) {
        asc();
    }

    public static void desc() {
        for (int row = 10; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void asc(){
        for(int i=1;i<10;i++){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
