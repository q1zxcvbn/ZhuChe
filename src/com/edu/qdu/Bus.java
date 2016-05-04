package com.edu.qdu;

public class Bus extends Moto{
    private String seatCount;
    
    public double rentFree(int day){
    	if (seatCount.equals(">=16")) {
			setFee(2000d);
		} else {
			setFee(1000d);
		}
		return super.rentFree(day);
    }
	public Bus(String motoNo) {
		super(motoNo);
		
	}
	public String  getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String  seatCount) {
		this.seatCount = seatCount;
	}
	

}
