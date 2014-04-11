package com.orm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SugarMockHelper {
	private static SugarMockHelper helper;
	private HashMap<Class, List> findWithQueryEntries;
	
	private SugarMockHelper() {
		findWithQueryEntries = new HashMap<Class, List>();
	}
	
	public static SugarMockHelper getInstance() {
		if(helper == null) {
			helper = new SugarMockHelper();
		}
		return helper;
	}
	
	public <T extends SugarRecord<?>> List<T> getFindWithQueryResults(Class clazz) {
		List<T> results = (List<T>) findWithQueryEntries.get(clazz);
		if(results == null) {
			results = new ArrayList<T>();
		}
		return results;
	}
	
	public <T extends SugarRecord<?>> void setFindWithQueryResults(Class clazz, List<T> entries) {
		findWithQueryEntries.put(clazz, entries);
	}
	
}
