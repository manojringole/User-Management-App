package com.BikkadIT.UserManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApp.entities.CityMasterEntity;

@Repository
public interface CityRepository extends JpaRepository<CityMasterEntity, Integer> {

}
