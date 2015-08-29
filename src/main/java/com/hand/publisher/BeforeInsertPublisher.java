package com.hand.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.hand.event.BeforeInsertEvent;

public class BeforeInsertPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	public void publish(){
		BeforeInsertEvent ie = new BeforeInsertEvent(this);
	    publisher.publishEvent(ie);
	}

}
