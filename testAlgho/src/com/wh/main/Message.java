package com.wh.main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Message {

	String alghoName;
	LocalTime lt;
	int lenght;
	//int randomArray[];
	ArrayList<Integer> randomArray;
	
	public Message(String string, int i, ArrayList<Integer> list) {
		alghoName = string;
		lenght = i;
		randomArray = list;
		
	}
	
	public String getAlghoName() {
		return alghoName;
	}
	public void setAlghoName(String alghoName) {
		this.alghoName = alghoName;
	}
	public LocalTime getLt() {
		return lt;
	}
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public ArrayList<Integer> getRandomArray() {
		return randomArray;
	}

	public void setRandomArray(ArrayList<Integer> randomArray) {
		this.randomArray = randomArray;
	}


	
	
	
}
