package vn.ladudu.controller.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.ladudu.service.login.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("login")
    public ResponseEntity checkUserLogin(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        if(loginService.checkUser(email, password)){
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
