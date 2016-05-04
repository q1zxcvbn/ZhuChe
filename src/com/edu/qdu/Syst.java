package com.edu.qdu;

import java.util.Scanner;



public class Syst {
	int[] days=new int[10];
	String[] motos=new String[10];
	double[] fees=new double[10];
	public void welcomeHome() {
		String[] cars={"别克商务","宝马550i","别克林萌大道"};
		String[] seatCounts={">= 16","<16"};
		double totalFee=0;
		System.out.println("欢迎来到出租车租赁系统！");
		System.out.println("请问你想租几辆车？");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
	    for(int i=0;i<n;i++){
	    	System.out.println("第"+(i+1)+"辆车，请问你想租几天？");
	    	int day = input.nextInt();
	    	days[i]=day;
	    	System.out.println("请输入你的选择（1.Car 2.Bus）：");
			int userSel = input.nextInt();
			if (userSel==1) {
				System.out.println("请输入你的车型（1.别克商务 2.宝马550i 3.别克林萌大道）：");
				int seltype=input.nextInt();
				Moto moto=new Car("鲁B");
				((Car)moto).setType(cars[seltype]);
				motos[i]=((Car)moto).getType();
				fees[i]=moto.rentFree(day);
				
				
			}
			else if(userSel==2){
				System.out.println("请选择你的座位数（1.<=16座  2.<=16座 ）：");
				int selSeat=input.nextInt();
				Moto moto=new Bus("鲁B");
				((Bus)moto).setSeatCount(seatCounts[selSeat]);
				motos[i]=((Bus)moto).getSeatCount();
				fees[i]=moto.rentFree(day);
				
			}
			else{
				System.out.println("你的输入不对！");
				i--;
			}
			totalFee=totalFee+fees[i];
	    	
	    }
	    System.out.println("租的第几辆车"+"\t"+"租的类型"+"\t"+"租的天数"+"\t"+"费用");
	   for(int i=0;i<n;i++){
		  
		   System.out.println((i+1)+"\t"+motos[i]+"\t"+days[i]+"\t"+fees[i]);
	   }

     System.out.println("总费用是："+totalFee);
     
	}
	public static void main(String[] args) {
		Syst syst=new Syst();
		syst.welcomeHome();
	}

}
