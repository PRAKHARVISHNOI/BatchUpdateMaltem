package com.maltem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;

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
