package com.hand.test;
/***
*@author  gdp 
*@date    2017年8月12日 上午10:02:52
*/
public class Worker {

	private String name;
	private double Salary;
	private double tax=0;
	
	
	public Worker(){
		
	}
	public Worker(String name,double salary){
		this.name=name;
		this.Salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
		
	public double GetTax(){
		double temp=this.Salary;
		if (Salary<1500) {
			this.tax=temp*0.03;
		} else {
			this.tax=1500*0.03;
			if (Salary<4500) {
				temp=this.Salary-1500;
				this.tax+=temp*0.1;
			} else {
				this.tax+=3000*0.1;
				if (Salary<9000) {
					temp=this.Salary-4500;
					this.tax+=temp*0.20;
				} else {
					this.tax+=4500*0.20;
					if (Salary<35000) {
						temp=this.Salary-9000;
						this.tax+=temp*0.25;
					}else{
						this.tax+=6000*0.25;
						if(Salary<55000){
							temp=this.Salary-35000;
							this.tax+=temp*0.30;
						}else{
							this.tax+=20000*0.30;
							if(Salary<80000){
								temp=this.Salary-55000;
								this.tax+=temp*0.35;
							}else{
								this.tax+=2500*0.25;
								temp=this.Salary-80000;
								this.tax+=temp*0.45;
							}
						}
					}
				}

			}

		}
		return tax;
		
	}
	
}
