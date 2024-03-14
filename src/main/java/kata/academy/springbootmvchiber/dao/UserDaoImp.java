package kata.academy.springbootmvchiber.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import kata.academy.springbootmvchiber.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImp() {

    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User ").getResultList();
    }

    @Override
    public User getUserById(Integer userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        entityManager.remove(getUserById(userId));
    }
}
