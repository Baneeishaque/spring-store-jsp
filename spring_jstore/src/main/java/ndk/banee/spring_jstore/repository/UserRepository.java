package ndk.banee.spring_jstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ndk.banee.spring_jstore.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
