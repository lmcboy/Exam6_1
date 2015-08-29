package com.hand.handler;

import org.springframework.context.ApplicationListener;

import com.hand.event.BeforeInsertEvent;

public class BeforeInsertFilmEventHandler implements ApplicationListener<BeforeInsertEvent> {

	public void onApplicationEvent(BeforeInsertEvent event) {
		System.out.println(event.toString());
	}

}
