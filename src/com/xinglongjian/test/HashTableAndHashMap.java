package com.xinglongjian.test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableAndHashMap {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht=new Hashtable<String, String>();
		try {
			ht.put(null, null);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("hashTable does not use null as key and value ");
		}
		//=======================================================================
		//hashmap is not synchronized
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put(null, null);
	}
}
