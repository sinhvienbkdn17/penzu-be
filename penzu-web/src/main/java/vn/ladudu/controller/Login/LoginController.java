package vn.ladudu.controller.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.ladudu.service.login.LoginService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity checkUserLogin(@RequestParam(value = "email") String email,
                @RequestParam(value = "password") String password, HttpSession session) {
        if(loginService.checkEmail(email)){
            if(loginService.checkPasswordByEmail(email,password)){
                Long userID = loginService.getIdByEmail(email);
                session.setAttribute("userID", userID);
                return new ResponseEntity(HttpStatus.OK);
            }
            else {
                return new ResponseEntity(HttpStatus.UNAUTHORIZED);
            }
        }
        return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
    }
}
