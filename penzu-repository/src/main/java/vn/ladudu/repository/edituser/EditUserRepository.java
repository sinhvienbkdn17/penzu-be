package vn.ladudu.repository.edituser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ladudu.model.User;

import java.util.Optional;

@Repository
public interface EditUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // return object null ?
}
