/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 cara = new Car3();
		System.out.println("<<자동차 목록>>");
		System.out.printf("제조사명 : %s\n", cara.getCompany());
		System.out.printf("모델명 : %s\n", cara.getModel());
		System.out.printf("색상 : %s\n", cara.getColor());
		System.out.printf("최대속도 : %dkm\n", cara.getMaxSpeed());
		System.out.printf("가격 : %,d원\n\n\n", cara.getPrice());
		
		
    	Car3 carb = new Car3("기아자동차", "K7", "흰색", 246);
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxSpeed(246);
//		car2.setPrice(40000000);
		
		System.out.printf("제조사명 : %s\n", carb.getCompany());
		System.out.printf("모델명 : %s\n", carb.getModel());
		System.out.printf("색상 : %s\n", carb.getColor());
		System.out.printf("최대속도 : %dkm\n", carb.getMaxSpeed());
		System.out.printf("가격 : %,d원\n\n\n", carb.getPrice());
		
		
		Car3 carc = new Car3("삼성자동차", "SM7", "회색");
		
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxSpeed(200);
//		car3.setPrice(38000000);
		
		System.out.printf("제조사명 : %s\n", carc.getCompany());
		System.out.printf("모델명 : %s\n", carc.getModel());
		System.out.printf("색상 : %s\n", carc.getColor());
		System.out.printf("최대속도 : %dkm\n", carc.getMaxSpeed());
		System.out.printf("가격 : %,d원\n", carc.getPrice());

	}

}
