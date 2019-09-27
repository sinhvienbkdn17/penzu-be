package vn.ladudu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ArticleTag")
public class ArticleTag {
    private Long ArticleId;
    private Long TagId;
}
