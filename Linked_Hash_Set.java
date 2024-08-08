package com.mec.practice1;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
	Set<Integer> s=new LinkedHashSet<Integer>();
	s.add(null);
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(null);
	s.add(40);
	s.add(10);
	System.out.println(s);
	System.out.println(s.remove(20));
	System.out.println(s);
	Iterator<Integer>i= s.iterator();
	while(i.hasNext())
	System.out.println(i.next());
	}

}
