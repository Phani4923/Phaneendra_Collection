package com.epam.Collection;

import java.util.*;
public class MainClass {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		myList<Object> lis=new myList<Object>();
		
		while(true)
		{
			System.out.println("Select the Options :"+"\n"+"1.Display"+"\n"+"2.ADD Element"+"\n"+"3.Delete Element at a Position"+"\n"+"4.Retreive Data At a Position"+"\n"+"5.END");
			System.out.print("Choose your option : ");
			int option=sc.nextInt();
			if(option==1)
			{
				lis.display();
			}
			else if(option==2)
			{
				System.out.println("Enter the Element : ");
				Object value=sc.next();
				lis.add(value);
			}
			else if(option==3)
			{
				System.out.println("Enter Position to Remove : ");
				int position=sc.nextInt();
				lis.remove(position);
			}
			else if(option==4)
			{
				System.out.println("Enter Position to Retreive : ");
				int position=sc.nextInt();
				System.out.println("Element is : "+lis.get(position));
			}
			else 
			{
				System.out.println("Process Ended");
				break;
			}
		}
//		lis.add(100);
//			
//		lis.remove(8);
//		lis.remove(15);
//		lis.remove(20);
//		
//		System.out.println("Element at Index 8 : "+lis.get(8));
//		
//		System.out.println("Size of the List : "+lis.size());
//		
//		lis.display();
	}
	
}
