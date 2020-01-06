package com.pageObjectModel.uiObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class ListCollection {
	@Test
	public void listOps() {

		ArrayList<Integer> listInt = new ArrayList<Integer>();
		// List<Integer> listNumberTwo = new ArrayList<Integer>();
		listInt.add(10);
		listInt.add(30);
		listInt.add(40);
		listInt.add(50);

		System.out.println(listInt);
		listInt.add(1, 20);
		System.out.println(listInt);
		listInt.set(4, 80);
		listInt.add(60);
		System.out.println(listInt);
		System.out.println(listInt.isEmpty());
		System.out.println(listInt.get(1));
		listInt.remove(2);
		System.out.println(listInt);
		// listInt.clear();
		// System.out.println(listInt.isEmpty());
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
		
		Iterator<Integer> iterator=listInt.iterator();
		/*while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}*/
		
		System.out.println(listInt.contains(10));
		System.out.println(listInt.contains(100));
		System.out.println(listInt.indexOf(10));
		System.out.println(listInt.size());
		
		Collections.sort(listInt);
		System.out.println(listInt);
		
		Collections.reverse(listInt);
		System.out.println(listInt);
		
		
		

		String s = "aabbccssddbbcca";
		int size = s.length();
		for(int i = size - 1;i==0;i--)
		{
			System.out.println(s.charAt(i));

		}
		
	}

}
