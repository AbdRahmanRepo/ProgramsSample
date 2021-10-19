package org.programs;

public class FacFib {
	public static void factorial() {   
		int count =1;               
		for(int i=1; i<=10; i++) {  
			count=count*i;          
		}
		System.out.println("factorial for 1 to 10 ="+  count);
	}
	public static void fibonaci() { //Adding two numbers as series 
		int a=0,b=1,c;
		System.out.println("fibonaci series");
		System.out.print(a+", ");
		System.out.print(b+", ");
		for(int i=0; i<10; i++) {
			c=a+b;                     
			System.out.print(c+", ");
			a=b;                      //Swapping
			b=c;
		}
	}
	public static void main(String[] args) {
		factorial();
		fibonaci();
	}
}
