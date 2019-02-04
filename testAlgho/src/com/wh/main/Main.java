package com.wh.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.wh.utilities.Utilities;

public class Main {

	
	
	public static int[] getRandomArray(int large) {
		
		return Utilities.RandomArray(large);
	}

	public static ArrayList<Integer>getRandomArrayList(int large) {
		
		return Utilities.RandomArrayList(large);
	}

	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		
		ExecutorService service = null;	
		List<Future<Integer>> resultList = new ArrayList<>();
		List<ArrayList<Integer>> arrayList = new ArrayList<>();
		
		//1. Create ramdon arrays
		for(int k=0;k<8; k++) {
			arrayList.add( getRandomArrayList((int)Math.pow(10, k)));
			//System.out.println(arrayList.get(k));
		}
		
		
		
		//2. Execute alghorithm
		service = Executors.newFixedThreadPool(30);
		
		for(int i=1; i<=10; i++) {
			Message message = new Message("SelectionSort", i, arrayList.get(i-1));
			Future<Integer> result = service.submit(new OrderExecutor(message));
			resultList.add(result);
		}
		
		//3. Save the responses
		//4. Show responses
		
		
		
		
		
		
		
		/*
		Future<Integer> result = service.submit(() -> 30+11);
		Future<Integer> result2 = service.submit(() -> 30+12);
		Future<Integer> result3 = service.submit(() -> 30+13);
		Future<Integer> result4 = service.submit(() -> 30+14);
		
		System.out.println(result.get());
		System.out.println(result2.get());
		System.out.println(result3.get());
		System.out.println(result4.get());*/
	}
	
}
