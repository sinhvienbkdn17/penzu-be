package vn.ladudu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Path;
    private Date CreatedDate;
    private Long ArticleId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Long getArticleId() {
        return ArticleId;
    }

    public void setArticleId(Long articleId) {
        ArticleId = articleId;
    }
}
