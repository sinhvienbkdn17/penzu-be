package vn.ladudu.repository.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ladudu.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<User,Long> {
    Optional<String> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
