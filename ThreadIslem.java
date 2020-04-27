package soru1;

import java.util.ArrayList;

public class ThreadIslem implements Runnable{
	ArrayList<Integer> numberList=new ArrayList<Integer>();
	ArrayList<Integer> singleList;
	ArrayList<Integer> doubleList;
	
	public ThreadIslem(ArrayList<Integer> list) {
		this.numberList=list;
	}

	Object LOCK = new Object();

	
	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		
		System.out.println("My summation " + threadName + " is started!");

		synchronized (LOCK) {
			
			
			for(int i=0; i<numberList.size(); i++) {
				if(numberList.get(i)%2==0) {
					doubleList.add(numberList.get(i));
					System.out.println("Double number:" + numberList.get(i));
				}else {
					singleList.add(numberList.get(i));
					System.out.println("Single number:" + numberList.get(i));

				}
			}
		}
	}

	public static void sleep(long milliseconds) {
		
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}





}
