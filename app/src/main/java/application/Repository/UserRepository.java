package application.Repository;

import org.springframework.data.repository.CrudRepository;

import application.model.user;

public interface UserRepository extends CrudRepository <user, Long>{
    public user findbyUser (String username);
    
}
