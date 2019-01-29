package com.maltem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maltem.model.TransactionDetailMessage;
import com.maltem.service.TaskService;

@Service("TaskService")
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskUpdationServiceImpl taskUpdationServiceImpl;

	@Override
	public Boolean updateMessage(TransactionDetailMessage transactionDetailMessage) {
		return taskUpdationServiceImpl.taskUpdation(transactionDetailMessage);
	}

	@Override
	public TransactionDetailMessage getMessage(Long stTime, Long endTimne) {
		return null;
	}

}
