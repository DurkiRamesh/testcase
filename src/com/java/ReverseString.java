package com.java;

public class ReverseString {
public static void main(String[] args) {
	String s="Ramesh";
	int len=s.length();
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(s.charAt(i)); 
	}
}
}
