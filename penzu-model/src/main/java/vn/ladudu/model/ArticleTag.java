package vn.ladudu.model;

import javax.persistence.*;

@Entity
@Table(name = "ArticleTag")
public class ArticleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long ArticleId;
    private Long TagId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getArticleId() {
        return ArticleId;
    }

    public void setArticleId(Long articleId) {
        ArticleId = articleId;
    }

    public Long getTagId() {
        return TagId;
    }

    public void setTagId(Long tagId) {
        TagId = tagId;
    }
}
