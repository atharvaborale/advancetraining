package com.SimpliLearn;

public class TwoNumber {
	  public static void main(String[] args) {

	int count =14,num1=1,num2=3;
	   System.out.println("Fibonacci Series of"+ count + "numbers");
	   for(int i=0; i<=count;++i) {
		   System.out.print(num1+ " ");
		   int sumOfPrevTwo = num1 + num2;
		   num1 = num2; num2 = sumOfPrevTwo;
		   
	   }
	  }
}

	


