package jp.co.example.Batch.AntiPattern1FileToDB;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.example.DbMapper.Employee;
import jp.co.example.DbMapper.EmployeeMapper;

@Component("fileToDBAntiPatternExampleItemWriter")
// Employee クラスのデータしか書き込みに行けないのは拡張性が非常に乏しい（他のテーブルに書き出したくなったとき Writer 丸ごとコピペ）
public class FileToDBAntiPatternExampleItemWriter implements ItemWriter<Employee> {

	private static final Log log = LogFactory.getLog(FileToDBAntiPatternExampleItemWriter.class);

	@Autowired
	private EmployeeMapper employeeMapper;

	public void write(List<? extends Employee> list) throws Exception {
		for (Employee data : list) {
			log.info(data.toString());

			// TODO ↓の処理では MyBatis の機能でテーブル書き込みを行っているが、『テーブル書き込み』ってそんなに特殊な処理じゃないはず
			employeeMapper.insertSelective(data);
		}

	}

}
