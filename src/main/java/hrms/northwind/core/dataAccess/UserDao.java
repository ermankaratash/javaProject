package hrms.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{

	User getByEmail(String email);
}
