package Test.service;


import Test.model.User;
import Test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void getAll(){
        List<User> users = userRepository.findAll();
        users.stream().forEach(e ->{
            System.out.println(e);
        });
    }
}
