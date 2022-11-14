package com.singleTon;

public class SingleTon {

	private static SingleTon singleton_instance = null;

	private SingleTon() {

	}

	public static SingleTon getInstance() {

		
		if (singleton_instance == null) {
			singleton_instance = new SingleTon();
		}
		//return singleton_instance;
		return singleton_instance==null? new SingleTon(): singleton_instance;
	}
}
