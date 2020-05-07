package com.wh.numbers;

public class Fibonacci {

	int n;
	
	
	public Fibonacci(int n) {
		super();
		this.n = n;
	}

	public int calculate() {
		//return RecursiveFibonacci(this.n);
		return DynamicFibonacci(this.n);
	}
	
	private int RecursiveFibonacci(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n>1)
			return RecursiveFibonacci(n-1) + RecursiveFibonacci(n-2);
		else
			return 0;	
	}
	
	private int DynamicFibonacci(int n) {
		
		int memo[] = new int[n];
		memo[0] = 0;
		memo[1] = 1;
		
		if(n>=2) {
			for (int i = 2; i < memo.length; i++) {
				memo[i] = memo[i-1] + memo[i-2];
			}	
		}
		return memo[n-1] + memo[n-2];
	}
	
	public static void main(String[] args) {
	
		Fibonacci fibo = new Fibonacci(49);
		
		System.out.println(fibo.calculate());
		
		
	}
}
