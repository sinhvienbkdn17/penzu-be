package vn.ladudu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.ladudu.model.User;
import vn.ladudu.repository.UserRepository;
import vn.ladudu.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {

        return null;
    }

    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id).get();
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
