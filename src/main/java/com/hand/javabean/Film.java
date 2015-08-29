package com.hand.javabean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Film {
	private String title;
	private String description;
	private int language_id;
	public String getTitle() {
		return title;
	}
	@Autowired(required=false)
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	@Autowired(required=false)
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLanguage_id() {
		return language_id;
	}
	@Autowired(required=false)
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	
}
