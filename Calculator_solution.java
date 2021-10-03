package com;

import java.util.Scanner;

public class Calculator_solution {

	public static void main(String[] args) {
		//		Upcasting, SuperClass Variable and SUbClass Object
		Calculator c= new	Operations ();
		Scanner Sc1=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Two Numbers,,,");
			int a=Sc1.nextInt();int b=Sc1.nextInt();
			System.out.println("1.Addition\n2.Substraction\n3.Division\n4.Multiplicaton\n5.Exit\n");
			System.out.println("Enter Your Choice ");
			switch(Sc1.nextInt()) {
			case 1:  c.Addition(a, b); break;
			case 2:  c.Substraction(a, b);break;
			case 3:  c.Division(a, b);
			break;
			case 4:  c.Multiplication(a, b);
			break;
			case 5: System.out.println("Thankyou  for Banking With Us!");
			System.exit(0);
			default:System.out.println("Enter Valid One ");
			break;
			}
		}
	}

}
