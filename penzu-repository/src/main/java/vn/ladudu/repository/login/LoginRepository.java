package vn.ladudu.repository.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ladudu.model.User;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<User,Long> {
    boolean findBy()
}
