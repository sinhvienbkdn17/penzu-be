package vn.ladudu.repository.createarticle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ladudu.model.Article;

@Repository
public interface ICreateArticleRepository extends JpaRepository<Article, Long> {
}
