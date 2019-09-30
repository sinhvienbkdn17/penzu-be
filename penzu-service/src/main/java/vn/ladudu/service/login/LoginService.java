package vn.ladudu.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.ladudu.model.User;
import vn.ladudu.repository.login.LoginRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService implements ILoginService{
    @Autowired
    LoginRepository loginRepository;

    @Override
    public boolean checkEmail(String email) {
        boolean isEmailValid = false;
        if(!StringUtils.isEmpty(email.trim().toLowerCase())){
            Optional<String> validEmail = loginRepository.findByEmail(email);
            isEmailValid = validEmail.isPresent();
        }

        return isEmailValid;
    }

    @Override
    public boolean checkPasswordByEmail(String email, String password) {
        boolean isPasswordValid = false;
        if(!StringUtils.isEmpty(password)){
            Optional<User> user = loginRepository.findByEmailAndPassword(email, password);
            isPasswordValid = user.isPresent();
        }
        return  isPasswordValid;
    }



//    @Override
//    public boolean checkUser(String email, String password) {
//         boolean isValid = false;
//         if(!StringUtils.isEmpty(email.trim()) && !StringUtils.isEmpty(password.trim())) {
//             Optional<User> user = loginRepository.findByEmailAndPassword(email, password);
//             if(user.isPresent()){
//                 isValid = true;
//             }
//         }
//         return isValid;
//    }

}
