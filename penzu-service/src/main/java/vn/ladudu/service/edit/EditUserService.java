package vn.ladudu.service.edit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.ladudu.model.User;
import vn.ladudu.repository.edituser.EditUserRepository;

import java.util.Optional;

@Service
public class EditUserService implements IEditUserService {
    @Autowired
    EditUserRepository editUserRepository;

    @Override
    public boolean checkUserExist(String email) {
        Optional<User> user = editUserRepository.findByEmail(email);

        // check user co ton tai hay khong
        return user.isPresent();
    }

    @Override
    public void save(User user) {
        editUserRepository.save(user);
    }
}
