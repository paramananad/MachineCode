package Test.controller;


import Test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public class UserController {

@Autowired
    UserService userService;

    @GetMapping("/fetchAll")
    public String getUsers(){
       userService.getAll();
       return "hi";
    }

}
