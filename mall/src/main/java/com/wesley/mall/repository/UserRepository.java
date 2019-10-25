package com.wesley.mall.repository;

import com.wesley.mall.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    boolean findUserByUserNameAndPassword(String userName, String password);

}
