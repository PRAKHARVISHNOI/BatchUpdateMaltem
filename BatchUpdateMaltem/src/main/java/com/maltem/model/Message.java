package com.maltem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter 
@Setter 
@NoArgsConstructor

@Entity
@Table(name = "message")
public class Message {

	private String name;
	private String git;
	private Long timestamp;
	
	public Message(String name, String git, Long timestamp) {
		super();
		this.name = name;
		this.git = git;
		this.timestamp = timestamp;
	}
	
	
}
