package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int x= sc.nextInt();
		
		System.out.print("Enter the power N = ");
		int n= sc.nextInt();
		
		int result=calculatePower(x,n);
		System.out.print("X power N is: " + result);
		
	}

	private static int calculatePower(int x, int n) {
       if (n==0) {
    	   return 1; // Anything to the power of 0 is 1
       }
       else {
    	  return x * calculatePower(x,n-1);
       }
        
	}

}
