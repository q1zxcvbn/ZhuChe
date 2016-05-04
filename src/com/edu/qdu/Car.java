package com.edu.qdu;

public class Car extends Moto {
	private String type;
	


	public Car(String motoNo) {
		super(motoNo);
		
	}

	public double rentFree(int day){
		if (type.equals("别克商务")) {
			setFee(600d);
			
		}
		else if(type.equals("宝马550i")){
			setFee(500d);
			
		}else{
		setFee(300d);	
		}
		
		return super.rentFree(day);
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
