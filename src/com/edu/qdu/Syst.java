package com.edu.qdu;

import java.util.Scanner;



public class Syst {
	int[] days=new int[10];
	String[] motos=new String[10];
	double[] fees=new double[10];
	public void welcomeHome() {
		String[] cars={"�������","����550i","������ȴ��"};
		String[] seatCounts={">= 16","<16"};
		double totalFee=0;
		System.out.println("��ӭ�������⳵����ϵͳ��");
		System.out.println("���������⼸������");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
	    for(int i=0;i<n;i++){
	    	System.out.println("��"+(i+1)+"���������������⼸�죿");
	    	int day = input.nextInt();
	    	days[i]=day;
	    	System.out.println("���������ѡ��1.Car 2.Bus����");
			int userSel = input.nextInt();
			if (userSel==1) {
				System.out.println("��������ĳ��ͣ�1.������� 2.����550i 3.������ȴ������");
				int seltype=input.nextInt();
				Moto moto=new Car("³B");
				((Car)moto).setType(cars[seltype]);
				motos[i]=((Car)moto).getType();
				fees[i]=moto.rentFree(day);
				
				
			}
			else if(userSel==2){
				System.out.println("��ѡ�������λ����1.<=16��  2.<=16�� ����");
				int selSeat=input.nextInt();
				Moto moto=new Bus("³B");
				((Bus)moto).setSeatCount(seatCounts[selSeat]);
				motos[i]=((Bus)moto).getSeatCount();
				fees[i]=moto.rentFree(day);
				
			}
			else{
				System.out.println("������벻�ԣ�");
				i--;
			}
			totalFee=totalFee+fees[i];
	    	
	    }
	    System.out.println("��ĵڼ�����"+"\t"+"�������"+"\t"+"�������"+"\t"+"����");
	   for(int i=0;i<n;i++){
		  
		   System.out.println((i+1)+"\t"+motos[i]+"\t"+days[i]+"\t"+fees[i]);
	   }

     System.out.println("�ܷ����ǣ�"+totalFee);
     
	}
	public static void main(String[] args) {
		Syst syst=new Syst();
		syst.welcomeHome();
	}

}
