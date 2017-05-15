 /**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class SmartPhoneTest extends SmartPhone{

	public static void main(String[] args) {
		
		
		SmartPhone[] smart = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(int i=0; i<2; i++){
			System.out.println(smart[i]);
			smart[i].turnOn();
			smart[i].pay();
			smart[i].useSpecialFunction(smart[i]);
			smart[i].turnOff();
			System.out.println();
		}

	}

}
