package jp.co.example.Entity;

public interface OutputToDB {
	/**
	 * 【Writer 以外で使うとトランザクションが保証されない】
	 * データ一行を DB に書き込む
	 */
	public void insertThisRecord();

}
