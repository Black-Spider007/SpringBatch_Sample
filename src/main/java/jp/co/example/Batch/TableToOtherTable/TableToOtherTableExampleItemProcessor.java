package jp.co.example.Batch.TableToOtherTable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import jp.co.example.Entity.InputData;
import jp.co.example.Entity.OutputToDB;


@Component("tableToOtherTableExampleItemProcessor")
public class TableToOtherTableExampleItemProcessor implements ItemProcessor<InputData, OutputToDB> {

	private static final Log log = LogFactory.getLog(TableToOtherTableExampleItemProcessor.class);

	@Override
	public OutputToDB process(InputData item) throws Exception {
		log.info(item.toString());
		return item.convertToDB();
	}

}
