package com.hand.test;

import java.util.Scanner;

/***
*@author  gdp 
*@date    2017年8月12日 上午10:02:03
*/
public class TaxDemo {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("请输入薪资：");
		Double SalaryTest=in.nextDouble();
		Worker worker=new Worker("张三",SalaryTest);
		System.out.println(worker.getName()+"所交的税费:"+worker.GetTax());
	}

}
