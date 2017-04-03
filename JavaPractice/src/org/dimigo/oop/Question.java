/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] answers = {"빅뱅", "공유", "응용 프로그래밍"};
	    Scanner scanner = new Scanner(System.in);
	    for(int i=0; i<3; i++){
	    	System.out.println(questions[i]);
	    	String answer = scanner.nextLine();
	    	if(answer.equals(answers[i])){
	    		System.out.println("정답입니다!");
	    		
	    	}
	    	else{
	    		System.out.println("틀렸습니다!");
	    	}
	    	System.out.println(answer);
	    }
	    System.out.println("<<결과출력>>");
	    for(int j=0; j<3; j++){
	    	System.out.println(questions[j]+answers[j]);
	    }
	    scanner.close();
	    
	   
	    
		

	}

}
