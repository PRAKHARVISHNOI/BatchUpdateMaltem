package com.maltem.dao;

import java.util.List;

import com.maltem.model.Message;

public interface TaskDao {

	
	Boolean updateMessage(Message message);
	List<Message> getMessageList(Long stTime, Long endTime);
	
}
