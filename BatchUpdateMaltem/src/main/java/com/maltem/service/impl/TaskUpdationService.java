package com.maltem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;
@Component
public class TaskUpdationService implements Runnable {

	
	@Autowired
	TaskDao taskDao;
	
	Message message;
	
	public TaskUpdationService(Message message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		
		taskDao.updateMessage(message);
		
	}

}
