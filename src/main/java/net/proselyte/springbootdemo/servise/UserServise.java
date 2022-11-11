package net.proselyte.springbootdemo.servise;



import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServise {
    @Autowired
    private final UserRepository userRepository;
    private UserServise (UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public User findById(Long id){
        return userRepository.getOne(id);

    }
    public List <User> finfAll(){
        return userRepository.findAll();

    }
    public User saveUser(User user){
        return userRepository.save(user);

    }
    public void deleteById( Long id){
        userRepository.deleteById(id);
    }
}
