package vn.ladudu;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Title;
    private String AliasTitle;
    private String Content;
    private Date CreatedDate;
    private Date LastModifiedDate;
    private boolean IsPublic;
    private String MessagePublic;
    private Long UserId;
    private Long ArticleTypeId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAliasTitle() {
        return AliasTitle;
    }

    public void setAliasTitle(String aliasTitle) {
        AliasTitle = aliasTitle;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    public boolean isPublic() {
        return IsPublic;
    }

    public void setPublic(boolean aPublic) {
        IsPublic = aPublic;
    }

    public String getMessagePublic() {
        return MessagePublic;
    }

    public void setMessagePublic(String messagePublic) {
        MessagePublic = messagePublic;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getArticleTypeId() {
        return ArticleTypeId;
    }

    public void setArticleTypeId(Long articleTypeId) {
        ArticleTypeId = articleTypeId;
    }
}
