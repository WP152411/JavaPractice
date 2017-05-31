/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 31.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	/**
	 * @param title
	 * @param limitAge
	 */
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age) throws Exception{
		try{
			if(age < limitAge){
			throw new Exception(title + "은/는" +  limitAge + "세 이상 관람가입니다.");
			}
			if(age> limitAge){
				throw new Exception(title + " 즐감하세요.");
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	

}