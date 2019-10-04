package vn.ladudu.controller.createarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.ladudu.model.Article;
import vn.ladudu.service.createarticle.CreateArticleService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/Article")
public class CreateArticleController {

    @Autowired
    CreateArticleService createArticleService;

    @PostMapping("/create")
    public ResponseEntity createArticle(@RequestBody Article article, HttpSession session){
        Long userID = (Long)session.getAttribute("userID");
        if(createArticleService.checkUserId(userID)){
            createArticleService.save(article, userID);
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

    }
}
