package org.programs;

public class MinAndMax {
	public static void minValue() {
		int num[] = {40,300,20,200,100,30};
		int min=num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("minimum value is"+min);
    }
	public static void maxValue() {
		int num[] = {40,300,20,200,100,30};
		int max=num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("minimum value is"+max);
	}
public static void main(String[] args) {
		minValue();
		maxValue();
	}
}
