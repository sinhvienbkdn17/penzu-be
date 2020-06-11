package vn.ladudu.service.createarticle;

import vn.ladudu.model.Article;

public interface ICreateArticleService {
    void save(Article article, Long userID);
    boolean checkUserId(Long id);
}
