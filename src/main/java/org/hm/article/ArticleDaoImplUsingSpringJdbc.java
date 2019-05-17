package org.hm.article;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



/**
 * 인터페이스 MemberDao의 구현체. SpringJdbc를 사용해서 구현
 * 
 * @author Jacob
 */
@Repository("articleDao")
public class ArticleDaoImplUsingSpringJdbc implements ArticleDao {

	static final String INSERT = "INSERT article(title, content,userId, name) VALUES(?, ?, ?, ?)";

	static final String SELECT_ALL = "SELECT articleId,userId, title, content, name, left(cdate,19) cdate FROM article ORDER BY articleId desc LIMIT ?,?";

	static final String COUNT_ALL = "SELECT count(articleId) count FROM article";

	static final String GET_ALL =  "SELECT articleId, title, userId, content, name, udate FROM article WHERE articleId=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	final RowMapper<Article> articleRowMapper = new BeanPropertyRowMapper<>(
										Article.class);


@Override
public Article selectByTitle(String title) {
	// TODO selectByEmail() 메서드 구현
	return null;
}

@Override
public int insert(Article article) {
	return jdbcTemplate.update(INSERT, article.getTitle(), article.getContent(),
										"2016041072","정해민 ");
}
@Override
public void update(Article article) {
	// TODO update() 메서드 구현
}

@Override
public List<Article> selectAll(int offset, int count) {
	return jdbcTemplate.query(SELECT_ALL, articleRowMapper, offset, count);
}

@Override
public int countAll() {
	return jdbcTemplate.queryForObject(COUNT_ALL, Integer.class);
}

public static void main(String[] args) {
	
}
@Override
public Article getAll(int articleId) {
	return jdbcTemplate.queryForObject(GET_ALL,
			new BeanPropertyRowMapper<>(Article.class), articleId);
}

@Override
public org.hm.article.Article getAll(org.hm.article.Article articleID) {
	// TODO Auto-generated method stub
	return null;
}




}