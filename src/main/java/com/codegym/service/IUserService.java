package com.codegym.service;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IUserService {
    Page<User> findAll(Pageable pageable);
    Iterable<User>findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void removeById(Long id);
}
