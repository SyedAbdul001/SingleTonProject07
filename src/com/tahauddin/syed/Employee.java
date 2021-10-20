package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class Employee {
	
	private Employee() {
		if(InnerEmployee.instanace != null) {
		//	throw new IllegalArgumentException("Object Already Created...");
			System.out.println("Object Already Created..");
			System.out.println("New Object Cannot be Created..");
			System.exit(0);
		}
		System.out.println("Object Created");
	}
	
	public static Employee getInstance() {
		return InnerEmployee.instanace;
	}
	
	private static class InnerEmployee{
		private static Employee instanace = new Employee();
	}

}
