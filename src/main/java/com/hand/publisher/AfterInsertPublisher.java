package com.hand.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.hand.event.AfterInsertEvent;

public class AfterInsertPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	public void publish(){
		AfterInsertEvent ie = new AfterInsertEvent(this);
	    publisher.publishEvent(ie);
	}

}
