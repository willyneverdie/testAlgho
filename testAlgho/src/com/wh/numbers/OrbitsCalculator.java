package com.wh.numbers;

public class OrbitsCalculator {

	public String function;
	public double seed;
	public int nth; 
	
	
	
	public OrbitsCalculator(String function, double seed, int nth) {
		super();
		this.function = function;
		this.seed = seed;
		this.nth = nth;
	}

	public void run(){
		
		double value = seed;
		for(int i= 0; i< nth ; i++){
			//value = Math.sin(value);
			value = value + 1;
			System.out.println("Iteration="+i + " : "+value+"->");			
		}
	}

	public static void main(String[] args) {
		
		OrbitsCalculator ocCalculator = new OrbitsCalculator("", 0d, 100);
		ocCalculator.run();
	}

}
