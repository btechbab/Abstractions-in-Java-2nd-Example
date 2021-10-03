package com;

public class Operations implements Calculator{

	@Override
	public void Addition(int a,int b) {
		System.out.println("Additon Of "+a+" And "+b+" is :::"+(a+b));
	}

	@Override
	public void Substraction(int a, int b) {
		System.out.println("Substraction Of "+a+" And "+b+" is :::"+(a-b));
	}

	@Override
	public void Multiplication(int a, int b) {
		System.out.println("Multiplication Of "+a+" And "+b+" is :::"+(a*b));
	}

	@Override
	public void Division(int a, int b) {
		if(a>=b) 
			System.out.println("Division Of "+a+" And "+b+" is::::"+(a/b));
		else 
			System.out.println("Division Of "+a+" And "+b+" is" + " Not Possible!");
	}
}
