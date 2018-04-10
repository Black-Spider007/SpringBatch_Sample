package jp.co.example.Batch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component("logListener")
public class LogListener extends JobExecutionListenerSupport{
	protected static final Log log = LogFactory.getLog(LogListener.class);

	  @Override
	  public void afterJob(JobExecution jobExecution) {
	     log.info("ジョブ終了");
	     int i = 1;
	     for (StepExecution step : jobExecution.getStepExecutions()) {
	    	 log.info("↓================ step " + String.valueOf(i) + " ================↓");
	    	 log.info("StepName : " + step.getStepName());
	    	 log.info("ExitStatus : " + step.getExitStatus());
	    	 log.info("ReadCount : " + step.getReadCount());
	    	 log.info("ProcessSkipCount : " + step.getProcessSkipCount());
	    	 log.info("WriteCount : " + step.getWriteCount());
	    	 log.info("CommitCount : " + step.getCommitCount());
	    	 log.info("RollbackCount : " + step.getRollbackCount());
	    	 log.info("↑================ step " + String.valueOf(i) + " ================↑");
	    	 i ++;
	     }
	  }

	  @Override
	  public void beforeJob(JobExecution jobExecution) {
	  };

}
