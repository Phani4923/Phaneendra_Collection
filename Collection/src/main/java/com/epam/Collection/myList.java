package com.epam.Collection;

import java.util.*;
public class myList<T> {
	
	    int arr_size = 0;
	    private Object arr[];
	    
	    //INITIALIZING 10 ELEMENTS
	    public myList() 
	    {
	       arr = new Object[10];
	       for(int i=0;i<10;i++)
	       {
	       	arr[arr_size++] = i+1;
	       }
	   }
	    
	   //SIZE OF THE ARRAY
	   public int size() 
	   {
		       return arr_size;
	   }
	
	   //ADDING ELEMENTS
	   public void add(T val) 
	   {
	       if (arr_size == arr.length) 
	       {
	    	   int newSize = arr.length * 4;
		       arr = Arrays.copyOf(arr, newSize);
	       }
	       arr[arr_size++] = val;
	   }
	   
	    
	   public T get(int pos) 
	   {
		   if (pos < arr_size && pos > 0)
		   {
			   return (T) arr[pos-1];
		   }
		   else
		   {
			   System.out.println(pos+" Index was not present within the range of List");
		   }
		   return null;
	   }
	    
	   public T remove(int pos) 
	   {
		   Object item = null;
		   if (pos < arr_size && pos > 0) 
		   {
			   item = arr[pos];
		       int del = arr.length - ( pos + 1 ) ;
		       System.arraycopy( arr, pos + 1, arr, pos, del ) ;
		       arr_size--;		   	       
		   }		   
		   else
		   {
			   System.out.println(pos+" Position is out of the boundary");
		   }
		   return (T) item;
	   }
	   
	   public void display()
	   {
		   for(int i=0;i<arr_size;i++)
		   {
			   System.out.println("Element "+(i+1)+" --> "+arr[i]);
		   }
	   }
}