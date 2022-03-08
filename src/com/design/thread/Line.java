package com.design.thread;

public class Line {


	public void getLine() {
		synchronized(this) {
			for (int i = 0 ; i < 5; i++) {
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Print i = " + i);
			}
		}
	}
}
