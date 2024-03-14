package kata.academy.springbootmvchiber.dao;

import kata.academy.springbootmvchiber.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Integer userId);
    public void saveUser(User user);

    void updateUser(User user);
    void deleteUser(Integer uwerId);
}
