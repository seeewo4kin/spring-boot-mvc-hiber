package kata.academy.springbootmvchiber.service;



import kata.academy.springbootmvchiber.model.User;

import java.util.List;

public interface UserService  {
    List<User> getAllUsers();
    User getUserById(Integer userId);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);
}
