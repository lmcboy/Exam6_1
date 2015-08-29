package com.hand.main;

import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hand.javabean.Film;
import com.hand.jdbc.FilmJDBCTemplate;


public class Main {
	public static void main(String[] args){
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmJDBCTemplate filmJDBCTemplate = (FilmJDBCTemplate) context.getBean("jt_film");
		Film film = (Film) context.getBean("film");
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
		filmJDBCTemplate.insert(film);
		context.stop();
		System.exit(1);		
	}
}
