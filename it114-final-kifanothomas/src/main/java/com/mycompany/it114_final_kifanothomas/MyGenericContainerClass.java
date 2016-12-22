package com.mycompany.it114_final_kifanothomas;

public class MyGenericContainerClass<T> implements MyGenericContainerInterface <T>{
	
	private T contained;
	public MyGenericContainerClass contained1 = new MyGenericContainerClass("Ilker Test");
	
	public MyGenericContainerClass(String string) {
		// TODO Auto-generated constructor stub
	}

	public MyGenericContainerClass(int i) {
		// TODO Auto-generated constructor stub
	}

	public MyGenericContainerClass getContained() {
		return contained1;
	}

}
