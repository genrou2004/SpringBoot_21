package com.raya.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    //Long CountByEmail(String email);
    Long CountByUsername(String username);

    Long countByEmail(String email);
}
