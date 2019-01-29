package com.maltem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maltem.dao.TaskDao;
import com.maltem.model.Message;
import com.maltem.repository.MessageRepository;

@Repository("TaskDao")
public class TaskDaoImpl implements TaskDao {

	@Autowired
	MessageRepository messageRepository;

	@Override
	public Boolean updateMessage(Message message) {
		messageRepository.save(message);
		return true;
	}

	@Override
	public List<Message> getMessageList(Long stTime, Long endTime) {
		return messageRepository.findAllByTimestampLessThanEqualAndTimestampGreaterThanEqual(endTime, stTime);
	}

}
