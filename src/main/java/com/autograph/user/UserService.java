package com.autograph.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getById(final String Id) {
        return userRepository.findById(Id);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
        /*return userRepository.findById(Id)
                .flatMap(currentUser->{
                    currentUser.setAddress(user.getAddress());
                    currentUser.setAge(user.getAge());
                    currentUser.setName(user.getName());

                    return userRepository.save(currentUser)
                };)
                .map(updateUser->(user));*/
    }

    public void deleteUser(String Id) {
        userRepository.deleteById(Id);
    }




/*


    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }

 */
}
