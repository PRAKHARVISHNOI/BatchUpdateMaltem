package com.maltem.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;
import com.maltem.model.RequestDetailMessage;
import com.maltem.model.ResponseDetailMessage;
import com.maltem.service.TaskService;

@Service("TaskService")
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskUpdationServiceImpl taskUpdationServiceImpl;
	
	@Autowired
	TaskDao taskDao ;

	@Override
	public Boolean updateMessage(RequestDetailMessage transactionDetailMessage) {
		return taskUpdationServiceImpl.taskUpdation(transactionDetailMessage);
	}

	@Override
	public ResponseDetailMessage getMessage(Long stTime, Long endTime) {
		List<Message> messageList= taskDao.getMessageList(stTime, endTime);
		ResponseDetailMessage transactionDetailMessage= new ResponseDetailMessage();
		transactionDetailMessage.setTimeStamp(new Date().getTime());
		if(!CollectionUtils.isEmpty(messageList)){
			transactionDetailMessage.setStatus("success");
			transactionDetailMessage.setUpdates(messageList);
			
		}
		else{
			transactionDetailMessage.setStatus("failure");
		}
		return transactionDetailMessage;
		
	}

}
