package jp.co.example.Batch.TableToOtherTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class MultiTablePartitionPartitioner implements Partitioner {

	private static final String DEFAULT_KEY_NAME = "partitionName";

	private static final String PARTITION_KEY = "partition";

	private List<String> partitions;

	private String keyName = DEFAULT_KEY_NAME;

	public void setPartitions(List<String> resources) {
		this.partitions = resources;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * Assign the filename of each of the injected resources to an
	 * {@link ExecutionContext}.
	 *
	 * @see Partitioner#partition(int)
	 */
	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		Map<String, ExecutionContext> map = new HashMap<String, ExecutionContext>(gridSize);
		int i = 0;
		for (String partition : partitions) {
			ExecutionContext context = new ExecutionContext();
			context.putString(keyName, partition);
			map.put(PARTITION_KEY + i, context);
			i++;
		}
		return map;
	}
}
