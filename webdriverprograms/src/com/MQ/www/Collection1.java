package com.MQ.www;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
	String a="1234";
	String b="venkat";
	String c="grzl";
	List<String>l=new ArrayList<String>();
	l.add(a);
	l.add(b);
	l.add(c);
	System.out.println(l);
	for(int i=l.size()-1;i>=0;i--)
	{
		System.out.println(" "+l.get(i));
	}
	System.out.println(l.contains("grzl"));
	System.out.println(l.retainAll(l));
	l.remove("grzl");
	System.out.println(l);
	System.out.println(l.removeAll(l));
	System.out.println(l);
	
	}

}
