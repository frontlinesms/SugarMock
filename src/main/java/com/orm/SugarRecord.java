package com.orm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import android.content.Context;

public class SugarRecord<T> {
	public SugarRecord(Context ctx) {

	}

	public static <T extends SugarRecord<?>> List<T> findWithQuery(
			Class<T> type, String query, String... arguments) {
		System.out.println("Find with query invoked. Query is: " + query);
		return SugarMockHelper.getInstance().getFindWithQueryResults(type);
	}

	private static void methodMissing() {
		System.out.println("Mock method called on SugarRecord");
	}

	public void delete() {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> void deleteAll(Class<T> type) {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> void deleteAll(Class<T> type,
			String whereClause, String... whereArgs) {
		SugarRecord.methodMissing();
	}

	public void save() {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> void saveInTx(T... objects) {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> void saveInTx(Collection<T> objects) {
		SugarRecord.methodMissing();
	}

	void save(Object db) {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> List<T> listAll(Class<T> type) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> T findById(Class<T> type, Long id) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> Iterator<T> findAll(Class<T> type) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> Iterator<T> findAsIterator(
			Class<T> type, String whereClause, String... whereArgs) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> Iterator<T> findWithQueryAsIterator(
			Class<T> type, String query, String... arguments) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> Iterator<T> findAsIterator(
			Class<T> type, String whereClause, String[] whereArgs,
			String groupBy, String orderBy, String limit) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> List<T> find(Class<T> type,
			String whereClause, String... whereArgs) {
		SugarRecord.methodMissing();
		return null;
	}

	public static void executeQuery(String query, String... arguments) {
		SugarRecord.methodMissing();
	}

	public static <T extends SugarRecord<?>> List<T> find(Class<T> type,
			String whereClause, String[] whereArgs, String groupBy,
			String orderBy, String limit) {
		SugarRecord.methodMissing();
		return null;
	}

	public static <T extends SugarRecord<?>> long count(Class<?> type,
			String whereClause, String[] whereArgs) {
		SugarRecord.methodMissing();
		return 0l;
	}

	public static <T extends SugarRecord<?>> long count(Class<?> type,
			String whereClause, String[] whereArgs, String groupBy,
			String orderBy, String limit) {
		SugarRecord.methodMissing();
		return 0l;
	}

	@SuppressWarnings("unchecked")
	void inflate(Object cursor) {
		SugarRecord.methodMissing();
	}

	public List getTableFields() {
		SugarRecord.methodMissing();
		return null;
	}

	private static List getAllFields(List fields, Class<?> type) {
		SugarRecord.methodMissing();
		return null;
	}

	public String getSqlName() {
		SugarRecord.methodMissing();
		return null;
	}

	public static String getTableName(Class<?> type) {
		SugarRecord.methodMissing();
		return null;
	}

	public Long getId() {
		SugarRecord.methodMissing();
		return null;
	}

	public void setId(Long id) {
		SugarRecord.methodMissing();
	}
}
