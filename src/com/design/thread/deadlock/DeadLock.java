package com.design.thread.deadlock;

public class DeadLock {
	
	A a = new A();
	
	B b = new B();
	
	Runnable thread1 = new Runnable() {
		public void run() {
			synchronized(a) {
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			synchronized(b) {
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	};
	
	Runnable thread2 = new Runnable() {
		public void run() {
			synchronized(b) {
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			synchronized(a) {
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	};
	
	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		new Thread(deadLock.thread1).start();
		new Thread(deadLock.thread2).start();
	}
}
