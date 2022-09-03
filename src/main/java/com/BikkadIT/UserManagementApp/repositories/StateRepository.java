package com.BikkadIT.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApp.entities.StateMasterEntity;

@Repository
public interface StateRepository extends JpaRepository<StateMasterEntity, Integer> {

}
