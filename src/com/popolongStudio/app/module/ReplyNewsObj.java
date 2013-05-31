package com.popolongStudio.app.module;

import java.util.List;

public class ReplyNewsObj extends ReplyObj {
	private List<Article> ArticleLS=null;

	public List<Article> getArticleLS() {
		return ArticleLS;
	}

	public void setArticleLS(List<Article> articleLS) {
		ArticleLS = articleLS;
	}
}
