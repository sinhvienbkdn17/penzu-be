package vn.ladudu.service.edit;

import vn.ladudu.model.User;

public interface IEditUserService {
    boolean checkUserExist(String email);

    void save(User user);
}
