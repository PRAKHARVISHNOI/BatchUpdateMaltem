package com.maltem.service.impl;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;

public class TaskUpdationService implements Runnable {

	TaskDao taskDao;

	Message message;

	public TaskUpdationService(TaskDao taskDao, Message message) {
		super();
		this.taskDao = taskDao;
		this.message = message;
	}

	@Override
	public void run() {
		taskDao.updateMessage(message);
	}

}
