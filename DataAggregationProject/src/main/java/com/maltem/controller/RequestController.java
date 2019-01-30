package com.maltem.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.maltem.dataRepo.DataRepo;
import com.maltem.model.RequestDetailMessage;
import com.maltem.service.UpdationTask;

@RestController
public class RequestController {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	public ApplicationEventPublisher eventPublisher;

	@GetMapping("docontinuousinput")
	public void getLiveAttributeDetails() throws InterruptedException, ExecutionException {
		ExecutorService nonBlockingService = Executors.newSingleThreadExecutor();
		
		while(true){
		Future<RequestDetailMessage> future = nonBlockingService
				.submit(new UpdationTask(restTemplate, DataRepo.getRandomObject()));
			System.out.println(future.get());
		Thread.sleep(900000);
		}
	}

	
	
	
	
}
