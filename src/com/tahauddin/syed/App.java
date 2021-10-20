package com.tahauddin.syed;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class App {

	public static void main(String[] args) {
		
		Employee instance = Employee.getInstance();
		
		Class<Employee> class1 = (Class<Employee>) instance.getClass();
		
		Constructor[] declaredConstructors = class1.getDeclaredConstructors();
		
		declaredConstructors[0].setAccessible(true);
		try {
			Object newInstance1 = declaredConstructors[0].newInstance();
			Object newInstance2 = declaredConstructors[0].newInstance();
			Object newInstance3 = declaredConstructors[0].newInstance();
			System.out.println(newInstance1.hashCode());
			System.out.println(newInstance2.hashCode());
			System.out.println(newInstance3.hashCode());

			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
