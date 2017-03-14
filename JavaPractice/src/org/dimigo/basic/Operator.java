/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary = 1700000;
		int peoplenum = 3;
		int jumponum = 1500;
		
		System.out.printf("<<디미베네 연간 인건비>>\n");
		System.out.printf("월 평균 급여 : %s원\n", String.format("%,d", salary));
		System.out.printf("점포 내 직원 수 : %s명\n", peoplenum);
		System.out.printf("점포 수 : %s명\n\n", String.format("%,d", jumponum));
		System.out.printf("연간 인건비 : %s원\n", String.format("%,d", (long)salary*peoplenum*12*jumponum));
		
		

	}

}
