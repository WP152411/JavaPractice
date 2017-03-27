/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class Car3 {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public Car3(){
	}
	
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
    	this.model = model;
    	this.color = color;
    	this.maxSpeed = maxSpeed;
    	this.price = price;
    	
    }
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
    }
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0);	
    }
	
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	
	public void setCompany(String newcompany){
		company = newcompany;
	}
	public void setModel(String newmodel){
		model = newmodel;
	}
	public void setColor(String newcolor){
		color = newcolor;
	}
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed = newmaxSpeed;
	}
	public void setPrice(int newprice){
		price = newprice;
	}
	
}
