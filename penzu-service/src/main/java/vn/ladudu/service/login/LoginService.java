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
    public boolean checkEmail(String email) {
        boolean isEmailValid = false;
        if(!StringUtils.isEmpty(email.trim().toLowerCase())){
            Optional<User> user = loginRepository.findByEmail(email);
            isEmailValid = user.isPresent();
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


    @Override
    public Long getIdByEmail(String email) {
        if(!StringUtils.isEmpty(email.trim())){
            Optional<User> user = loginRepository.findByEmail(email);
            if(user.isPresent()){
                return user.get().getId();
            }
        }
        return null;
    }

    @Override
    public boolean checkUserId(Long id) {
        boolean isValid = false;
        if(id != null) {
            Optional<User> user = loginRepository.findById(id);
            if(user.isPresent()){
                isValid = true;
            }
        }
        return isValid;
    }
}
