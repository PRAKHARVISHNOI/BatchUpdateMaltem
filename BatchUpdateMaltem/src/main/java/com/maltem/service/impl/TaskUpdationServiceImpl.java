package com.maltem.service.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maltem.dao.TaskDao;
import com.maltem.model.RequestDetailMessage;

@Service
public class TaskUpdationServiceImpl {

	@Autowired
	TaskDao taskDao;

	ExecutorService executorService = Executors.newFixedThreadPool(100);

	public Boolean taskUpdation(RequestDetailMessage transactionDetailMessage) {
		try{
		transactionDetailMessage.getUpdates().forEach(message -> {
			executorService.execute(new TaskUpdationService(taskDao, message));
		});
		}
		catch(Exception  e){
			return false;
		}
		return true;
	}

}
