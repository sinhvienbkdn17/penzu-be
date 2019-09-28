package vn.ladudu.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.ladudu.model.User;
import vn.ladudu.repository.login.LoginRepository;

import java.util.Optional;

@Service
public class LoginService implements ILoginService{
    @Autowired
    LoginRepository loginRepository;

    @Override
    public boolean checkUser(String email, String password) {
         boolean isValid = false;
         if(!StringUtils.isEmpty(email.trim()) && !StringUtils.isEmpty(password.trim())) {
             Optional<User> user = loginRepository.findByEmailAndPassword(email, password);
             if(user.isPresent()){
                 isValid = true;
             }
         }
         return isValid;
    }
}
