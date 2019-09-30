package vn.ladudu.controller.edit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.ladudu.model.User;
import vn.ladudu.service.edit.EditUserService;

@RestController
@RequestMapping(name = "/api")
public class EditUserController {
    @Autowired
    EditUserService editUserService;

//    @GetMapping("/edit")
//    public ResponseEntity checkUserEmail(@RequestParam(value = "email") String email) {
//        if (editUserService.checkUserExist(email)) {
//            return new ResponseEntity(HttpStatus.OK);
//        } else {
//            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
//        }
//    }

    @PostMapping("/edit/{email}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @RequestParam(value = "email") String email) {
        if (editUserService.checkUserExist(email)) {
            editUserService.save(user);
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
    }


}
