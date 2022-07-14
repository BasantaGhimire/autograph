package com.autograph.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        System.out.println("Add user info");
        return userService.saveUser(user);
    }
    @GetMapping
    public List<User> getAllUsers(){
        System.out.println("All user information");
        return userService.getAllUsers();
    }
    @GetMapping("/{Id}")
    public Optional<User> getById(@PathVariable ("Id") final String Id) {
        System.out.println("One User information get based for the given ID");
        return userService.getById(Id);
    }
    @PutMapping("/{Id}")
    public User updateUser (@RequestBody User user){
        System.out.println("Update an user information by Id" );
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name="Id")String Id){
        System.out.println("Delete an user information by Id" );
        userService.deleteUser(Id);
    }

}
