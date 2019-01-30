package com.maltem.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;
import com.maltem.repository.MessageRepository;

@Repository("TaskDao")
public class TaskDaoImpl implements TaskDao {
	private static final Logger Logger = LoggerFactory.getLogger(TaskDaoImpl.class);
	@Autowired
	MessageRepository messageRepository;

	@Override
	public Boolean updateMessage(Message message) {
		Logger.info("Enter TaskDaoImpl method updateMessage: Param # " + message);
		try{
		messageRepository.save(message);
		return true;
		}catch(Exception e){
			return false;
		}
		
	}

	@Override
	public List<Message> getMessageList(Long stTime, Long endTime) {
		Logger.info("Enter TaskDaoImpl method getMessageList: Param # " + stTime+"_"+endTime);
		return messageRepository.findAllByTimestampLessThanEqualAndTimestampGreaterThanEqual(endTime, stTime);
	}

}
