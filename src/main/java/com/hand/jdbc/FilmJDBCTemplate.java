package com.hand.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.hand.dao.FilmDao;
import com.hand.javabean.Film;
@Controller
public class FilmJDBCTemplate implements FilmDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	public boolean insert(Film film) {
		String title = film.getTitle();
		String description = film.getDescription();
		int language_id = film.getLanguage_id();
		String sql = "INSERT INTO film (title,description,language_id) values (?,?,?)";
		try{
			jdbcTemplateObject.update(sql,title,description,language_id);
		}catch(Exception e){
			System.out.println("======插入失败======");
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
