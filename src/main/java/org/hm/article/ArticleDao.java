package org.hm.article;

import java.util.List;




/**
 * p.184 [리스트 8.2] MemberDao 를 interface로 수정<br>
 * 회원 테이블을 조작하는 Data Access Object
 * 
 * @author Jacob
 */
public interface ArticleDao {

	/**
	 * 타이틀 정보를 가져옴 
	 */
	Article selectByTitle(String title);


	/**
	 * 게시글 저장
	 */
	int insert(Article article);

	/**
	 * 게시글 수정
	 */
	void update(Article article);

	/**
	 * 게시글 목록
	 */
	List<Article> selectAll(int offset, int count);
	
	int countAll();

Article getAll(Article article);


Article getAll(int articleId);
}