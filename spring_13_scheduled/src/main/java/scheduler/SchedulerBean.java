package scheduler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerBean {
private static final Logger logger = LoggerFactory.getLogger(SchedulerBean.class);

@Scheduled(cron="0/3 * * * * *")
public void scheduleRun() {
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	logger.info("스케쥴링 실행:" + dateFormat.format(calendar.getTime()));
	
}
}
