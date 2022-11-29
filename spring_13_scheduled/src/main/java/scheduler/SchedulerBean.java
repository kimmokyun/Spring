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
/*
로그 : 프로그램 개발이나 운영시 문제점을 추적하거나 운영상태를 모니터링하기 위한 텍스트이다.
system.out.println();  을 사용하여 로그를 확인할수있으나 이 보다는 로그를 기록하는 방법을 사용한다.
log4j은 다음과 같은 레벨을 가진다.
TRACE > DEBUG > INFO > WARN > ERROR > FATAL

만약에 INFO로 셋팅하면 INFO, WARN, ERROR, FATAL은 기록된다.

FATAL : 심각한 에러 -> 프로그램 자체가 실행되지 않을 수 있다.
ERROR : 문제가 발생하면 소프트웨어 일부가 기능을 수행하지 못할 수 있다.
WARNING : 소프트웨어가 동작하고 있지만, 예상치 못한 일이 발생해서 가까운 미래에 문제가 발생할수 있다는 경고이다.
           예) 디스크 공간 부족 -> 프로그램은 동작되지만 앞으로 문제가 발생할 수도 있음
INFO : 작업이 정상적으로 작동하고 있음을 메세세지를 통해 확인하고 싶은 경우에 사용한다.
DEBUG : 어떤 문제가 발생했을 경우 문제를 진단하고 싶을때 필요한 자세한 정보를 기록한다.
         개발시 디버그 용도로 사용하는 메세지를 나타낸다.
TRACE : 디버그 레벨이 너무 광범위한 것을 해결하기 위해서 좀더 상세한 이벤트를 나타낸다.







*/
