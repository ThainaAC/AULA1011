package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import application.Repository.UserRepository;


public class AppUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository UserRepo;

    @Override
    public UserDetails loadUserByUsername(String username)
    throws UsernameNotFoundException {
    User user = userRepo.findByUsername(username)
    }

   
    
}
