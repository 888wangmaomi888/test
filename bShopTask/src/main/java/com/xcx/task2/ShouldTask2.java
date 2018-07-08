package com.xcx.task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.xcx.dao.TestMapper;


@Component
public class ShouldTask2 {
    @Autowired
	private TestMapper testMapper;
	
	@Scheduled(cron="0/10 * * * * ?")
	public void  test1(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data=sdf.format(new Date());
		
		System.out.println("=============="+data+"=============");
		
		List<Map<String,Object>> list= testMapper.findList(new HashMap<String,Object>());
		
		System.out.println("========="+list.toString());
		
	}
	
}
