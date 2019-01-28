package com.maltem.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@ToString
@Getter 
@Setter 
@NoArgsConstructor
public class TransactionDetailMessage {

  private String source;
  private Long timeStamp;
  private List <Message> messageList;
public TransactionDetailMessage(String source, Long timeStamp, List<Message> messageList) {
	super();
	this.source = source;
	this.timeStamp = timeStamp;
	this.messageList = messageList;
}
	
	
	
	
}
