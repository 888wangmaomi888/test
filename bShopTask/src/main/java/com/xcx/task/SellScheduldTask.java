package com.xcx.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//@Component
public class SellScheduldTask {
    
	//每十秒
	@Scheduled(cron="0/10 * * * * ?")
	public void SellCount(){
		System.out.println("=====================");
	}
	
	//当天的销量统计（每天十二点触发）
	@Scheduled(cron="0 0 12 * * ? ")
	public void SellDay(){
		
	}
	
	
}
