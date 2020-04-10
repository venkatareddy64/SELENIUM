package com.MQ.www;

import java.util.*;

public class Logic {

	public static void main(String[] args) {
	Set<Integer>s1=new HashSet<Integer>();
	s1.add(3);
	s1.add(1);
	s1.add(5);
	s1.add(8);
	s1.add(4);
	s1.add(9);
	s1.add(2);
	Set<Integer>s2=new HashSet<Integer>();
	s2.add(4);
	s2.add(6);
	s2.add(2);
	s2.add(7);
	System.out.println(s1+" "+s2);
	System.out.println("********************************************");
	s2.addAll(s1);
	System.out.println(s2);
	System.out.println("********************************************");
	Iterator<Integer>i=s2.iterator();
	while(i.hasNext())
	{
		Integer i1=(Integer)i.next();
		if(i1%2==0)
		System.out.print(i1+"   ");
	}
	System.out.println("************************************************");
	s2.remove(3);
	System.out.println(s2);
	if(s2.equals(4))
	{
		System.out.println(s2);
	}

	}
}
	
	
	
	
	
	

		