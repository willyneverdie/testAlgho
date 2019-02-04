package com.wh.main;

import java.util.concurrent.Callable;

import com.wh.sort.SelectionSort;

public class OrderExecutor implements Callable{

	Message message;
	
	public OrderExecutor(Message message) {
		super();
		this.message = message;
	}


	@Override
	public Object call() throws Exception {

		System.out.println(getMessage().getAlghoName());
		switch(getMessage().getAlghoName()) {
		case "SelectionSort": 
				System.out.println("AQUI INICIO");
				new SelectionSort(message.getRandomArray(), message.randomArray.size(), true);
				System.out.println("AQUI FIN");
			break;
		case "MergeSort": 
			
			break;
		case "QuickSort": 
			
			break;
		}
		
		return null;
	}




	public Message getMessage() {
		return message;
	}




	public void setMessage(Message message) {
		this.message = message;
	}








	
	
}
