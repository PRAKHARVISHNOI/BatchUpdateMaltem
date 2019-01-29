package com.maltem.service.impl;

import org.springframework.stereotype.Service;

import com.maltem.model.TransactionDetailMessage;
import com.maltem.service.TaskService;

@Service("TaskService")
public class TaskServiceImpl implements TaskService{

	
	/*@Autowired
	TaskUpdationServiceImpl taskUpdationServiceImpl;
	*/
	
	@Override
	public Boolean updateMessage(TransactionDetailMessage transactionDetailMessage) {
		return null;
		// TODO Auto-generated method stub
		//return taskUpdationServiceImpl.taskUpdation(transactionDetailMessage);
	}

	@Override
	public TransactionDetailMessage getMessage(Long stTime, Long endTimne) {
		// TODO Auto-generated method stub
		return null;
	}

}
