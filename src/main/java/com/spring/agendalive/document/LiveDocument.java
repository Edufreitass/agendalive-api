package com.spring.agendalive.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LiveDocument {

	@Id
	private String id;
	private String liveName;
	private String channelName;
	private LocalDateTime liveDate;
	private String liveLink;
	private LocalDateTime registrationDate;
	
	public String getId() {
		return id;
	}
	public String getLiveName() {
		return liveName;
	}
	public String getChannelName() {
		return channelName;
	}
	public LocalDateTime getLiveDate() {
		return liveDate;
	}
	public String getLiveLink() {
		return liveLink;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
}
