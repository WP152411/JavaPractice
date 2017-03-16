/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice, attack = 100;
		
		do{
		System.out.println("   <<게임 메뉴>>     ");
		System.out.println("   1. 공격력 증가         ");
		System.out.println("   2. 공격력 감소         ");
		System.out.println("   3. 캐릭터 설정         ");
		System.out.println("   9. 종료                   ");
		
		choice = scanner.nextInt();
		
		System.out.printf("\n   메뉴 입력 => %d", choice);
		
		if(choice == 1){
			attack += 10;
			System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d", attack);
		}
		else if(choice == 2){
			attack -=10;
			System.out.printf("공격력이 감소되었습니다. 현재 공격력: %d", attack);
		}
		else if(choice == 3){
			int cha = new Random().nextInt(4);
			choice = scanner.nextInt();
			if(cha == 0){
		        System.out.printf("마법사 (으)로 설정되었습니다.");
		    }
			else if(cha == 1){
				System.out.printf("영주 (으)로 설정되었습니다.");
			}
			else if(cha == 2){
				System.out.printf("기사 (으)로 설정되었습니다.");
			}
			else{
				System.out.printf("농민 (으)로 설정되었습니다.");
			}
		}
		else if( choice == 9){
			scanner.close();
			System.out.println("이제 공부하세요!");
		}
		else{
			System.out.println("없는 메뉴입니다!!");
		}
	}while(choice != 9);

	}
}
