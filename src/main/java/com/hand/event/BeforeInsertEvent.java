package com.hand.event;
import org.springframework.context.ApplicationEvent;

public class BeforeInsertEvent extends ApplicationEvent {

	public BeforeInsertEvent(Object source) {
		super(source);
	}
	public String toString(){
		return "Before Insert Film Data";
	}
}
