package com.rays.pro4.Exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred.
 * 
 * @author vinjal jain 
 *
 */

public class DatabaseException extends Exception {

	public DatabaseException(String msg){
		super(msg);
	}
	
}
