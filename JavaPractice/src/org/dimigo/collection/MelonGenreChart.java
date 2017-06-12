/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 12.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>( );
		map.put("발라드",new ArrayList<Music>());
		map.put("댄스", new ArrayList<Music>());
		map.get("발라드").add(new Music("팔레트", "아이유"));
		map.get("댄스").add(new Music("I LUV IT", "PSY"));
		map.get("댄스").add(new Music("맞지?", "언니쓰"));
		
		System.out.println("--<< 멜론 장르별 챠트 >> --");
		printList(map);
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		System.out.println("--<< 댄스 2위 곡 변경 >> --");
		printList(map);
		System.out.println("--<< 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printList(map);
		System.out.println("--<< 전체 리스트 삭제 >> --");
		map.clear();
		printList(map);

	}
	
	public static void printList(Map<String, List<Music>> map){
		if (map.get("발라드")==null || map.get("댄스") == null)
			return;
		int cnt = 1;
		System.out.println("[발라드]");
		
		for (Music m : map.get("발라드")) {

			System.out.println(cnt + ". " + m.toString());
			cnt++;
		}
		
		System.out.println("[댄스]");
		cnt = 1;
		for (Music m : map.get("댄스")) {

			System.out.println(cnt + ". " + m.toString());
			cnt++;
		}
		System.out.println();
	}
	
	

}
