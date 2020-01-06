package com.pageObjectModel.uiObjects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetCollections {
	
	@Test(priority=1)
	public void setCollection() {
		
		Set<String> setstring=new HashSet<String>();
		setstring.add(null);
		System.out.println(setstring);
		setstring.add("Raju");
		setstring.add("mani");
		setstring.add("jaggu");
		setstring.add("jaggu");
		setstring.add("Phani");
		setstring.add("Harish");
		System.out.println(setstring);
		
		Set<String> linkedHashSets= new LinkedHashSet<String>();
		linkedHashSets.addAll(setstring);
		linkedHashSets.add("AAAAA");
		System.out.println(linkedHashSets);
		
		
		Set<String> treeSets= new TreeSet<String>();
		treeSets.add("bbbb");
		treeSets.add("AAAA");
		treeSets.add("hhhh");
		treeSets.add("dddd");
		
		System.out.println(treeSets);	
		
		
		
	}

	@Test(priority=2)
	public void removingDuplicatesInString() {
		
		String s="aabbcc";
		int Size=s.length();
		Set<String> dupSet=new TreeSet<String>();
		char s1;
		String S2;
		for(int i=0;i<=Size-1;i++) {
		 s1 = s.charAt(i);
		  S2=Character.toString(s1);
			dupSet.add(S2);
		}
		System.out.println(dupSet);
		
		for(String s5:dupSet) {
			System.out.print(s5);
		}
		
	}
	@Test
	public void mapCollection() {
		
		
		
	}
}
