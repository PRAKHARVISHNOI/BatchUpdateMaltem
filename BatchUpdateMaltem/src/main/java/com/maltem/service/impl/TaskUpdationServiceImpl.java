package com.maltem.service.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maltem.model.TransactionDetailMessage;


@Service
public class TaskUpdationServiceImpl {
	@Autowired
	TaskUpdationService askUpdationService;
	
	
	TransactionDetailMessage transactionDetailMessage;
	ExecutorService executorService = Executors.newFixedThreadPool(100);

	
	public Boolean taskUpdation (TransactionDetailMessage transactionDetailMessage){
		
		transactionDetailMessage.getUpdates().forEach(message ->{
			executorService.execute(new TaskUpdationService(message));
		});
		return true;
		
	}
	
	
	
}
