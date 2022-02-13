package com.muthu.sampleProject.Microservices_User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.sampleProject.Microservices_User.Entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
