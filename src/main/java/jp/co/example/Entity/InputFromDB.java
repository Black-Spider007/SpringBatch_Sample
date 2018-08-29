package jp.co.example.Entity;

public interface InputFromDB {
	/**
	 * @return
	 * 【Processor の中でのみ使用する】
	 * データ書き込みようのオブジェクトを作成する
	 */
	public OutputToDB convertToDB();

}
