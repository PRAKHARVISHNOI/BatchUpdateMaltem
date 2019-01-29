package com.maltem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.maltem.model.TransactionDetailMessage;
import com.maltem.service.TaskService;
import com.maltem.service.impl.TaskServiceImpl;

@RestController
@RequestMapping(value = "/service")
public class DataController {
	
	@Autowired
	TaskServiceImpl taskService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Boolean updateTask(@RequestBody TransactionDetailMessage transactionDetailMessage) {
		
		return taskService.updateMessage(transactionDetailMessage);
		
	}
	
	@GetMapping("/test")
	public Object getData() {
		
		return new Object();
		
	}
	

}
