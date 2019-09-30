package vn.ladudu.service.login;

import vn.ladudu.model.User;

import java.util.List;

public interface ILoginService {
    boolean checkPasswordByEmail(String email, String password);
    boolean checkEmail(String email);
}
