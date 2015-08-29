package com.hand.event;
import org.springframework.context.ApplicationEvent;

public class AfterInsertEvent extends ApplicationEvent {

	public AfterInsertEvent(Object source) {
		super(source);
	}
	public String toString(){
		return "After Insert Film Data";
	}
}
