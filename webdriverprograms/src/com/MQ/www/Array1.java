package com.MQ.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;


public class Array1 {

	public static void main(String[] args) {
	Set<Integer>l=new HashSet<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(3);
    Set<Integer>al=new HashSet<Integer>();
    al.add(1);
    al.add(2);
    al.add(7);
    al.add(5);
   al.addAll(l);
   System.out.print("'");
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		Integer num=(Integer)itr.next();
	
	System.out.print(" "+num+" ");
	}
	System.out.println("'");
	
	}
	
}
   

   