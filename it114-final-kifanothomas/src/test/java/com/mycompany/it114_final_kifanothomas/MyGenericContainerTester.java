package com.mycompany.it114_final_kifanothomas;

public class MyGenericContainerTester {

	public static void main(String[] args) {
		
		MyGenericContainerInterface<String> c4String;
		MyGenericContainerClass c4str = new MyGenericContainerClass("Ilker");
		MyGenericContainerClass c4int = new MyGenericContainerClass(1234);
		System.out.println("String Container Contains:" + c4str.getContained());
		System.out.println("Integer Type Contains:" + c4int.getContained());
		// TODO Auto-generated method stub

	}

}
