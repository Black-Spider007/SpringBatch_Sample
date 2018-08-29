package jp.co.example.Batch.AntiPattern1FileToDB;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.example.DbMapper.Employee;
import jp.co.example.FileMapper.AntiPatternImpl.AntiPatternEmployeeFileRow;


@Component("fileToDBAntiPatternExampleItemProcessor")
// TODO 入力データが AntiPatternEmployeeFileRow、出力データが Employee に限定されてしまうのは拡張性が非常に乏しい
// （他のファイルを読み込んだり、他のテーブルに書き出したくなったとき Processor 丸ごとコピペ）
public class FileToDBAntiPatternExampleItemProcessor implements ItemProcessor<AntiPatternEmployeeFileRow, Employee> {

	private static final Log log = LogFactory.getLog(FileToDBAntiPatternExampleItemProcessor.class);

	@Autowired
	Employee employee;

	public Employee process(AntiPatternEmployeeFileRow fileRow) throws Exception {
		log.info(fileRow.toString());

		// TODO ↓の処理では employee というテーブル書き込み用オブジェクトに値をセットしているが、『値をセットする』って employee テーブルに書き込む場合以外でも行う処理のはず
		employee.setEmployeeNumber(Integer.parseInt(fileRow.getNumber()));
		employee.setName(fileRow.getName());
		employee.setNote(fileRow.getNote());
		return employee;
	}

}
