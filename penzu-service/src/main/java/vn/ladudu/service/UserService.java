package vn.ladudu.service;

import vn.ladudu.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User findById(Long id);

    void save(User user);
}
