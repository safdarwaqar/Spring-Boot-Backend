package com.safdar.angular.repository;

import org.springframework.data.repository.CrudRepository;

import com.safdar.angular.model.UserDetails;

public interface LoginRepository extends CrudRepository<UserDetails, Long> {

}
