package com.in28minuts.microservices.limitsservice.bean;

public class Limits {
	
	private int maximum;
	private int minimum;
	
	public Limits() {
		super();
	}
	
	public Limits(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
