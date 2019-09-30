package vn.ladudu.controller.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.ladudu.model.User;
import vn.ladudu.service.login.LoginService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity checkUserLogin(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        if(loginService.checkEmail(email)){
            if(loginService.checkPasswordByEmail(email,password))
                return new ResponseEntity(HttpStatus.OK);
            else
                return  new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
    }
}
