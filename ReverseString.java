package org.programs;

public class ReverseString {
	public static void main(String[] args) {
//		reverseString();
//		reverseOfEachWordInStrin();
		reverse();
	}
	private static void reverseString() {
		String s = "Welcome";
		String reverse = " ";  //e
		for (int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);   //charAt(6) --- e
		}
		System.out.println("Reverse  of word : "+reverse);
	}
	private static void reverseOfEachWordInStrin() {
		String s = "Welcome to java";   //
		String[] split = s.split(" ");  //
		String reverseString = "";
		                               //welcome,to,java
		for (String x : split) {       //welcome
			String reverseword = "";   //emoclew  ot avaj
			for (int i = x.length()-1; i>=0; i--) {         
				reverseword = reverseword + x.charAt(i);
			}reverseString = reverseString + reverseword + " ";
		}
		System.out.println("Original String = "+ s);
		System.out.println("Reverse String = "+reverseString);

	}

	private static void reverse(){
		String str = "Welcome";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}
	

}
