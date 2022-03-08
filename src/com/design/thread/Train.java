package com.design.thread;

public class Train extends Thread {
	
	private Line line = null;
	
	public Train (Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		this.line.getLine();
	}
}
