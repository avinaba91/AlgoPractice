package com.design.thread;

public class TestThread {

	public static void main(String[] args) {
		Line line = new Line();
		Train train1 = new Train(line);
		Train train2 = new Train(line);
		
		train1.start();
		train2.start();
		
	}
}
