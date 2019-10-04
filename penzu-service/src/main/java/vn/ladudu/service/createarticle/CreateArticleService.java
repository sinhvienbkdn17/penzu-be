package vn.ladudu.service.createarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.ladudu.model.Article;
import vn.ladudu.model.User;
import vn.ladudu.repository.createarticle.ICreateArticleRepository;
import vn.ladudu.repository.login.LoginRepository;
import vn.ladudu.service.login.LoginService;

import java.text.SimpleDateFormat;
import java.util.Optional;

@Service
public class CreateArticleService implements ICreateArticleService {

    @Autowired
    ICreateArticleRepository createArticleRepository;

    @Autowired
    LoginService loginService;

    @Override
    public void save(Article article, Long userID) {
        article.setUserId(userID);
        if(StringUtils.isEmpty(article.getTitle()) && !StringUtils.isEmpty(article.getContent())) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("E. dd/MMM/yyyy");
            String strDate = dateFormat.format(article.getCreatedDate());
            article.setTitle(strDate);
            createArticleRepository.save(article);
        }
        if(!StringUtils.isEmpty(article.getTitle())){
            createArticleRepository.save(article);
        }
    }

    @Override
    public boolean checkUserId(Long id) {
        if(loginService.checkUserId(id)){
            return true;
        } else {
            return false;
        }

    }
}
