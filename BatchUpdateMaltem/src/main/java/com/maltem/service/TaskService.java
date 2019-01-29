package com.maltem.service;

import com.maltem.model.TransactionDetailMessage;

public interface TaskService {

	Boolean updateMessage(TransactionDetailMessage transactionDetailMessage);

	TransactionDetailMessage getMessage(Long stTime, Long endTimne);
}
