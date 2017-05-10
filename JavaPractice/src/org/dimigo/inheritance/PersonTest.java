/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person("Tom");
		Korean korea = new Korean("홍길동");
		Japanese japan = new Japanese("다나카");
		Chinese china = new Chinese("왕밍");
		
		System.out.println(person);
		System.out.println(korea);
		System.out.println(japan);
		System.out.println(china);
		System.out.println();
		person.sayHello();
		korea.sayHello();
		japan.sayHello();
		china.sayHello();
		System.out.println();
		person.sayBye();
		korea.sayBye();
		japan.sayBye();
		china.sayBye();
		

	}

}
