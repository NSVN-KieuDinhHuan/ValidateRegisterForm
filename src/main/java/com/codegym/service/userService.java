package com.codegym.service;

import com.codegym.model.User;
import com.codegym.repository.UserReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class userService implements IUserService{
    @Autowired
    private UserReository userReository;
    @Override
    public Page<User> findAll(Pageable pageable) {
        return userReository.findAll(pageable);
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
