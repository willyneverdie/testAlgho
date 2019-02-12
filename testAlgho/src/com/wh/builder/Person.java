package com.wh.builder;

public class Person {
	
	private String firstName; //required
	private String lastName;  //required
	private int ssn;		  //optional
	private int age;		  //optional
	
	public static class Builder {
		
		private String firstName; //required
		private String lastName;  //required
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		private int ssn;		  //optional
		private int age;		  //optional
		
		public Builder ssn(int ssn) {
			this.ssn = ssn;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	public Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.ssn = builder.ssn;
		this.age = builder.age;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.ssn + " " + this.age;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person.Builder("Williams", "Herrera Lopizic").ssn(654321).age(34).build();
		System.out.println(p);
	
	}
}
