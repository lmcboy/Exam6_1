package com.hand.main;

import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hand.javabean.Film;
import com.hand.jdbc.FilmJDBCTemplate;
import com.hand.publisher.AfterInsertPublisher;
import com.hand.publisher.BeforeInsertPublisher;

public class Main {
	public static void main(String[] args){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmJDBCTemplate filmJDBCTemplate = (FilmJDBCTemplate) context.getBean("jt_film");
		Film film = (Film) context.getBean("film");
		BeforeInsertPublisher bip = 
			      (BeforeInsertPublisher) context.getBean("beforeInsertPublisher");
		AfterInsertPublisher aip = 
			      (AfterInsertPublisher) context.getBean("afterInsertPublisher");
		context.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入电影名称(title):");
		String title = sc.nextLine();
		System.out.println("请输入电影描述(description):");
		String description = sc.nextLine();
		System.out.println("请输入语言ID(language_id):");
		int language_id = sc.nextInt();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
//		System.out.println("--Before Insert Film Data");
		bip.publish();
		filmJDBCTemplate.insert(film);
		aip.publish();
//		System.out.println("--After Insert Film Data");
		context.stop();
		System.exit(1);		
	}
}
