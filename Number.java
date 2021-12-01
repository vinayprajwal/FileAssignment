package com.Number;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String s="1";
		int sum=1;
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=2;i<=num;i++)
		{
			sb.append("+");
		     sum=sum+i;
			System.out.println(sb.append(i)+"="+sum);
		}
		
		

	}

}
