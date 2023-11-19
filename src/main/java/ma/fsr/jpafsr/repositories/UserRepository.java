package ma.fsr.jpafsr.repositories;

import ma.fsr.jpafsr.enteties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
