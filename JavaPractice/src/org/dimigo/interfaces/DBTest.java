/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : SungKM
 * @version : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		System.out.println("<변경전>");
		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(s);
		System.out.println("<변경후>");
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(o);

	}
	
	private static void crud(IDBManager db){
			db.insert();
			db.search();
			db.update();
			db.delete();
		}

}
