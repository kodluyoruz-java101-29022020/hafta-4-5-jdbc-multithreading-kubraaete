package soru1;

import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> numberList;
	
	public static ArrayList<Integer> elemansArray() {
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		
		for(int i=0; i<10000; i++) {
			numberList.add(i+1);
		}
		return numberList;

	}
	public static void main(String[] args) {
		numberList=elemansArray();
		ArrayList<Integer> list1=(ArrayList<Integer>) numberList.subList(1, 2500);
		ArrayList<Integer> list2=(ArrayList<Integer>) numberList.subList(2500, 5000);
		ArrayList<Integer> list3=(ArrayList<Integer>) numberList.subList(5000, 7500);
		ArrayList<Integer> list4=(ArrayList<Integer>) numberList.subList(7500, 10000);



		ThreadIslem threadIslem1=new ThreadIslem(list1);
		ThreadIslem threadIslem2=new ThreadIslem(list2);
		ThreadIslem threadIslem3=new ThreadIslem(list3);
		ThreadIslem threadIslem4=new ThreadIslem(list4);
		
		Thread assignThread1=new Thread(threadIslem1);
		Thread assignThread2=new Thread(threadIslem2);
		Thread assignThread3=new Thread(threadIslem3);
		Thread assignThread4=new Thread(threadIslem4);
		
		assignThread1.start();
		assignThread2.start();
		assignThread3.start();
		assignThread4.start();

	}

}
