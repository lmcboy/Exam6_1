package com.hand.handler;

import org.springframework.context.ApplicationListener;

import com.hand.event.AfterInsertEvent;

public class AfterInsertFilmEventHandler implements ApplicationListener<AfterInsertEvent> {

	public void onApplicationEvent(AfterInsertEvent event) {
		System.out.println(event.toString());		
	}

}
