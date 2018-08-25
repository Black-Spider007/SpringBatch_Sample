package jp.co.example.Batch.FileToDB;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import jp.co.example.Entity.OutputToDB;

@Component("fileToDBExampleItemWriter")
public class FileToDBExampleItemWriter implements ItemWriter<OutputToDB> {

	private static final Log log = LogFactory.getLog(FileToDBExampleItemWriter.class);

	public void write(List<? extends OutputToDB> list) throws Exception {
		for (OutputToDB data : list) {
			log.info(data.toString());
			data.insertThisRecord();
		}

	}

}
