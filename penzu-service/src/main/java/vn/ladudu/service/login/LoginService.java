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
    public boolean checkPassword(String email, String password) {
        List<User> users =loginRepository.findAll();
        for(User u: users){
            if(u.getEmail().equals(email) && u.getPassword().equals(password))
                return true;
        }
        return false;
    }

    @Override
    public boolean checkEmail(String email) {
        List<User> users = loginRepository.findAll();
        for(User u: users){
            if (u.getEmail().equals(email))
                return true;
        }
        return false;
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
