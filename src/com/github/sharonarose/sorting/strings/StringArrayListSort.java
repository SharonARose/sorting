package com.github.sharonarose.sorting.strings;

import java.util.*;
public class StringArrayListSort  {

	public static void main(String args[]){
	   ArrayList<String> listofpeople = new ArrayList<String>();
	   listofpeople.add("Shea");
	   listofpeople.add("Matt");
	   listofpeople.add("Tracy");
	   listofpeople.add("Ricky Bobby");

	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   for(String counter: listofpeople){
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(listofpeople);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   for(String counter: listofpeople){
			System.out.println(counter);
		}
	}
}