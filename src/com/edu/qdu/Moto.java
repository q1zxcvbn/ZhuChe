package com.edu.qdu;

public abstract class Moto {
private String motoNo;
private Double fee;
public Moto(String motoNo){
	this.motoNo=motoNo;
}
public  double rentFree(int day){
	return fee*day;
}
public String getMotoNo() {
	return motoNo;
}
public void setMotoNo(String motoNo) {
	this.motoNo = motoNo;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}

}
