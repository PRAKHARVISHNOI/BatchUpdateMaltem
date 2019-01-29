package com.maltem.service;

import com.maltem.model.RequestDetailMessage;
import com.maltem.model.ResponseDetailMessage;

public interface TaskService {

	Boolean updateMessage(RequestDetailMessage transactionDetailMessage);

	ResponseDetailMessage getMessage(String startTime, String endTimne);
}
