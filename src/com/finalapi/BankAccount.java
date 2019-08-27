package com.finalapi;
import java.util.*;
public class BankAccount {
	
	
	int accountno,balance;
	String  uname,accounttype;
	static int tdeposite,twithdraw,tperson,dperson;
	public BankAccount(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
		accountno=i;uname=string;balance=j;accounttype=string2;
	tdeposite =balance+tdeposite;
	}
	

	public void display()
	{
	System.out.println(""+this.toString());
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountno=" + accountno + ", balance=" + balance
				+ ", uname=" + uname + ", accounttype=" + accounttype + "]";
	}
	public void withdraw(int withdraw1)
	{
		if(balance>=withdraw1)
		{
			balance=balance-withdraw1;
			twithdraw=twithdraw+withdraw1;
			dperson++;
			System.out.println("\n");
			
		}
		else
			System.out.println("not Sufficient BALANCE \n");
	}
	
	public void deposite(int dbalance)
	{
		balance=balance+dbalance;
		tdeposite=tdeposite+balance;
		tperson++;
		System.out.print("balance deposite \n");
		
	}
	
	public static void avg(BankAccount...avgobj)
	{
		long avgall=0;
		for(BankAccount b:avgobj)
		{
			avgall=avgall+b.balance;
		}
	System.out.println("average balance "+avgall/avgobj.length);
	}
	
	public static void total()
	{
		System.out.println("Total deposite"+tdeposite);
		System.out.println("Total withdraw\n"+twithdraw);
		System.out.println("Total withdraw person \n"+dperson);
		
	}
	public static void main(String[]args)
	{
		int depo,withdra;
		BankAccount ba1=new BankAccount(120245,"vinod",12345,"Saving Account");
		BankAccount ba2=new BankAccount(20220245,"Tanish",202345,"Saving Account");
		BankAccount ba3=new BankAccount(450245,"Aakash",85345,"Saving Account");
		BankAccount ba4=new BankAccount(8520245,"Manaw",892345,"Saving Account");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value for deposite");
		depo=sc.nextInt();
		ba1.deposite(depo);
		
		System.out.print("enter value for withdraw");
		withdra=sc.nextInt();
		ba1.withdraw(withdra);
		ba1.display();
		System.out.print("-------userone----------\n");
	
			
		System.out.print("enter value for deposite");
		depo=sc.nextInt();
		ba2.deposite(depo);	
		System.out.print("enter value for withdraw");
		withdra=sc.nextInt();
		ba2.withdraw(withdra);
		ba2.display();
		System.out.print("-------usertwo----------\n");
		
		
		System.out.print("enter value for deposite");
		depo=sc.nextInt();
		ba3.deposite(depo);	
		System.out.print("enter value for withdraw");
		withdra=sc.nextInt();
		ba3.withdraw(withdra);
		ba3.display();
		System.out.print("-------userthree----------\n");
		
		
		System.out.print("enter value for deposite");
		depo=sc.nextInt();
		ba4.deposite(depo);	
		System.out.print("enter value for withdraw");
		withdra=sc.nextInt();
		ba4.withdraw(withdra);
		ba4.display();
		System.out.print("-------Four----------\n");
		
		System.out.print("-------Total----------");
		
		total();
		avg(ba1,ba2,ba3,ba4);
	
	}
	
}


