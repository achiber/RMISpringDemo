package com.rmi.test.spring;

public class CalculateRMIServiceImpl implements ICalculateRMIService {

	private int avalue = 0, bvalue = 0;
	@Override
	public int mul(int a, int b) {
		return a * b;
	}
	public int get() {
		return avalue*bvalue;
	}
	public int getAvalue() {
		return avalue;
	}
	public void setAvalue(int avalue) {
		this.avalue = avalue;
	}
	public int getBvalue() {
		return bvalue;
	}
	public void setBvalue(int bvalue) {
		this.bvalue = bvalue;
	}
}
