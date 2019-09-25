package vn.ladudu;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ArticleTag")
public class ArticleTag {
    private Long ArticleId;
    private Long TagId;
}
